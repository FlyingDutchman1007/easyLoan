package loan.easyLoan.service.impl;

import loan.easyLoan.entity.CreditParameter;
import loan.easyLoan.entity.Depository;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.mapper.UserRequiredInfoMapper;
import loan.easyLoan.service.DepositoryService;
import loan.easyLoan.service.UserRequiredInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;


/**
 * @author Ywr
 * @date 2019/6/9 10:49
 */
@Service
public class UserRequiredInfoServiceImpl implements UserRequiredInfoService {

    @Autowired
    private UserRequiredInfoMapper userRequiredInfoMapper;

    @Autowired
    private DepositoryService depositoryService;

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
        return true;
    }

    @Override
    public boolean verifyPhoneMsg(String phoneNumber, int verifyCode) {
        if (verifyCode == 123456){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean verifyIdCard(String userName, String idCard) {
        return true;
    }

    @Override
    public boolean boundBankAccount(String bankAccount) {
        return true;
    }

    @Override
    public Depository verifyBankAccount(String bankAccount, String phoneNumber, int verifyCode) {
        int num1,num2;
        do {
            Random rm = new Random();
            num1 = rm.nextInt(1000000);
        }while (!depositoryService.selectIfExistFundsAccount(Integer.toString(num1)));
        do {
            Random rm = new Random();
            num2 = rm.nextInt(1000000);
        }while (!depositoryService.selectIfExistDepositoryAccount(Integer.toString(num2)));
        Depository depository = new Depository();
        depository.setFundsAccount(Integer.toString(num1));
        depository.setDepositoryAccount(Integer.toString(num2));
        return depository;
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
        Random rm = new Random();
        int creditScore = rm.nextInt(549) + 100;
        double totalLimit = ((int)(3E-9 * Math.pow(creditScore, 4.50757555))/100 + 1) * 100;
        CreditParameter creditParameter = new CreditParameter();
        creditParameter.setCreditScore(creditScore);
        creditParameter.setTotalLimit(totalLimit);
        creditParameter.setAvailableLimit(totalLimit);
        return creditParameter;
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
