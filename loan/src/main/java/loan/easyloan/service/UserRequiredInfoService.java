package loan.easyLoan.service;

import loan.easyLoan.entity.UserRequiredInfo;

/**
 * @author Ywr
 * @date 2019/6/9 17:03
 */
public interface UserRequiredInfoService {

    boolean ifRegistered(String phoneNumber);//是否注册,找用户

    boolean sendPhoneMsg(String phoneNumber);//手机去第三方获取短信验证码

    boolean verifyPhoneMsg(String phoneNumber,int verifyCode);//第三方验证手机号和验证码是否一致

    boolean verifyIdCard(String userName,String idCard);//第三方验证姓名和身份证号正确性

    boolean boundBankAccount(String bankAccount);//绑定银行卡获取验证码

    boolean verifyBankAccount(String bankAccount,String phoneNumber,int verifyCode);//第三方判断绑定银行卡

    boolean addNewUser(UserRequiredInfo userRequiredInfo);//添加新用户

    String loginCheck(String phoneNumber);//根据手机号查找密码

    int checkUserType(String phoneNumber);//判断用户类型


    UserRequiredInfo findUser(String idCard);//根据查找用户

    boolean updateUserRequiredInfo(UserRequiredInfo userRequiredInfo);//修改姓名和手机号

}
