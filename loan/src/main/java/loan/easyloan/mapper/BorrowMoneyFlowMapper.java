package loan.easyLoan.mapper;

import loan.easyLoan.entity.BorrowMoneyFlow;

public interface BorrowMoneyFlowMapper {
    int deleteByPrimaryKey(Integer serialNumber);

    int insert(BorrowMoneyFlow record);

    int insertSelective(BorrowMoneyFlow record);

    BorrowMoneyFlow selectByPrimaryKey(Integer serialNumber);

    int updateByPrimaryKeySelective(BorrowMoneyFlow record);

    int updateByPrimaryKey(BorrowMoneyFlow record);
}