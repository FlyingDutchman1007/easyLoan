package loan.easyLoan.controller;

import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/9 15:39
 */
@RestController
public class UserRequiredInfoController {

    @Autowired
    private UserRequiredInfoService userRequiredInfoService;


    @PostMapping(value = "/register", produces = "application/json;charset=UTF-8")
    public String addNewUser(@RequestBody Map obj){
        String phoneNum = (String) obj.get("phone_number");
        String password = (String) obj.get("password");
        String userType = (String) obj.get("user_type");
        String userName = (String) obj.get("user_name");
        String idCard = (String) obj.get("id_card");
        String bankAccount = (String) obj.get("bank_account");

        System.out.println(phoneNum+password+userType+userName+idCard+bankAccount);

        UserRequiredInfo userRequiredInfo = new UserRequiredInfo();
        userRequiredInfo.setPhoneNumber(phoneNum);
        userRequiredInfo.setBankAccount(bankAccount);
        userRequiredInfo.setIdCard(idCard);
        userRequiredInfo.setPassword(password);
        userRequiredInfo.setUserName(userName);
        userRequiredInfo.setUserType(Integer.parseInt(userType));

        boolean isIAddNewUserSuccessful = userRequiredInfoService.addNewUser(userRequiredInfo);


        if (isIAddNewUserSuccessful) {
            System.out.println("用户注册成功");
        } else {
            System.out.println("用户注册失败");
        }

        return null;
    }



}
