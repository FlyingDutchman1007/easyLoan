package loan.easyLoan.mapper;

import loan.easyLoan.entity.IntendBorrow;

public interface IntendBorrowMapper {
    int deleteByPrimaryKey(Integer billId);

    int insert(IntendBorrow record);

    int insertSelective(IntendBorrow record);

    IntendBorrow selectByPrimaryKey(Integer billId);

    int updateByPrimaryKeySelective(IntendBorrow record);

    int updateByPrimaryKey(IntendBorrow record);
}