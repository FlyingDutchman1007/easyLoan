package loan.easyLoan.mapper;

import loan.easyLoan.entity.BorrowerAccount;

public interface BorrowerAccountMapper {
    int deleteByPrimaryKey(String fundsAccount);

    int insert(BorrowerAccount record);

    int insertSelective(BorrowerAccount record);

    BorrowerAccount selectByPrimaryKey(String fundsAccount);

    int updateByPrimaryKeySelective(BorrowerAccount record);

    int updateByPrimaryKey(BorrowerAccount record);
}