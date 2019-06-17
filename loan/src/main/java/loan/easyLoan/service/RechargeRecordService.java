package loan.easyLoan.service;

import loan.easyLoan.entity.RechargeRecord;

/**
 * @author Ywr
 * @date 2019/6/10 20:35
 */
public interface RechargeRecordService {

    int getSerialNumber(String sCode);//生成充值流水号

    boolean insertRechargeRecord(RechargeRecord rechargeRecord);  //生成充值记录

}
