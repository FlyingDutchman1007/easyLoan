package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.LenderAccount;
import loan.easyLoan.entity.LenderAccountExample;
import org.apache.ibatis.annotations.Param;

public interface LenderAccountMapper {
    long countByExample(LenderAccountExample example);

    int deleteByExample(LenderAccountExample example);

    int deleteByPrimaryKey(String fundsAccount);

    int insert(LenderAccount record);

    int insertSelective(LenderAccount record);

    List<LenderAccount> selectByExample(LenderAccountExample example);

    LenderAccount selectByPrimaryKey(String fundsAccount);

    int updateByExampleSelective(@Param("record") LenderAccount record, @Param("example") LenderAccountExample example);

    int updateByExample(@Param("record") LenderAccount record, @Param("example") LenderAccountExample example);

    int updateByPrimaryKeySelective(LenderAccount record);

    int updateByPrimaryKey(LenderAccount record);
}