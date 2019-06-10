package loan.easyLoan.controller;

import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/9 15:39
 */
@Controller
public class UserRequiredInfoController {

    @Autowired
    private UserRequiredInfoService userRequiredInfoService;


    @RequestMapping("/user")
    @ResponseBody
    public String mainPage(){
        List<UserRequiredInfo> fullUser =  userRequiredInfoService.findAll();
        for (UserRequiredInfo fullUser1 : fullUser){
            System.out.println(fullUser1);
        }
        return null;
    }
}
