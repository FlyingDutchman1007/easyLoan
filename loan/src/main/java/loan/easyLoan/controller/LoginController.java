package loan.easyLoan.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/11 18:43
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserRequiredInfoService userRequiredInfoService;

    @ApiImplicitParams({
            @ApiImplicitParam(name="phone_number",value="手机号",required=true,paramType="json"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType="json")
    })
    @ApiOperation(value="用户登录",notes="手机号、密码都是必输项")
    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    public String login(@RequestBody Map obj, HttpServletRequest httpServletRequest){
        String phoneNumber = (String) obj.get("phone_number");
        String password = (String) obj.get("password");

        if(password.equals(userRequiredInfoService.loginCheck(phoneNumber))){
            HttpSession session=httpServletRequest.getSession();
            UserRequiredInfo userRequiredInfo = userRequiredInfoService.findUserByPhoneNumber(phoneNumber);
            session.setAttribute(session.getId(),userRequiredInfo);
            return "{\" state\":\"" + userRequiredInfo.getUserType() + "\"}";
        }else {
            return "{\" state\": \"-1\" }";
        }
    }
}
