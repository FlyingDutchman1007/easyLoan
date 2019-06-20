package loan.easyLoan.mapper;


import loan.easyLoan.entity.ImageUpload;
import org.springframework.stereotype.Component;

@Component
public interface ImageUploadMapper {
    int insert(ImageUpload record);

    int insertSelective(ImageUpload record);

    int insertImgPath(ImageUpload imgPath);
}