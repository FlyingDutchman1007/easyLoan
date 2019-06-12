package loan.easyLoan.controller;

import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserOptionalInfoService;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping
public class UserInfoController {
    @Autowired
    private UserRequiredInfoService userRequiredInfoService;
    private UserOptionalInfoService userOptionalInfoService;

    //
    @PostMapping(value = "/userInfo", produces = "application/json;charset=UTF-8")
    public String userInfo(HttpServletRequest request, @RequestBody Map obj){

        HttpSession session = request.getSession();// 获取session并将userName存入session对象
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        // 根据RequiredInfo中的id_card号码获取Optional信息
        UserOptionalInfo userOptionalInfo = userOptionalInfoService.viewUserInfo(userRequiredInfo.getIdCard());


        if(userOptionalInfo != null){
            // 更新userOptionalInfo的属性至最新
            userOptionalInfo.setSex((String) obj.get("sex")); // 利用Map对象获取json中sex字段的值
            userOptionalInfo.setEducationalLevel((String) obj.get("educationalLevel"));
            userOptionalInfo.setMarriage((String) obj.get("marriage"));
            userOptionalInfo.setEducationalLevel((String) obj.get("profession"));
            userOptionalInfo.setAddress((String) obj.get("address"));
            // 调用Service提供的方法
            userOptionalInfoService.updateUserOptionalInfo(userOptionalInfo);
            return "{\"state\":\"success\"}";
        }else{
            return "{\"state\":\"failure\"}";
        }

    }


}
