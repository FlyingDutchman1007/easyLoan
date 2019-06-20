package loan.easyLoan.controller;

import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserRequiredInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping()
public class LogoutController {
    @Autowired
    private UserRequiredInfoService userRequiredInfoService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    private static final Logger logger = LoggerFactory.getLogger("TestController.class");

    @PostMapping(value = "/logout")
    public String logout() {

        HttpSession session = httpServletRequest.getSession();

        if (session.getId()!=null) {
            logger.warn(session.getId()+"  登出......");
            return "{\"state\":\"successful\"}";
        } else {
            return "{\"state\": \"fail\" }";
        }
    }
}
