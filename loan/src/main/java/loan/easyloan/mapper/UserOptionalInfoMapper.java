package loan.easyLoan.mapper;

import loan.easyLoan.entity.UserOptionalInfo;
import org.springframework.stereotype.Component;

/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */
@Component
public interface UserOptionalInfoMapper {

    int updateSpecialIdentity(String idCard);//特殊认证

    String specialUserCheck(String idCard);//判断是否为特殊用户

    UserOptionalInfo viewUserInfo(String idCard);//查看个人资料

    int updateUserOptionalInfo(UserOptionalInfo userOptionalInfo);//编辑个人资料

    int addOptionalInfo(UserOptionalInfo userOptionalInfo);//新用户选填信息添加

}