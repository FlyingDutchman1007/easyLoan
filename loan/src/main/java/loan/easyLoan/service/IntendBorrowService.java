package loan.easyLoan.service;

import loan.easyLoan.entity.IntendBorrow;
import loan.easyLoan.entity.Match;
import loan.easyLoan.entity.PendingTransaction;

import java.util.Date;
import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/10 21:33
 */
public interface IntendBorrowService {

    int selectBillId(String idCard);    //根据用户身份证号查找用户账目id

    List<Match> selectCounterParty(float payRate, int limitMonths,int payType);    //查询意向借入方并按照利率从高到低排序

    boolean updateRaisedMoney(String idCard, double lendMoney);    //借出方选择好对手方并确定借出之后更新已筹集的资金信息

    IntendBorrow selectIntendAndRaisedMoney(int billId);//查询意向借入总额和已经筹集到的资金

    /**
     * 按照目前的逻辑用到的临时表，不是接口，之后再商量，因为不确定临时表的使用是否有问题，可能会改变方式
     */
    void prepareForTradeCreateTempTable(int billId);    //为债权关系确立建立临时表

    int selectCount();//返回插入trade数量

    void addColumn();  //临时表增加字段

    boolean updateBoundAccount(String borrowerFundsAccount,String lenderFundsAccount);  //更新临时表

    void dropTempTable(); //删除临时表

    boolean updateState(int billId);    //筹集齐资金后，债权关系确立，该笔交易才生效

    void insertApplicateForBorrow(int billId, String idCard, double intendMoney, Date startDate, float payRate, int payType, int limitMonths); //申请借入

    List<PendingTransaction> selectPendingTransaction(String idCard);    //借入方查看待交易记录

    List<Integer> selectLoseEfficacy();  //选择已失效的意向借入

    boolean updateInvalidState(List<Integer> list); //失效数据更新状态


    //新加入的方法，申请借入（不适用bill id）
    void insertApplicateForBorrower(String idCard, double intendMoney, Date startDate, float payRate, int payType, int limitMonths);

}
