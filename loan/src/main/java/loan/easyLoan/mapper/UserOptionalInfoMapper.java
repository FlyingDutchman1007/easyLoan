package loan.easyLoan.mapper;

import loan.easyLoan.entity.UserOptionalInfo;
import org.springframework.stereotype.Component;

@Component
public interface UserOptionalInfoMapper {
    int deleteByPrimaryKey(String idCard);

    int insert(UserOptionalInfo record);

    int insertSelective(UserOptionalInfo record);

    UserOptionalInfo selectByPrimaryKey(String idCard);

    int updateByPrimaryKeySelective(UserOptionalInfo record);

    int updateByPrimaryKeyWithBLOBs(UserOptionalInfo record);

    int updateByPrimaryKey(UserOptionalInfo record);
}