package loan.easyLoan.mapper;

import loan.easyLoan.entity.WithdrawRecord;

public interface WithdrawRecordMapper {
    int deleteByPrimaryKey(Integer serialNumber);

    int insert(WithdrawRecord record);

    int insertSelective(WithdrawRecord record);

    WithdrawRecord selectByPrimaryKey(Integer serialNumber);

    int updateByPrimaryKeySelective(WithdrawRecord record);

    int updateByPrimaryKey(WithdrawRecord record);
}