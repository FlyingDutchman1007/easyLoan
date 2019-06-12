package loan.easyLoan.service.impl;

import loan.easyLoan.entity.WithdrawRecord;
import loan.easyLoan.mapper.WithdrawRecordMapper;
import loan.easyLoan.service.WithdrawRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Ywr
 * @date 2019/6/10 20:27
 */
@Service
public class WithdrawRecordServiceImpl implements WithdrawRecordService {

    @Autowired
    private WithdrawRecordMapper withdrawRecordMapper;

    @Override
    public boolean insertWithdrawRecord(WithdrawRecord withdrawRecord) {
        int result = withdrawRecordMapper.insertWithdrawRecord(withdrawRecord);
        if(result == 1){
            return true;
        }else {
            return false;
        }
    }
}
