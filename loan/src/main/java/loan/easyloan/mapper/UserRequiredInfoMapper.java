package loan.easyLoan.mapper;

import loan.easyLoan.entity.UserRequiredInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */

@Component
public interface UserRequiredInfoMapper {

    List<UserRequiredInfo> findAll();

    int deleteByPrimaryKey(String idCard);

    int insert(UserRequiredInfo record);

    int insertSelective(UserRequiredInfo record);

    UserRequiredInfo selectByPrimaryKey(String idCard);

    int updateByPrimaryKeySelective(UserRequiredInfo record);

    int updateByPrimaryKey(UserRequiredInfo record);
}
