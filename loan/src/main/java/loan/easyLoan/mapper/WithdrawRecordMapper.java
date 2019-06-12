package loan.easyLoan.mapper;

import loan.easyLoan.entity.WithdrawRecord;
import org.springframework.stereotype.Component;


/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */
@Component
public interface WithdrawRecordMapper {

    int insertWithdrawRecord(WithdrawRecord withdrawRecord);  //生成提现记录

}