package loan.easyLoan.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserOptionalInfoService;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class UserInfoController {

    @Autowired
    private UserOptionalInfoService userOptionalInfoService;

    @Autowired
    private HttpServletRequest httpServletRequest;


    @ApiImplicitParams({
            @ApiImplicitParam(name="sex",value="性别",paramType="json"),
            @ApiImplicitParam(name="educationalLevel",value="教育水平",paramType="json"),
            @ApiImplicitParam(name="marriage",value="婚姻状况",paramType="json"),
            @ApiImplicitParam(name="profession",value="职业",paramType="json"),
            @ApiImplicitParam(name="address",value="地址",paramType="json")
    })
    @ApiOperation(value = "编辑个人信息",notes = "个人信息都是选填的")
    @PostMapping(value = "/userInfo", produces = "application/json;charset=UTF-8")
    public String userInfo(@RequestBody Map obj){

        // 获取session并将userName存入session对象
        HttpSession session = httpServletRequest.getSession();
        System.out.println(session.getId());
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        // 根据RequiredInfo中的id_card号码获取Optional信息
        UserOptionalInfo userOptionalInfo = userOptionalInfoService.viewUserInfo(userRequiredInfo.getIdCard());


        if(userOptionalInfo != null){
            // 更新userOptionalInfo的属性至最新
            // 利用Map对象获取json中sex字段的值
            userOptionalInfo.setSex((String) obj.get("sex"));
            userOptionalInfo.setEducationalLevel((String) obj.get("educationalLevel"));
            userOptionalInfo.setMarriage((String) obj.get("marriage"));
            userOptionalInfo.setProfession((String) obj.get("profession"));
            userOptionalInfo.setAddress((String) obj.get("address"));
            // 调用Service提供的方法
            userOptionalInfoService.updateUserOptionalInfo(userOptionalInfo);
            return "{\"state\":\"successful\"}";
        }else{
            return "{\"state\":\"fail\"}";
        }

    }


}
