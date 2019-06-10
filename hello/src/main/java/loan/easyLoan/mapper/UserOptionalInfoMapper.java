package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.entity.UserOptionalInfoExample;
import org.apache.ibatis.annotations.Param;

public interface UserOptionalInfoMapper {
    long countByExample(UserOptionalInfoExample example);

    int deleteByExample(UserOptionalInfoExample example);

    int deleteByPrimaryKey(String idCard);

    int insert(UserOptionalInfo record);

    int insertSelective(UserOptionalInfo record);

    List<UserOptionalInfo> selectByExampleWithBLOBs(UserOptionalInfoExample example);

    List<UserOptionalInfo> selectByExample(UserOptionalInfoExample example);

    UserOptionalInfo selectByPrimaryKey(String idCard);

    int updateByExampleSelective(@Param("record") UserOptionalInfo record, @Param("example") UserOptionalInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") UserOptionalInfo record, @Param("example") UserOptionalInfoExample example);

    int updateByExample(@Param("record") UserOptionalInfo record, @Param("example") UserOptionalInfoExample example);

    int updateByPrimaryKeySelective(UserOptionalInfo record);

    int updateByPrimaryKeyWithBLOBs(UserOptionalInfo record);

    int updateByPrimaryKey(UserOptionalInfo record);
}