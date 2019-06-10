package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.IntendLend;
import loan.easyLoan.entity.IntendLendExample;
import loan.easyLoan.entity.IntendLendKey;
import org.apache.ibatis.annotations.Param;

public interface IntendLendMapper {
    long countByExample(IntendLendExample example);

    int deleteByExample(IntendLendExample example);

    int deleteByPrimaryKey(IntendLendKey key);

    int insert(IntendLend record);

    int insertSelective(IntendLend record);

    List<IntendLend> selectByExample(IntendLendExample example);

    IntendLend selectByPrimaryKey(IntendLendKey key);

    int updateByExampleSelective(@Param("record") IntendLend record, @Param("example") IntendLendExample example);

    int updateByExample(@Param("record") IntendLend record, @Param("example") IntendLendExample example);

    int updateByPrimaryKeySelective(IntendLend record);

    int updateByPrimaryKey(IntendLend record);
}