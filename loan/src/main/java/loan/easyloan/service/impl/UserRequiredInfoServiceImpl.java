package loan.easyLoan.service.impl;

import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.mapper.UserRequiredInfoMapper;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/9 10:49
 */

public class UserRequiredInfoServiceImpl implements UserRequiredInfoService {

    @Autowired
    private UserRequiredInfoMapper userRequiredInfoMapper;

    @Override
    public List<UserRequiredInfo> findAll() {
        return userRequiredInfoMapper.findAll();
    }
}
