package loan.easyLoan.service.impl;

import loan.easyLoan.entity.RechargeRecord;
import loan.easyLoan.mapper.RechargeRecordMapper;
import loan.easyLoan.service.RechargeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ywr
 * @date 2019/6/10 20:36
 */
@Service
public class RechargeRecordServiceImpl implements RechargeRecordService {

    @Autowired
    private RechargeRecordMapper rechargeRecordMapper;

    @Override
    public boolean insertRechargeRecord(RechargeRecord rechargeRecord) {
        int result = rechargeRecordMapper.insertRechargeRecord(rechargeRecord);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }
}
