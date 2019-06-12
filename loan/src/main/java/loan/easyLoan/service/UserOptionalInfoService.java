package loan.easyLoan.service;

import loan.easyLoan.entity.UserOptionalInfo;

/**
 * @author Ywr
 * @date 2019/6/10 16:51
 */
public interface UserOptionalInfoService {

    boolean updateSpecialIdentity(String idCard);//特殊认证

    String specialUserCheck(String idCard);//判断是否为特殊用户

    UserOptionalInfo viewUserInfo(String idCard);//查看个人资料

    boolean updateUserOptionalInfo(UserOptionalInfo userOptionalInfo);//编辑个人资料

    boolean addOptionalInfo(UserOptionalInfo userOptionalInfo);//新用户选填信息添加
}
