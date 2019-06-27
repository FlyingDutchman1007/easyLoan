package loan.easyLoan.service;

import loan.easyLoan.entity.IntendLend;
import loan.easyLoan.entity.PendingTransaction;

import java.util.Date;
import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/10 21:37
 */
public interface IntendLendService {

    boolean insertIntendLend(int billId, String idCard, double lendMoney, Date startDate);    //借出方选择好对手方并确定借出之后

    boolean updateState(int billId);    //筹集齐资金后，债权关系确立，该笔交易才生效

    List<IntendLend> selectLender(int billId);//根据billId查找意向借出对象

    List<PendingTransaction> viewPendingTransaction(String idCard); //借出方查看待交易记录

    boolean updateInvalidState(List<Integer> list);  //失效数据更新状态
}
