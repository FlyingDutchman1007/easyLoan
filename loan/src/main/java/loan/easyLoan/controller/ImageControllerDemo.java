package loan.easyLoan.controller;

import java.io.File;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageControllerDemo {
    @Value("${cbs.imagesPath}")
    private String theSetDir; //全局配置文件中设置的图片的路径

    @GetMapping("/{page}")
    public String toPate(@PathVariable("page") String page)
    {
        return page;
    }

    @RequestMapping(value = "/fileUploadController")
    public String fileUpload(MultipartFile filename, Model model) throws Exception
    {
        String parentDirPath = theSetDir.substring(theSetDir.indexOf(':')+1, theSetDir.length()); //通过设置的那个字符串获得存放图片的目录路径
        String fileName = filename.getOriginalFilename();

        File parentDir = new File(parentDirPath);
        if(!parentDir.exists()) //如果那个目录不存在先创建目录
        {
            parentDir.mkdir();
        }

        filename.transferTo(new File(parentDirPath + fileName)); //全局配置文件中配置的目录加上文件名

        model.addAttribute("pic_name", fileName);

        return "show";
    }
}
