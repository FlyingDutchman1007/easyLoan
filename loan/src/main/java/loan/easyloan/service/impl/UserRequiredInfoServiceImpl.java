package loan.easyLoan.service.impl;

import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.mapper.UserRequiredInfoMapper;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Ywr
 * @date 2019/6/9 10:49
 */
@Service
public class UserRequiredInfoServiceImpl implements UserRequiredInfoService {

    @Autowired
    private UserRequiredInfoMapper userRequiredInfoMapper;

    @Override
    public int ifRegistered(String phoneNumber) {
        return userRequiredInfoMapper.ifRegistered(phoneNumber);
    }

    @Override
    public boolean addNewUser(UserRequiredInfo userRequiredInfo) {
        int a = userRequiredInfoMapper.addNewUser(userRequiredInfo);
        if(a==1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public UserRequiredInfo findUser(String idCard) {
        return userRequiredInfoMapper.findUser(idCard);
    }

    @Override
    public String loginCheck(String phoneNumber) {
        return userRequiredInfoMapper.loginCheck(phoneNumber);
    }

    @Override
    public int checkUserType(String phoneNumber) {
        return userRequiredInfoMapper.checkUserType(phoneNumber);
    }

    @Override
    public int updateUserRequiredInfo(UserRequiredInfo userRequiredInfo) {
        return userRequiredInfoMapper.updateUserRequiredInfo(userRequiredInfo);
    }
}
