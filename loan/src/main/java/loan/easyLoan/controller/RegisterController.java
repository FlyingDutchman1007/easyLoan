package loan.easyLoan.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserRequiredInfoService userRequiredInfoService;

    @ApiImplicitParams({
            @ApiImplicitParam(name="phone_number",value="手机号",required=true,paramType="json"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType="json"),
            @ApiImplicitParam(name="user_type",value="用户类型",required=true,paramType="json"),
            @ApiImplicitParam(name="user_name",value="姓名",required=true,paramType="json"),
            @ApiImplicitParam(name="id_card",value="身份证号",required=true,paramType="json"),
            @ApiImplicitParam(name="bank_account",value="银行卡号",required=true,paramType="json")
    })
    @ApiOperation(value="用户注册",notes="手机号、密码都是必输项，年龄随边填，但必须是数字")
    @PostMapping(value = "/finalRegister", produces = "application/json;charset=UTF-8")
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
            return "successful";
        } else {
            return "fail";
        }
    }



}
