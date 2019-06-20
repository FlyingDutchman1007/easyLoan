package loan.easyLoan.service.impl;


import loan.easyLoan.entity.ImageUpload;
import loan.easyLoan.mapper.ImageUploadMapper;
import loan.easyLoan.service.IImgUploadService;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("iImgUploadService")
public class ImgUploadServiceImpl implements IImgUploadService {

    @Autowired
    private ImageUploadMapper imageUploadMapper;

    private static Logger logger = LoggerFactory.getLogger("ImgUploadServiceImpl.class");

    /**
     * 存储上传图片的路径
     * @param
     * @return
     */
    public String imgUpload(String imgPath, String idCard, int type){

        ImageUpload upload = new ImageUpload();
        upload.setAvatar(imgPath); //设置对象中的路径，身份证号，类别属性
        upload.setIdCard(idCard);
        upload.setType(type);

        // 一定要加非空判断，否则会报空指针异常
        if(upload.getAvatar() == null){
            return "图片地址为空";
        }
//        logger.error("向数据库中存储的路径为：" + upload.getImgpath());
//        logger.error("传递过来的imgPath参数为：" + imgPath);
//        logger.error(upload.toString());

        int rowCount = imageUploadMapper.insertImgPath(upload);
        logger.error(rowCount + "");
        if(rowCount > 0){
            return "图片地址存储成功";
        }
        return "图片地址存储失败";
    }
}
