package loan.easyLoan.service.impl;

import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.mapper.UserOptionalInfoMapper;
import loan.easyLoan.service.UserService;
import loan.easyLoan.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserOptionalInfoMapper userOptionalInfoMapper;

    @Override
    public UserOptionalInfo getUserById(String id) {
        UserOptionalInfo userOptionalInfo = userOptionalInfoMapper.selectByPrimaryKey(id);
        return userOptionalInfo;
    }

    // 原本用于合并两个或者更多的DO,因为时间原因需要推迟
    private UserModel converFromDataObject(UserOptionalInfo userOptionalInfo, UserRequiredInfo userRequiredInfo){
        if(userOptionalInfo == null){
            return null;
        }
        UserModel userModel = new UserModel();
        return userModel;
    }





}
