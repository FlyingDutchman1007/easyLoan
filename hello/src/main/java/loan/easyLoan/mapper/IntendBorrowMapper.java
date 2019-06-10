package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.IntendBorrow;
import loan.easyLoan.entity.IntendBorrowExample;
import org.apache.ibatis.annotations.Param;

public interface IntendBorrowMapper {
    long countByExample(IntendBorrowExample example);

    int deleteByExample(IntendBorrowExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(IntendBorrow record);

    int insertSelective(IntendBorrow record);

    List<IntendBorrow> selectByExample(IntendBorrowExample example);

    IntendBorrow selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") IntendBorrow record, @Param("example") IntendBorrowExample example);

    int updateByExample(@Param("record") IntendBorrow record, @Param("example") IntendBorrowExample example);

    int updateByPrimaryKeySelective(IntendBorrow record);

    int updateByPrimaryKey(IntendBorrow record);
}