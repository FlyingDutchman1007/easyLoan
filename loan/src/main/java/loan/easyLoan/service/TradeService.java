package loan.easyLoan.service;

import loan.easyLoan.entity.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/11 9:01
 */
public interface TradeService {

    String  judgeDeadline(int billId);  //判断截止日期

    List<Trade> selectPendingRepayment(String inBoundAccount);   //借入方查看待还款记录
    List<Trade> selectPendingReceivable(String outBoundAccount);   //借出方查看待收款记录

    boolean prepareForTrade();   //将临时表中的数据插入交易表
    int selectBillId();

    void establish1(int billId, Date exactDate);
    void establish2(int billId);

    boolean selectIfFinishedRepayment(int billId);//用户一次贷款未还清不能进行第二次借贷，判断用户是否完成所有还款，决定该用户是否可以申请借入

    List<Trade> borrowViewFinishedRecord(String inBoundAccount);  //借入方查看已完成记录
    List<Trade> lendViewFinishedRecord(String outBoundAccount);    //借出方查看已完成记录

    /**
     * 临时表部分，不属于接口，对接口的实现也没有影响，暂时先不用管
     */
    void createPendingRepayment(int billId);//借入方还款,先把该账目id的交易记录取出来
    List<Trade> viewMoneyOfLender();  //借入方还款,查看该笔交易中各个借出方的出资比例
    Date selectExactDate(int billId); //借入方还款,查看该笔交易的确立日期，以判断当前属于还款的第几周期
    /**
     * 借入方还款,按照各个借出方的出资比例进行还款,先还违约金，再还利息，再还本金
     */
    boolean repayUpdate(ArrayList<RepayMoneyFlow> list);  //还款日期等于或小于截止日期，即无逾期的情况
    List selectNextTimePay(int billId);  //查看指定账目本期各款项的总的应还款信息，判断本期是否还清，进而判断是否逾期
    boolean overdueUpdate(ArrayList<Item> list1); //逾期的情况,在每期的第一天更新上一期的逾期情况

    List<Trade> selectBadDebt();    //查询坏账的交易,后期平台对这些借出方进行赔付
    boolean updateBadDebt(List<Trade> list2);   //更新坏账的交易记录

    int selectPayType(int billId);  //根据账目id查看还款类型

    boolean trade(IntendBorrow intendBorrow,List<IntendLend> intendLends);
    boolean insertRecord(List<Trade> list);
}
