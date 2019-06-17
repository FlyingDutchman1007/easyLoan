package loan.easyLoan.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import loan.easyLoan.entity.CreditParameter;
import loan.easyLoan.entity.Depository;
import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.Year;
import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/9 15:39
 */
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping("/user/register")
public class RegisterController {

    @Autowired
    private UserRequiredInfoService userRequiredInfoService;

    @Autowired
    private UserOptionalInfoService userOptionalInfoService;

    @Autowired
    private BorrowerAccountService borrowerAccountService;

    @Autowired
    private LenderAccountService lenderAccountService;

    @Autowired
    private DepositoryService depositoryService;

    public RegisterController() {
    }

    /**
     * 判断手机号是否注册
     */
    @ApiImplicitParam(name="phoneNumber",value="手机号",required=true,paramType="json")
    @ApiOperation(value = "判断手机号是否注册",notes = "判断手机号是否注册接口")
    @PostMapping(value = "/checkPhoneNumber",produces = "application/json;charset=UTF-8")
    public String checkPhoneNumber(@RequestBody Map obj){
        String phoneNumber = (String)obj.get("phoneNumber");
        System.out.println(phoneNumber);

        boolean ifRegistered =   userRequiredInfoService.ifRegistered(phoneNumber);

        if(ifRegistered){
            //已经注册
            return "{\"state\":\"register\"}";
        }else {
            //没有注册
            return "{\"state\":\"unregister\"}";
        }
    }

    /**
     * 通过手机号发送验证码
     */
    @ApiImplicitParam(name="phoneNumber",value="手机号",required=true,paramType="json")
    @ApiOperation(value = "手机号验证",notes = "手机号验证接口")
    @PostMapping(value = "/sendCheckCode",produces = "application/json;charset=UTF-8")
    public String sendCheckCode(@RequestBody Map obj){
        String phoneNumber = (String)obj.get("phoneNumber");

        boolean sendPhoneMsg = userRequiredInfoService.sendPhoneMsg(phoneNumber);

        if(sendPhoneMsg){
            //发送验证码成功
            return "{\"state\": \"successful\" }";
        }else {
            //发送验证码失败
            return "{\"state\": \"fail\" }";
        }
    }

    /**
     * 判断手机号注册时验证码是否正确
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name="phoneNumber",value="手机号",required=true,paramType="json"),
            @ApiImplicitParam(name="verifyCode",value="验证码",required=true,paramType="json")
    })
    @ApiOperation(value = "判断手机号注册时验证码",notes = "判断手机号注册时验证码接口")
    @PostMapping(value = "/checkCheckCode",produces = "application/json;charset=UTF-8")
    public String checkCheckCode(@RequestBody Map obj){
        String phoneNumber = (String) obj.get("phoneNumber");
        int verifyCode = Integer.parseInt((String)obj.get("verifyCode"));

        boolean verifyPhoneMsg =   userRequiredInfoService.verifyPhoneMsg(phoneNumber,verifyCode);

        if(verifyPhoneMsg){
            //验证码输入正确
            return "{\"state\": \"successful\" }";
        }else {
            //验证码错误
            return "{\"state\": \"fail\" }";
        }
    }

    /**
     *身份认证
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name="userName",value="姓名",required=true,paramType="json"),
            @ApiImplicitParam(name="idCard",value="身份证号",required=true,paramType="json"),
    })
    @ApiOperation(value="身份认证",notes="姓名、身份证号都是必输项")
    @PostMapping(value = "/subRegister4", produces = "application/json;charset=UTF-8")
    public String identify(@RequestBody Map obj){
        String userName = (String) obj.get("userName");
        String idCard = (String) obj.get("idCard");

        boolean verifyIdCard = userRequiredInfoService.verifyIdCard(userName,idCard);
        if (verifyIdCard) {
            //身份认证成功
            return "{\"state\": \"successful\" }";
        } else {
            //身份认证失败
            return "{\"state\": \"fail\" }";
        }
    }

    /**
     *绑定银行卡获取验证码
     */
    @ApiImplicitParam(name="bankAccount",value="银行卡号",required=true,paramType="json")
    @ApiOperation(value = "银行卡号验证码获取",notes = "银行卡号验证码获取接口")
    @PostMapping(value = "/sendCheckCode2",produces = "application/json;charset=UTF-8")
    public String sendCheckCode2(@RequestBody Map obj){
        String bankNumber = (String)obj.get("bankAccount");

        boolean boundBankAccount = userRequiredInfoService.boundBankAccount(bankNumber);

        if(boundBankAccount){
            //银行卡验证码获取成功
            return "{\"state\": \"successful\" }";
        } else {
            //银行卡验证码获取失败
            return "{\"state\": \"fail\" }";
        }
    }


