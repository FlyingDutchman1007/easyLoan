package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.entity.UserRequiredInfoExample;
import org.apache.ibatis.annotations.Param;

public interface UserRequiredInfoMapper {
    long countByExample(UserRequiredInfoExample example);

    int deleteByExample(UserRequiredInfoExample example);

    int deleteByPrimaryKey(String idCard);

    int insert(UserRequiredInfo record);

    int insertSelective(UserRequiredInfo record);

    List<UserRequiredInfo> selectByExample(UserRequiredInfoExample example);

    UserRequiredInfo selectByPrimaryKey(String idCard);

    int updateByExampleSelective(@Param("record") UserRequiredInfo record, @Param("example") UserRequiredInfoExample example);

    int updateByExample(@Param("record") UserRequiredInfo record, @Param("example") UserRequiredInfoExample example);

    int updateByPrimaryKeySelective(UserRequiredInfo record);

    int updateByPrimaryKey(UserRequiredInfo record);
}