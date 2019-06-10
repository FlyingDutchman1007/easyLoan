package loan.easyLoan.mapper;

import loan.easyLoan.entity.LenderAccount;

public interface LenderAccountMapper {
    int deleteByPrimaryKey(String fundsAccount);

    int insert(LenderAccount record);

    int insertSelective(LenderAccount record);

    LenderAccount selectByPrimaryKey(String fundsAccount);

    int updateByPrimaryKeySelective(LenderAccount record);

    int updateByPrimaryKey(LenderAccount record);
}