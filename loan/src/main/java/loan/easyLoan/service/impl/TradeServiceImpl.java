package loan.easyLoan.service.impl;

import loan.easyLoan.entity.*;
import loan.easyLoan.mapper.TradeMapper;
import loan.easyLoan.service.*;
import loan.easyLoan.util.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/11 9:02
 */
@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeMapper tradeMapper;

    @Autowired
    private RechargeRecordService rechargeRecordService;

    @Autowired
    private BorrowerAccountService borrowerAccountService;

    @Autowired
    private LenderAccountService lenderAccountService;

    @Autowired
    private BorrowMoneyFlowService borrowMoneyFlowService;

    @Autowired
    private TradeService tradeService;

    @Autowired
    private RepayMoneyFlowService repayMoneyFlowService;

    @Autowired
    private TimeUtils timeUtils;

    private static final Logger logger = LoggerFactory.getLogger("TradeService.class");

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Override
    public String judgeDeadline(int serialNumber) {
        int payType = tradeMapper.selectPayType(serialNumber);

        Date exactDate = tradeMapper.selectExactDate(serialNumber);
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Calendar exactDate1 = Calendar.getInstance();
        Calendar currentDate = Calendar.getInstance();
        exactDate1.setTime(exactDate);
        currentDate.setTime(date);
        int result = currentDate.get(Calendar.MONTH) - exactDate1.get(Calendar.MONTH);
        int month = (currentDate.get(Calendar.YEAR) - exactDate1.get(Calendar.YEAR)) * 12;

        if(payType==1){
            exactDate1.add(Calendar.MONTH,Math.abs(month + result)+1);
            return dateFormat.format(exactDate1.getTime());
        }else{
            exactDate1.add(Calendar.MONTH,(Math.abs(month + result)/3)*3+3);
            return dateFormat.format(exactDate1.getTime());
        }
    }


    @Override
    public List<Trade> selectPendingRepayment(String inBoundAccount) {
        return tradeMapper.selectPendingRepayment(inBoundAccount);
    }

    @Override
    public List<Trade> selectPendingReceivable(String outBoundAccount) {
        return tradeMapper.selectPendingReceivable(outBoundAccount);
    }

    @Override
    public boolean prepareForTrade() {
       if (tradeMapper.prepareForTrade() == 1){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public int selectBillId() {
        return tradeMapper.selectBillId();
    }

    @Override
    public void establish1(int billId, Date exactDate) {
        tradeMapper.establish1(billId,exactDate);
    }

    @Override
    public void establish2(int billId) {
        tradeMapper.establish2(billId);
    }

    @Override
    public boolean selectIfFinishedRepayment(int billId) {
        int result = tradeMapper.selectIfFinishedRepayment(billId);
        if (result == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Trade> borrowViewFinishedRecord(String inBoundAccount) {
        return tradeMapper.borrowViewFinishedRecord(inBoundAccount);
    }

    @Override
    public List<Trade> lendViewFinishedRecord(String outBoundAccount) {
        return tradeMapper.lendViewFinishedRecord(outBoundAccount);
    }

    @Override
    public void createPendingRepayment(int billId) {
        tradeMapper.createPendingRepayment(billId);
    }

    @Override
    public List<Trade> viewMoneyOfLender() {
        return tradeMapper.viewMoneyOfLender();
    }

    @Override
    public Date selectExactDate(int billId) {
        return tradeMapper.selectExactDate(billId);
    }

    @Override
    public boolean repayUpdate(ArrayList<RepayMoneyFlow> list) {
        int result = tradeMapper.repayUpdate(list);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List selectNextTimePay(int billId) {
        return tradeMapper.selectNextTimePay(billId);
    }

    @Override
    public boolean overdueUpdate(ArrayList<Item> list1) {
        int result = tradeMapper.overdueUpdate(list1);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Trade> selectBadDebt() {
        return tradeMapper.selectBadDebt();
    }

    @Override
    public boolean updateBadDebt(List<Trade> list2) {
        int result = tradeMapper.updateBadDebt(list2);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int selectPayType(int billId) {
        return tradeMapper.selectPayType(billId);
    }

    @Override
    public boolean trade(IntendBorrow intendBorrow, List<IntendLend> intendLends) {
        ArrayList<BorrowMoneyFlow> arrayList = new ArrayList<>();
        List<Trade> list = new ArrayList<>();

        for(IntendLend intendLend : intendLends){
            int serialTrade =  rechargeRecordService.getSerialNumber("trade");
            String inBoundAccount = borrowerAccountService.findFundsAccount(intendBorrow.getIdCard());
            String outBoundAccount = lenderAccountService.findFundsAccount(intendLend.getIdCard());
            double money = intendLend.getLendMoney();
            int limitMonths = intendBorrow.getLimitMonths();
            int payType = intendBorrow.getPayType();
            double payRate = intendBorrow.getPayRate();
            Date exactDate = intendBorrow.getStartDate();
            double repaidPrincipal = 0.0;
            double repaidInterest = 0.0;
            double liquidatedMoney = 0.0;
            double shouldRepayPrincipal;
            double shouldRepayInterest;
            double nextTimePay;
            if(payType==1){
                shouldRepayPrincipal = money/limitMonths;
                shouldRepayInterest = money*payRate;
                nextTimePay = shouldRepayInterest+shouldRepayPrincipal;
            }else {
                shouldRepayPrincipal = money/limitMonths*3;
                shouldRepayInterest = money*payRate*3;
                nextTimePay = shouldRepayInterest+shouldRepayPrincipal;
            }
            double shouldRepayLiquidatedMoney = 0.0;

            Trade trade = new Trade();
            trade.setSerialNumber(serialTrade);
            trade.setBillId(intendBorrow.getBillId());
            trade.setInBoundAccount(inBoundAccount);
            trade.setOutBoundAccount(outBoundAccount);
            trade.setMoney(money);
            trade.setLimitMonths(limitMonths);
            trade.setPayType(payType);
            trade.setPayRate(payRate);
            trade.setExactDate(exactDate);
            trade.setRepaidPrincipal(repaidPrincipal);
            trade.setRepaidInterest(repaidInterest);
            trade.setLiquidatedMoney(liquidatedMoney);
            trade.setShouldRepayPrincipal(shouldRepayPrincipal);
            trade.setShouldRepayInterest(shouldRepayInterest);
            trade.setNextTimePay(nextTimePay);
            trade.setShouldRepayLiquidatedMoney(shouldRepayLiquidatedMoney);
            trade.setFinishedDate(exactDate);

            list.add(trade);


            int serialBorrowMoneyFlow =  rechargeRecordService.getSerialNumber("br_money_flow");
            BorrowMoneyFlow borrowMoneyFlow = new BorrowMoneyFlow();
            borrowMoneyFlow.setBillId(intendBorrow.getBillId());
            borrowMoneyFlow.setExactDate(exactDate);
            borrowMoneyFlow.setInBoundAccount(inBoundAccount);
            borrowMoneyFlow.setOutBoundAccount(outBoundAccount);
            borrowMoneyFlow.setMoney(money);
            borrowMoneyFlow.setSerialNumber(serialBorrowMoneyFlow);

            arrayList.add(borrowMoneyFlow);
            lenderAccountService.updateExpectedIncome(money,lenderAccountService.findFundsAccount(intendLend.getIdCard()),intendBorrow.getPayRate());//更新预期收益

            lenderAccountService.updateAccountBalance(lenderAccountService.findFundsAccount(intendLend.getIdCard()));
        }
        tradeService.insertRecord(list);
        borrowMoneyFlowService.addBorrowFlow(arrayList);

        borrowerAccountService.updateBorrowerAccount(intendBorrow.getIntendMoney(),borrowerAccountService.findFundsAccount(intendBorrow.getIdCard()));
        return true;
    }

    @Override
    public boolean insertRecord(List<Trade> list) {
        if (tradeMapper.insertRecord(list) == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateTradeList(Trade trade) {
        if(tradeMapper.updateTradeList(trade)==1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateAccount(int billId, String money, String exactDate, String idcard) throws ParseException {

        //将money转化为double类型
        double repaymentmoney = Double.parseDouble(money);
        //根据idcard 获取借入者 account
        String inAccount = borrowerAccountService.findFundsAccount(idcard);
        //根据借入者 account 获取 trade 表单中的待还款记录(最好用billid)
        List<Trade> repaymentRecord = selectPendingRepayment(inAccount);

        //判断还款大于账户余额直接返回false
        if(borrowerAccountService.getMoney(inAccount) < repaymentmoney) {
            return false;
        }

        //amountMoney 为该笔交易借入者借入的总金额
        double amountMoney = 0;
        for (Trade tra: repaymentRecord){
            amountMoney += tra.getMoney();
        }

        //将本次还款金额按比例放入rateMoney中
        //List<Double> rateMoney = new ArrayList<Double>();
        for (Trade tra: repaymentRecord){
            //每个借出者收到的应还金额 每笔账单应还金额/借入总金额*本次借款金额
            double outMoney = tra.getMoney() / amountMoney * repaymentmoney;
            //更新每条记录对应的数据
            //判断更新是否成功
            System.out.println(tra.getSerialNumber());
            System.out.println(tra.getBillId());
            System.out.println("******************");

            boolean judegeUpdate = updateEveryRepayment(tra, outMoney);
            //判断更新失败直接跳出
            if (!judegeUpdate) {
                return false;
            }
            //rateMoney.add(outMoney);
            //更新每笔还款信息

        }

        boolean judgeInMoneyFlow;
        /**
         * 4.更新借入方账户余额，并更新信用额度
         */
        judgeInMoneyFlow = borrowerAccountService.updateWithdrawAccount(repaymentmoney, inAccount);

        //更新成功返回true
        if (judgeInMoneyFlow)
            return true;
        return false;
    }

    @Override
    public boolean updateTradeEveryMonth() throws ParseException {    // 每个月进行更新Trade

        logger.info("即将进行Trade更新...");
        List<Trade> tradeList = tradeMapper.getAllActiveTrade();
        for(Trade trade : tradeList){   //遍历tradeList,对每个Trade进行更新检查
            //首先判断是否已完成还款，若已完成则无需更新
            System.out.println("正在检验是否有超过1个月的欠款...");
            if(trade.getExactDate().equals(trade.getFinishedDate()) && (0!=timeUtils.getMonthDiff(timeUtils.getCurrentTime(),trade.getExactDate()))){
                // 根据月数差判断是否需要更新（按季度还则需保证月份差为3的倍数）
                //if(0==timeUtils.getMonthDiff(timeUtils.getCurrentTime(),trade.getExactDate())%trade.getPayType()){//需要更新
                logger.info("用户是否需要更新的判断结果："
                        +(timeUtils.ifBegin(trade.getExactDate(),timeUtils.getCurrentTime(),trade.getPayType(),trade.getLimitMonths())));

                if(timeUtils.ifBegin(timeUtils.toDay(trade.getExactDate()),timeUtils.toDay(timeUtils.getCurrentTime()),trade.getPayType(),trade.getLimitMonths())){//需要更新
                    logger.info("用户 {} 需要更新",trade.getSerialNumber());

                    //  如果当前日期在deadline之前，则未变成死账
                    logger.info("判断是否为死账...{}",trade.getLimitMonths()<=timeUtils.getMonthDiff(timeUtils.getCurrentTime(),trade.getExactDate()));
                    if(trade.getLimitMonths()>=timeUtils.getMonthDiff(timeUtils.getCurrentTime(),trade.getExactDate())){

                        // 计算违约金
                        double liquidatedMoney = trade.getLiquidatedMoney()
                                + trade.getNextTimePay() * (1 + trade.getPayRate() * trade.getPayType() * 0.5);
                        trade.setShouldRepayLiquidatedMoney(liquidatedMoney);

                        //  计算下次应还
                        double nextTimePay = trade.getShouldRepayPrincipal()
                                + trade.getShouldRepayInterest()
                                + trade.getShouldRepayLiquidatedMoney() - trade.getLiquidatedMoney(); //下期应还=本金+利息+违约金
                        logger.info("该用户的nexttimepay为： "+nextTimePay);
                        trade.setNextTimePay(nextTimePay);
                    }else{  //否则算作死账
                        borrowerAccountService.viewBorrowerAccount(trade.getInBoundAccount());

                    }
                    logger.info("更新了Trade表:更新的结果为{}", trade);
                    tradeService.updateTradeList(trade);
                    BorrowerAccount borrowerAccount = borrowerAccountService.decreaseCreditScore(trade.getInBoundAccount());
                    borrowerAccount.setCreditScore(borrowerAccount.getCreditScore()/2);
                }
            }
        }
        logger.info(tradeList.toString());
        return true;
    }

    @Override
    public double calcUnpaidMoney(Trade tra) throws ParseException { //计算账户还欠多少钱（总共，用于最后判断总账是否还清）

        double totalUnpayMoney = 0;
        // 添加未支付金额
        totalUnpayMoney = Math.max(0,
                    (Math.floor((tra.getLimitMonths() - timeUtils.getMonthDiff(timeUtils.getCurrentTime(),tra.getExactDate())-1)/tra.getPayType())))
                    *(tra.getShouldRepayPrincipal() +tra.getShouldRepayInterest())
                    +tra.getNextTimePay();

        return totalUnpayMoney;
    }

    //用来更新每条Trade中的数据并更新对应的还款流水、资金账户数据库 该方法在updateAccount()调用
    @Transactional(rollbackFor=Exception.class)
    public boolean updateEveryRepayment(Trade tra, double rateMoney) throws ParseException {

        //若还款金额大于本次应还直接输出false
        if ( ((int)(rateMoney*100))/100.0 > tra.getNextTimePay()) {
            return false;
        }
        //记录本次还款违约金
        double needPayLiquidate = 0;
        //记录本次还款利率
        double needPayInterest = 0;
        //记录本次还款本金
        double needPayPrincipal = 0;

        /**
         * 1.先还违约金
         */
        //如果本次还款小于违约金直接还款到违约金
        if(rateMoney < tra.getShouldRepayLiquidatedMoney() - tra.getLiquidatedMoney()){
            //更新已还金额
            tra.setLiquidatedMoney(tra.getLiquidatedMoney() + rateMoney);
            //更新当期应还金额
            tra.setNextTimePay(tra.getNextTimePay() - rateMoney);
            //计算本次还款违约金
            needPayLiquidate = rateMoney;
        }
        else{ //本次还款大于等于违约金再还本期利息
            //更新剩余还款金额
            rateMoney = rateMoney - (tra.getShouldRepayLiquidatedMoney() - tra.getLiquidatedMoney());
            //更新当期应还金额
            tra.setNextTimePay(tra.getNextTimePay() - tra.getShouldRepayLiquidatedMoney() + tra.getLiquidatedMoney());
            //计算本次还款违约金
            needPayLiquidate = tra.getShouldRepayLiquidatedMoney() - tra.getLiquidatedMoney();
            //更新已还违约金金额
            tra.setLiquidatedMoney(tra.getShouldRepayLiquidatedMoney());
}
        /**
         * 2.再还利息
         */
        //剩余还款金额小于利息直接还款到利息金
        if(rateMoney < tra.getNextTimePay() - tra.getShouldRepayPrincipal()){
            //更新已还利息
            tra.setRepaidInterest(tra.getRepaidInterest() + rateMoney);
            //更新当期应还
            tra.setNextTimePay(tra.getNextTimePay() - rateMoney);
            //计算本次还款利息
            needPayInterest = rateMoney;
        }
        else{//剩余金额大于等于还款利息 利息全部还完
            if((tra.getNextTimePay() - tra.getShouldRepayPrincipal())> 0) {
                //计算剩余金额
                rateMoney = rateMoney - (tra.getNextTimePay() - tra.getShouldRepayPrincipal());
                //计算已支付利息
                tra.setRepaidInterest(tra.getRepaidInterest() + tra.getNextTimePay() - tra.getShouldRepayPrincipal());
                //计算本次还款利息
                needPayInterest = tra.getNextTimePay() - tra.getShouldRepayPrincipal();
                //计算当期应还金额
                tra.setNextTimePay(tra.getNextTimePay() - needPayInterest);
            }

            /**
             * 3.最后还本金
             */
            //更新当前应还金额
            tra.setNextTimePay(tra.getNextTimePay() - rateMoney);
            //更新已支付本金
            tra.setRepaidPrincipal(tra.getRepaidPrincipal() + rateMoney);
            //计算本次还款本金
            needPayPrincipal = rateMoney;
        }
        logger.info("目前为还清金额为 "+tradeService.calcUnpaidMoney(tra));
        //还款完成更新日期
        if(Math.abs(tradeService.calcUnpaidMoney(tra))<=0.1) {
            logger.info("单号：{} 完成交易...", tra.getSerialNumber());
            //更新Borrower信用额度
            BorrowerAccount borrowerAccount = borrowerAccountService.decreaseCreditScore(tra.getInBoundAccount()); //获取borrowerAccountID
            double availableLimit = borrowerAccount.getAvailableLimit();
            availableLimit += tra.getMoney();
            borrowerAccount.setAvailableLimit(availableLimit); //计算应更新的金额并设置
            boolean judgeUpdateAvailableLimit = borrowerAccountService.updateCreditScore(borrowerAccount); //判断是否更新成功

            // 更新finishTime
            tra.setFinishedDate(timeUtils.getCurrentTime());

            logger.info("单号：{} 状态更新完成...", tra.getSerialNumber());
        }
        /**
         * 计算完成 更新数据库 执行失败进行回滚
         */
        //判断更新是否正常
        boolean judgeTradeList;
        //增加流水成功判断
        boolean judgeRepayMoneyFlow;
        //借出到账成功判断
        boolean judgeOutMoneyFlow;

        try {
            /**
             * 1.还款完成更新trade表单
             */
            judgeTradeList= tradeService.updateTradeList(tra);

            /**
             * 2.增加还款新流水
             */
            //将值赋值到还款流水号中
            RepayMoneyFlow repayMoneyFlow = new RepayMoneyFlow();
            repayMoneyFlow.setBillId(tra.getBillId());
            repayMoneyFlow.setInBoundAccount(tra.getInBoundAccount());
            repayMoneyFlow.setOutBoundAccount(tra.getOutBoundAccount());
            Date date = new Date();
            repayMoneyFlow.setExactDate(date);
            repayMoneyFlow.setInterestMoney(needPayInterest);
            repayMoneyFlow.setLiquidatedMoney(needPayLiquidate);
            repayMoneyFlow.setMoney(rateMoney);
            repayMoneyFlow.setPrincipalMoney(needPayPrincipal);
            repayMoneyFlow.setSerialNumber(rechargeRecordService.getSerialNumber("repay_money_flow"));

            //将RepayMoneyFlow添加到list中
            List<RepayMoneyFlow> repayMoneyFlows = new ArrayList<>();
            repayMoneyFlows.add(repayMoneyFlow);
            judgeRepayMoneyFlow = repayMoneyFlowService.insertRepayRecord((ArrayList<RepayMoneyFlow>) repayMoneyFlows);

            /**
             * 3.更新借出方账户余额
             */
            judgeOutMoneyFlow = lenderAccountService.updateRechargeAccount(rateMoney, tra.getOutBoundAccount());
            //借入出钱成功判断
            lenderAccountService.updateCurrentIncome(rateMoney,tra.getOutBoundAccount());//更新当前收益


        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//如果update2()抛了异常,update()会回滚,不影响事物正常执行
            return false;
        }
        //全部更新完成返回成功
        if(judgeTradeList && judgeOutMoneyFlow && judgeRepayMoneyFlow) {
            return true;
        }
        return false;
    }
}