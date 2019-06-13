package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.BorrowerInfoVO;
import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserOptionalInfoService;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class BorrowerUserInfoController {


    @Autowired
    private UserOptionalInfoService userOptionalInfoService;

    @ApiOperation(value = "借入方个人信息")
    @GetMapping(value = "/borrowerInfo", produces = "application/json;charset=UTF-8")
    public BorrowerInfoVO borrowerInfo(HttpServletRequest request){

        //获取session并将userName存入session对象
        HttpSession session = request.getSession();
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        // 根据RequiredInfo中的id_card号码获取Optional信息
        UserOptionalInfo userOptionalInfo = userOptionalInfoService.viewUserInfo(userRequiredInfo.getIdCard());


        // 生成VO
        BorrowerInfoVO borrowerInfoVO = new BorrowerInfoVO();
        //将对象属性分别copy到VO中
        BeanUtils.copyProperties(userRequiredInfo, borrowerInfoVO);
        BeanUtils.copyProperties(userOptionalInfo, borrowerInfoVO);

        return borrowerInfoVO;
    }

}
