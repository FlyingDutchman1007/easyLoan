package loan.easyLoan.service;

import loan.easyLoan.entity.UserRequiredInfo;

/**
 * @author Ywr
 * @date 2019/6/9 17:03
 */
public interface UserRequiredInfoService {

    boolean ifRegistered(String phoneNumber);//是否注册,找用户

    boolean addNewUser(UserRequiredInfo userRequiredInfo);//添加新用户

    UserRequiredInfo findUser(String idCard);//根据查找用户

    String loginCheck(String phoneNumber);//根据手机号查找密码

    int checkUserType(String phoneNumber);//判断用户类型

    boolean updateUserRequiredInfo(UserRequiredInfo userRequiredInfo);//修改姓名和手机号
}
