package loan.easyLoan.mapper;

import loan.easyLoan.entity.UserRequiredInfo;
import org.springframework.stereotype.Component;


/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */

@Component
public interface UserRequiredInfoMapper {

    int ifRegistered(String phoneNumber);//是否注册,找用户

    int addNewUser(UserRequiredInfo userRequiredInfo);//添加新用户

    UserRequiredInfo findUserByIdCard(String idCard);//根据身份证号查找用户

    UserRequiredInfo findUserByPhoneNumber(String phoneNumber);//根据手机号查找用户

    String loginCheck(String phoneNumber);//根据手机号查找密码

    int checkUserType(String phoneNumber);//判断用户类型

    int updateUserRequiredInfo(UserRequiredInfo userRequiredInfo);//修改姓名和手机号

}
