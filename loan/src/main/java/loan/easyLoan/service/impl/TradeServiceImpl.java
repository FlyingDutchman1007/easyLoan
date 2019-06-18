package loan.easyLoan.service.impl;

import loan.easyLoan.entity.*;
import loan.easyLoan.mapper.TradeMapper;
import loan.easyLoan.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public String judgeDeadline(int billId) {
        int payType = tradeMapper.selectPayType(billId);

        Date exactDate = tradeMapper.selectExactDate(billId);
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
                shouldRepayInterest = money*payRate/limitMonths;
                nextTimePay = shouldRepayInterest+shouldRepayPrincipal;
            }else {
                shouldRepayPrincipal = money/limitMonths*3;
                shouldRepayInterest = money*payRate/limitMonths*3;
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
}
