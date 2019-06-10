package loan.easyLoan.mapper;

import loan.easyLoan.entity.IntendLend;
import loan.easyLoan.entity.IntendLendKey;

public interface IntendLendMapper {
    int deleteByPrimaryKey(IntendLendKey key);

    int insert(IntendLend record);

    int insertSelective(IntendLend record);

    IntendLend selectByPrimaryKey(IntendLendKey key);

    int updateByPrimaryKeySelective(IntendLend record);

    int updateByPrimaryKey(IntendLend record);
}