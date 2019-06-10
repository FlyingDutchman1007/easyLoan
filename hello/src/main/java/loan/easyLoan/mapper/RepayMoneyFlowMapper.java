package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.RepayMoneyFlow;
import loan.easyLoan.entity.RepayMoneyFlowExample;
import org.apache.ibatis.annotations.Param;

public interface RepayMoneyFlowMapper {
    long countByExample(RepayMoneyFlowExample example);

    int deleteByExample(RepayMoneyFlowExample example);

    int deleteByPrimaryKey(Integer serialNumber);

    int insert(RepayMoneyFlow record);

    int insertSelective(RepayMoneyFlow record);

    List<RepayMoneyFlow> selectByExample(RepayMoneyFlowExample example);

    RepayMoneyFlow selectByPrimaryKey(Integer serialNumber);

    int updateByExampleSelective(@Param("record") RepayMoneyFlow record, @Param("example") RepayMoneyFlowExample example);

    int updateByExample(@Param("record") RepayMoneyFlow record, @Param("example") RepayMoneyFlowExample example);

    int updateByPrimaryKeySelective(RepayMoneyFlow record);

    int updateByPrimaryKey(RepayMoneyFlow record);
}