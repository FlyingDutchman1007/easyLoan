package loan.easyLoan.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/11 18:43
 */
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserRequiredInfoService userRequiredInfoService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNumber", value = "手机号", required = true, paramType = "json"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "json")
    })
    @ApiOperation(value = "用户登录", notes = "手机号、密码都是必输项")
    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    public String login(@RequestBody Map obj) {
        String phoneNumber = (String) obj.get("phoneNumber");
        String password = (String) obj.get("password");

        if (password.equals(userRequiredInfoService.loginCheck(phoneNumber))) {
            HttpSession session = httpServletRequest.getSession();
            UserRequiredInfo userRequiredInfo = userRequiredInfoService.findUserByPhoneNumber(phoneNumber);
            session.setAttribute(session.getId(), userRequiredInfo);
            System.out.println(session.getId());
            return "{\"state\":\"" + userRequiredInfo.getUserType() + "\"}";
        } else {
            return "{\"state\": \"-1\" }";
        }
    }



    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNumber", value = "手机号", required = true, paramType = "json"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "json")
    })
    @ApiOperation(value = "修改密码")
    @PostMapping(value = "/subChangePassword", produces = "application/json;charset=UTF-8")
    public String subChangePassword(@RequestBody Map obj) {
        String phoneNumber = (String) obj.get("phoneNumber");
        String password = (String) obj.get("password");

        UserRequiredInfo userRequiredInfo =  userRequiredInfoService.findUserByPhoneNumber(phoneNumber);
        userRequiredInfo.setPassword(password);
        boolean ifChangeSuccessful = userRequiredInfoService.updateUserRequiredInfo(userRequiredInfo);

        if (ifChangeSuccessful) {
            return "{\"state\":\"successful\"}";
        } else {
            return "{\"state\": \"-1\" }";
        }
    }
}
