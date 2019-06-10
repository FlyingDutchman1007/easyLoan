package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.Depository;
import loan.easyLoan.entity.DepositoryExample;
import org.apache.ibatis.annotations.Param;

public interface DepositoryMapper {
    long countByExample(DepositoryExample example);

    int deleteByExample(DepositoryExample example);

    int deleteByPrimaryKey(String fundsAccount);

    int insert(Depository record);

    int insertSelective(Depository record);

    List<Depository> selectByExample(DepositoryExample example);

    Depository selectByPrimaryKey(String fundsAccount);

    int updateByExampleSelective(@Param("record") Depository record, @Param("example") DepositoryExample example);

    int updateByExample(@Param("record") Depository record, @Param("example") DepositoryExample example);

    int updateByPrimaryKeySelective(Depository record);

    int updateByPrimaryKey(Depository record);
}