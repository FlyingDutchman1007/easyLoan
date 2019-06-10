package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.BorrowMoneyFlow;
import loan.easyLoan.entity.BorrowMoneyFlowExample;
import org.apache.ibatis.annotations.Param;

public interface BorrowMoneyFlowMapper {
    long countByExample(BorrowMoneyFlowExample example);

    int deleteByExample(BorrowMoneyFlowExample example);

    int deleteByPrimaryKey(Integer serialNumber);

    int insert(BorrowMoneyFlow record);

    int insertSelective(BorrowMoneyFlow record);

    List<BorrowMoneyFlow> selectByExample(BorrowMoneyFlowExample example);

    BorrowMoneyFlow selectByPrimaryKey(Integer serialNumber);

    int updateByExampleSelective(@Param("record") BorrowMoneyFlow record, @Param("example") BorrowMoneyFlowExample example);

    int updateByExample(@Param("record") BorrowMoneyFlow record, @Param("example") BorrowMoneyFlowExample example);

    int updateByPrimaryKeySelective(BorrowMoneyFlow record);

    int updateByPrimaryKey(BorrowMoneyFlow record);
}