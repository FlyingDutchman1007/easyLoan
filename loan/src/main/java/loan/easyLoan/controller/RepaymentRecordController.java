package loan.easyLoan.controller;
import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.RepaymentRecordVO;
import loan.easyLoan.entity.IntendLend;
import loan.easyLoan.entity.RepayMoneyFlow;
import loan.easyLoan.entity.Trade;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.BorrowerAccountService;
import loan.easyLoan.service.IntendLendService;
import loan.easyLoan.service.RepayMoneyFlowService;
import loan.easyLoan.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@CrossOrigin(allowCredentials= "true",allowedHeaders ="*")   //跨域访问
@RestController  //自动添加 Controller 和 RestBody
@RequestMapping  //用来处理请求地址映射的注解,表示类中的所有响应请求的方法都是以该地址作为父路径

//用户待还款记录控制类
public class RepaymentRecordController {


    @Autowired
    private TradeService tradeService; //实例化一个交易服务
    @Autowired
    private BorrowerAccountService borrowerAccountService;  //实例化一个借入方交易服务
    @Autowired
    private RepayMoneyFlowService repayMoneyFlowService; //实例化一个借入方交易服务
    @Autowired
    private IntendLendService intendLendService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    @ApiOperation(value = "获得待还款记录")
    //向前端发送请求
    @GetMapping(value = "/toPayRecord",produces = "application/json;charset=UTF-8")
    //获取待还款交易记录
    public List<RepaymentRecordVO> list() throws ParseException {

        HttpSession session = httpServletRequest.getSession();//获取session并将userName存入session对象
        //根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard(); //获取用户身份证号

        //获取借入者资金账号
        String borrowerFundacconunt = borrowerAccountService.findFundsAccount(id);

        //获取 tradeservice 中的待还款记录
        List<Trade> repaymentRecord = tradeService.selectPendingRepayment(borrowerFundacconunt);
        //System.out.println(repaymentRecord);

        //新建一个RepaymentRecordVO用来返回借入者待还款记录需要的数据
        List<RepaymentRecordVO> repaymentRecordVlist = new ArrayList<>();

        //money next_time_pay repaid_principal repaid_interest liquidated_money
        //should_repay_principal should_repay_interest should_repay_liquidated_money
        //这些数据因为借出者有多个需要相加
        double totalUnpayMoney = 0;
        double totalshouldpaymoney = 0;
        double totalLiquidatedMoney = 0;
        double totalStartMoney = 0;
        //判断是否可以进行还款
        double totalMoney = 0;
        //获取billid
        int billid = -1;

        //重新创建一个RepaymentRecordVO
        RepaymentRecordVO repaymentRecordVO = new RepaymentRecordVO();

        //将repaymentRecord已有的数据进行添加
        for(Trade tra: repaymentRecord){

            //根据 TradeService 中提取的内容添加属性
            //1.bill_id
            repaymentRecordVO.setBillId(tra.getBillId());
            //2.利率
            repaymentRecordVO.setPayRate(tra.getPayRate()*100);
            //3.还款类型
            repaymentRecordVO.setPayType(tra.getPayType());
            //4.开始日期
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
            repaymentRecordVO.setStartDate(dateFormat.format(tra.getExactDate()));

            /**计算并获取未支付金额
             * 未支付金额 = 剩余还款期数*(下期应还本金 + 下期应还利率 + 下期应还违约金)
             * 剩余还款期数 = 总期数 - (当前期数 - 起始日期)
             * */
            /**
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
            Date str1 = new Date();//获取当前时间
            String str2 = tradeService.judgeDeadline(tra.getSerialNumber());//下期还款时间
            Calendar bef = Calendar.getInstance();
            Calendar aft = Calendar.getInstance();
            bef.setTime(str1);
            aft.setTime(sdf.parse(str2));
            //计算月数
            int result = aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH);
            int month = (aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR)) * 12;
            //int surplus = aft.get(Calendar.DATE) - bef.get(Calendar.DATE);
            //surplus = surplus <= 0 ? 1 : 0;
            //获取剩余期数
            int amountMonth = tra.getLimitMonths() - (Math.abs(month + result));
            //获取未支付金额
            double amountMoney = amountMonth*(tra.getShouldRepayPrincipal() + tra.getShouldRepayInterest()) + tra.getShouldRepayLiquidatedMoney();


             */
            double amountMoney = tra.getMoney()+ tra.getMoney()*tra.getLimitMonths()*tra.getPayRate() + tra.getShouldRepayLiquidatedMoney() - tra.getLiquidatedMoney() - tra.getRepaidInterest()-tra.getRepaidPrincipal();
            //5.添加未支付金额
            totalUnpayMoney += Math.abs(amountMoney);

            //下期应还金额=本期本金+本期利率+本期违约金
            double shouldpaymoney = tra.getNextTimePay();
            totalshouldpaymoney += shouldpaymoney;
            //6.获取下期应还金额

            //7.获取违约金
            totalLiquidatedMoney += tra.getShouldRepayLiquidatedMoney();

            //8.获取初始本金
            totalStartMoney += tra.getMoney();

            //9.本期还款截止日期设置
            repaymentRecordVO.setDeadline(tradeService.judgeDeadline(tra.getSerialNumber()));
            //System.out.println(repaymentRecordVO.getDeadline());
            //计算已借款总额
            totalMoney +=tra.getMoney();
            //获取billid
            billid = tra.getBillId();

        }
        //System.out.println(repaymentRecordVlist.get(0).getDeadline());
        repaymentRecordVO.setUnpayMoney(totalUnpayMoney);
        repaymentRecordVO.setNextTimeShouldPay(totalshouldpaymoney);
        repaymentRecordVO.setLiquidatedMoney(totalLiquidatedMoney);
        repaymentRecordVO.setStartMoney(totalStartMoney);

        //添加到VO list 中
        repaymentRecordVlist.add(repaymentRecordVO);

        //本次借出者借出总金额
        double intendMoney = 0;
        for(IntendLend ilend :intendLendService.selectLender(billid)){
            intendMoney += ilend.getLendMoney();
        }
        if (intendMoney == totalMoney)
            return repaymentRecordVlist;
        return null;
    }


    /**
     *需要在boorow_money_flow中添加一条数据
     *需要更新 trade 表单
     */
    //向前端发送post请求
    @ApiOperation(value = "还款")
    @PostMapping(value = "/subRepayment", produces = "application/json;charset=UTF-8")
    //判断还款是否成功
    public String isRepayment(@RequestBody Map map){

        HttpSession session = httpServletRequest.getSession();//获取session并将userName存入session对象
        //根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard(); //获取用户身份证号

        //获取从前端返回的数据

        int billId = Integer.parseInt(map.get("billId").toString());
        String money = (String)map.get("money");
        String exactDate = (String)map.get("exactDate");


        boolean judge = tradeService.updateAccount(billId, money, exactDate, id);
        if (judge) {
            //还款成功
            return "{\"state\": \"successful\" }";
        }else {
            //还款失败
            return "{\"state\": \"fail\" }";
        }
    }


}