    /**
     *最终注册
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name="phoneNumber",value="手机号",required=true,paramType="json"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType="json"),
            @ApiImplicitParam(name="userType",value="用户类型",required=true,paramType="json"),
            @ApiImplicitParam(name="userName",value="姓名",required=true,paramType="json"),
            @ApiImplicitParam(name="idCard",value="身份证号",required=true,paramType="json"),
            @ApiImplicitParam(name="bankAccount",value="银行卡号",required=true,paramType="json"),
            @ApiImplicitParam(name="verifyCode",value="验证码",required=true,paramType="json")
    })
    @ApiOperation(value="用户注册",notes="手机号、密码都是必输项，年龄随边填，但必须是数字")
    @PostMapping(value = "/subRegister", produces = "application/json;charset=UTF-8")
    public String subRegister(@RequestBody Map obj, HttpServletRequest httpServletRequest){
        String phoneNumber = (String) obj.get("phoneNumber");
        String password = (String) obj.get("password");
        String userType = (String) obj.get("userType");
        String userName = (String) obj.get("userName");
        String idCard = (String) obj.get("idCard");
        String bankAccount = (String) obj.get("bankAccount");
        int verifyCode = Integer.parseInt((String)obj.get("verifyCode"));

        UserRequiredInfo userRequiredInfo = new UserRequiredInfo();
        userRequiredInfo.setPhoneNumber(phoneNumber);
        userRequiredInfo.setBankAccount(bankAccount);
        userRequiredInfo.setIdCard(idCard);
        userRequiredInfo.setPassword(password);
        userRequiredInfo.setUserName(userName);
        userRequiredInfo.setUserType(Integer.parseInt(userType));

        UserOptionalInfo userOptionalInfo = new UserOptionalInfo();
        userOptionalInfo.setIdCard(idCard);
        userOptionalInfo.setSex("0");
        userOptionalInfo.setEducationalLevel("未填");
        userOptionalInfo.setMarriage("未填");
        userOptionalInfo.setProfession("未填");
        userOptionalInfo.setAddress("未填");
        userOptionalInfo.setSpecialIdentity("1");


        Depository depository = userRequiredInfoService.verifyBankAccount(bankAccount,phoneNumber,verifyCode);
        System.out.println(depository.toString());

        if(depository != null){
            if(userRequiredInfoService.addNewUser(userRequiredInfo)) {
                userOptionalInfoService.addOptionalInfo(userOptionalInfo);
                HttpSession session=httpServletRequest.getSession();
                session.setAttribute(session.getId(),userRequiredInfo);
                CreditParameter creditParameter = userRequiredInfoService.getCreditParameter(idCard,bankAccount);
                if(userRequiredInfo.getUserType() == 0){
                    borrowerAccountService.addNewBorrower(depository.getFundsAccount(),idCard,creditParameter.getCreditScore(),creditParameter.getTotalLimit(),creditParameter.getAvailableLimit());
                }else {
                    lenderAccountService.addNewLender(depository.getFundsAccount(),idCard);
                }
                depositoryService.addNewDepository(depository);
                return "{\"state\": \"successful\" }";
            }else {
                return "{\"state\": \"fail\" }";
            }
        }else {
            return "{\"state\": \"fail\" }";
        }
    }
}
