package loan.easyLoan.service.impl;

import loan.easyLoan.entity.RechargeRecord;
import loan.easyLoan.mapper.RechargeRecordMapper;
import loan.easyLoan.service.RechargeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/10 20:36
 */
@Service
public class RechargeRecordServiceImpl implements RechargeRecordService {

    @Autowired
    private RechargeRecordMapper rechargeRecordMapper;

    @Override
    public int getSerialNumber(String sCode) {
        Map<String,String> parameterMap = new HashMap<String, String>();
        parameterMap.put("tsCode", sCode);
        parameterMap.put("result", "-1");
        rechargeRecordMapper.getSerialNumber(parameterMap);
        // insert 故障日志 (主表)
        if (!parameterMap.get("result").equals("-1") &&  !parameterMap.get("result").equals("Error")) {
            return Integer.parseInt(parameterMap.get("result"));
        } else {
            throw new RuntimeException();
        }
    }

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
