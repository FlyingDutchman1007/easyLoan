package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.RechargeRecord;
import loan.easyLoan.entity.RechargeRecordExample;
import org.apache.ibatis.annotations.Param;

public interface RechargeRecordMapper {
    long countByExample(RechargeRecordExample example);

    int deleteByExample(RechargeRecordExample example);

    int deleteByPrimaryKey(Integer serialNumber);

    int insert(RechargeRecord record);

    int insertSelective(RechargeRecord record);

    List<RechargeRecord> selectByExample(RechargeRecordExample example);

    RechargeRecord selectByPrimaryKey(Integer serialNumber);

    int updateByExampleSelective(@Param("record") RechargeRecord record, @Param("example") RechargeRecordExample example);

    int updateByExample(@Param("record") RechargeRecord record, @Param("example") RechargeRecordExample example);

    int updateByPrimaryKeySelective(RechargeRecord record);

    int updateByPrimaryKey(RechargeRecord record);
}