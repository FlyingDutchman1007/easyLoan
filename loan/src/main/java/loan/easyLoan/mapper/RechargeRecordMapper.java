package loan.easyLoan.mapper;

import loan.easyLoan.entity.RechargeRecord;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */
@Component
public interface RechargeRecordMapper {

    int getSerialNumber(Map<String,String> parameterMap);//生成充值流水号

    int insertRechargeRecord(RechargeRecord rechargeRecord);  //生成充值记录

}