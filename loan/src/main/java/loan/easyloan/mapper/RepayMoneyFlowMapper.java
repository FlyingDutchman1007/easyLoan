package loan.easyLoan.mapper;

import loan.easyLoan.entity.RepayMoneyFlow;

public interface RepayMoneyFlowMapper {
    int deleteByPrimaryKey(Integer serialNumber);

    int insert(RepayMoneyFlow record);

    int insertSelective(RepayMoneyFlow record);

    RepayMoneyFlow selectByPrimaryKey(Integer serialNumber);

    int updateByPrimaryKeySelective(RepayMoneyFlow record);

    int updateByPrimaryKey(RepayMoneyFlow record);
}