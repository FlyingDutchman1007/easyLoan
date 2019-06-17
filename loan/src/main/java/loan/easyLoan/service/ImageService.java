package loan.easyLoan.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    public Object saveImage(MultipartFile image);

}
