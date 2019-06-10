package loan.easyLoan.mapper;

import loan.easyLoan.entity.Depository;

public interface DepositoryMapper {
    int deleteByPrimaryKey(String fundsAccount);

    int insert(Depository record);

    int insertSelective(Depository record);

    Depository selectByPrimaryKey(String fundsAccount);

    int updateByPrimaryKeySelective(Depository record);

    int updateByPrimaryKey(Depository record);
}