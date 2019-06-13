package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.BorrowerInfoVO;
import loan.easyLoan.VO.LenderInfoVO;
import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserOptionalInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Ywr
 * @date 2019/6/13 14:09
 */
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class LenderUserInfoController {

    @Autowired
    private UserOptionalInfoService userOptionalInfoService;

    @ApiOperation(value = "借出方个人信息")
    @GetMapping(value = "/lenderInfo", produces = "application/json;charset=UTF-8")
    public LenderInfoVO lenderInfo(HttpServletRequest request){

        //获取session并将userName存入session对象
        HttpSession session = request.getSession();
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        // 根据RequiredInfo中的id_card号码获取Optional信息
        UserOptionalInfo userOptionalInfo = userOptionalInfoService.viewUserInfo(userRequiredInfo.getIdCard());


        // 生成VO
        LenderInfoVO lenderInfoVO = new LenderInfoVO();
        //将对象属性分别copy到VO中
        BeanUtils.copyProperties(userRequiredInfo, lenderInfoVO);
        BeanUtils.copyProperties(userOptionalInfo, lenderInfoVO);
        System.out.println(lenderInfoVO.getPhoneNumber());

        return lenderInfoVO;
    }
}
