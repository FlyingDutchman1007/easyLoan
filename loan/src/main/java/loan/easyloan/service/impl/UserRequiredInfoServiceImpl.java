package loan.easyLoan.service.impl;

import loan.easyLoan.entity.CreditParameter;
import loan.easyLoan.entity.Depository;
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
    public boolean ifRegistered(String phoneNumber) {
        int result = userRequiredInfoMapper.ifRegistered(phoneNumber);
        if(result==1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean sendPhoneMsg(String phoneNumber) {
    }

    @Override
    public boolean verifyPhoneMsg(String phoneNumber, int verifyCode) {

    }

    @Override
    public boolean verifyIdCard(String userName, String idCard) {

    }

    @Override
    public boolean boundBankAccount(String bankAccount) {

    }

    @Override
    public Depository verifyBankAccount(String bankAccount, String phoneNumber, int verifyCode) {

    }

    @Override
    public boolean addNewUser(UserRequiredInfo userRequiredInfo) {
        int result = userRequiredInfoMapper.addNewUser(userRequiredInfo);
        if(result==1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public UserRequiredInfo findUserByIdCard(String idCard) {
        return userRequiredInfoMapper.findUserByIdCard(idCard);
    }

    @Override
    public UserRequiredInfo findUserByPhoneNumber(String phoneNumber) {
        return userRequiredInfoMapper.findUserByPhoneNumber(phoneNumber);
    }

    @Override
    public String loginCheck(String phoneNumber) {
        return userRequiredInfoMapper.loginCheck(phoneNumber);
    }

    @Override
    public CreditParameter getCreditParameter(String idCard, String bankAccount) {

    }

    @Override
    public int checkUserType(String phoneNumber) {
        return userRequiredInfoMapper.checkUserType(phoneNumber);
    }

    @Override
    public boolean updateUserRequiredInfo(UserRequiredInfo userRequiredInfo) {
        int result =  userRequiredInfoMapper.updateUserRequiredInfo(userRequiredInfo);
        if(result==1){
            return true;
        }else {
            return false;
        }

    }
}
