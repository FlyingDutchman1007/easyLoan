package loan.easyLoan.service;

import loan.easyLoan.entity.WithdrawRecord;


/**
 * @author Ywr
 * @date 2019/6/10 20:22
 */
public interface WithdrawRecordService {

    boolean insertWithdrawRecord(WithdrawRecord withdrawRecord);  //生成提现记录
}
