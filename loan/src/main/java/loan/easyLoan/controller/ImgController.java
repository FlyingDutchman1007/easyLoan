package loan.easyLoan.controller;

import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.IImgUploadService;
import loan.easyLoan.service.UserOptionalInfoService;
import loan.easyLoan.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class ImgController {

    private final ResourceLoader resourceLoader;

    private static final Logger logger = LoggerFactory.getLogger("TestController.class");

    @Autowired
    private UserOptionalInfoService userOptionalInfoService;


    @Autowired
    public ImgController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }


    @Value("${web.upload-path}")
    private String path;

    @Value("${server.port}")
    private String port;

    /**
     * 跳转到文件上传页面
     * @return
     */
    @GetMapping(value = "/getAvatar") //前端获取头像
    public String toUpload(HttpServletRequest httpServletRequest){

        //获取session并将userName存入session对象
        HttpSession session = httpServletRequest.getSession();
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        //获取id号
        String idCard = userRequiredInfo.getIdCard();

        if(userOptionalInfoService.viewUserInfo(idCard).getAvatar()==null){//如果用户没有头像，赋予其默认头像
            return "{\"avatar\":\"http://192.168.0.189/static/assets/img/faces/avatar.jpg\"}";
        }
        //若有头像，传给用户头像
        return "{\"avatar\":\""+userOptionalInfoService.viewUserInfo(idCard).getAvatar()+"\"}";
    }

    /**
     *
     * @param file 要上传的文件
     * @return
     */
    @PostMapping(value = "/uploadAvatar") //前端接受头像发送给后端
    String upload(@RequestParam("avatar") MultipartFile file, HttpServletRequest request){

        String contentType = file.getContentType();//获取文件类型

        // 获取session并将userName存入session对象
        HttpSession session = request.getSession();
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        //获取id号
        String idCard = userRequiredInfo.getIdCard();

        String fileName = idCard + ".jpg"; //暂时写死,需要修改的

        String filePath = path; //暂时写死,需要修改的
        logger.error("filename1:" + fileName);
        logger.error("filePath1:" + filePath);

        try {
            FileUtils.upload(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 拼接图片url
        String imgHost = "http://192.168.0.189";
        String imgUploadPath = "/static/assets/img/faces/"; //前端文件夹下的路径
        String imgName = fileName;
        String imgPath = imgHost + imgUploadPath + imgName;

        logger.error("拼接好的图片上传路径为：" + imgPath);

        // 构造UserOptionalInfo
        UserOptionalInfo userOptionalInfo = userOptionalInfoService.viewUserInfo(idCard);
        userOptionalInfo.setAvatar(imgPath);

        //调用service更新数据库
        if(userOptionalInfoService.updateUserOptionalInfo(userOptionalInfo)==true){//如果数据库更新成功，返回success
            return "{\"state\":\"successful\"}";
        }else{
            return "{\"state\":\"fail\"}";
        }

    }

    @GetMapping(value = "/getStudentCard") //前端获取身份证号
    public String uploadIdCard(HttpServletRequest httpServletRequest){
        return "{\"state\":\"successful\"}";
    }

    @PostMapping(value = "/uploadStudentCard") //前端接受头像发送给后端
    String upload(@RequestParam("userName") String userName,
                  @RequestParam("bankAccount") String bankAccount,
                  @RequestParam("idcard_front") MultipartFile file_front,
                  @RequestParam("idcard_back") MultipartFile file_back,
                  HttpServletRequest request){

        String contentType = file_front.getContentType();
        String fileName = file_front.getOriginalFilename();
        System.out.println(fileName);

//        // 获取session并将userName存入session对象
//        HttpSession session = request.getSession();
//        // 根据sessionId获取存放在session中的userRequiredInfo
//        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
//        //获取id号
//        String idCard = userRequiredInfo.getIdCard();
        return "{\"state\":\"successful\"}";

    }



}

