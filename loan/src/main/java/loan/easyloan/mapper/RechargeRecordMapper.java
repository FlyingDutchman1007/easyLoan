package loan.easyLoan.mapper;

import loan.easyLoan.entity.RechargeRecord;

public interface RechargeRecordMapper {
    int deleteByPrimaryKey(Integer serialNumber);

    int insert(RechargeRecord record);

    int insertSelective(RechargeRecord record);

    RechargeRecord selectByPrimaryKey(Integer serialNumber);

    int updateByPrimaryKeySelective(RechargeRecord record);

    int updateByPrimaryKey(RechargeRecord record);
}