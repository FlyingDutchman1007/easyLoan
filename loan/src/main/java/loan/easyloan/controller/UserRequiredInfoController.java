package loan.easyLoan.controller;

import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/9 15:39
 */
@Controller
@RequestMapping("/user")
public class UserRequiredInfoController {



    private UserRequiredInfoService userRequiredInfoService;


    @GetMapping("/information")
    public String mainPage(){
        List<UserRequiredInfo> fullUser =  userRequiredInfoService.findAll();
        for (UserRequiredInfo fullUser1 : fullUser){
            System.out.println(fullUser1);
        }
        return null;
    }
}
