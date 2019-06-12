package loan.easyLoan.controller;

import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/get", produces = "application/json;charset=UTF-8")
    public String getUser(){
        //调用service服务获取对应id对象并返回给前端
        UserOptionalInfo userOptionalInfo = userService.getUserById("620410199711020030");
        String mar = userOptionalInfo.getMarriage();
        String person_id = userOptionalInfo.getIdCard();
        System.out.println(mar);
        System.out.println(person_id);
        String result = "{\"specialCertification\":\""+ mar + "\",\"userName\":\""+ person_id +"\"}";
        return result;
    }

    @PostMapping(value = "/post", produces = "application/json;charset=UTF-8")
    public boolean getPost(@RequestBody String jsonString){
        System.out.println(jsonString);
        return true;
    }
}
