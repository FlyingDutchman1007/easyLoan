package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.WithdrawRecord;
import loan.easyLoan.entity.WithdrawRecordExample;
import org.apache.ibatis.annotations.Param;

public interface WithdrawRecordMapper {
    long countByExample(WithdrawRecordExample example);

    int deleteByExample(WithdrawRecordExample example);

    int deleteByPrimaryKey(Integer serialNumber);

    int insert(WithdrawRecord record);

    int insertSelective(WithdrawRecord record);

    List<WithdrawRecord> selectByExample(WithdrawRecordExample example);

    WithdrawRecord selectByPrimaryKey(Integer serialNumber);

    int updateByExampleSelective(@Param("record") WithdrawRecord record, @Param("example") WithdrawRecordExample example);

    int updateByExample(@Param("record") WithdrawRecord record, @Param("example") WithdrawRecordExample example);

    int updateByPrimaryKeySelective(WithdrawRecord record);

    int updateByPrimaryKey(WithdrawRecord record);
}