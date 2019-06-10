package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.BorrowerAccount;
import loan.easyLoan.entity.BorrowerAccountExample;
import org.apache.ibatis.annotations.Param;

public interface BorrowerAccountMapper {
    long countByExample(BorrowerAccountExample example);

    int deleteByExample(BorrowerAccountExample example);

    int deleteByPrimaryKey(String fundsAccount);

    int insert(BorrowerAccount record);

    int insertSelective(BorrowerAccount record);

    List<BorrowerAccount> selectByExample(BorrowerAccountExample example);

    BorrowerAccount selectByPrimaryKey(String fundsAccount);

    int updateByExampleSelective(@Param("record") BorrowerAccount record, @Param("example") BorrowerAccountExample example);

    int updateByExample(@Param("record") BorrowerAccount record, @Param("example") BorrowerAccountExample example);

    int updateByPrimaryKeySelective(BorrowerAccount record);

    int updateByPrimaryKey(BorrowerAccount record);
}