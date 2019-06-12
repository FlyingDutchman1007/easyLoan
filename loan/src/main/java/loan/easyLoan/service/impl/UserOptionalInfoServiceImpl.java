package loan.easyLoan.service.impl;

import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.mapper.UserOptionalInfoMapper;
import loan.easyLoan.service.UserOptionalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ywr
 * @date 2019/6/10 16:51
 */

@Service
public class UserOptionalInfoServiceImpl implements UserOptionalInfoService {

    @Autowired
    private UserOptionalInfoMapper userOptionalInfoMapper;

    @Override
    public boolean updateSpecialIdentity(String idCard) {
        int result = userOptionalInfoMapper.updateSpecialIdentity(idCard);
        if(result==1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String specialUserCheck(String idCard) {
        return userOptionalInfoMapper.specialUserCheck(idCard);
    }

    @Override
    public UserOptionalInfo viewUserInfo(String idCard) {
        return userOptionalInfoMapper.viewUserInfo(idCard);
    }

    @Override
    public boolean updateUserOptionalInfo(UserOptionalInfo userOptionalInfo) {
        int result = userOptionalInfoMapper.updateUserOptionalInfo(userOptionalInfo);
        if(result==1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean addOptionalInfo(UserOptionalInfo userOptionalInfo) {
        int result = userOptionalInfoMapper.addOptionalInfo(userOptionalInfo);
        if(result==1){
            return true;
        }else {
            return false;
        }
    }
}
