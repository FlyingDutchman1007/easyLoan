package loan.easyLoan.service.impl;

import loan.easyLoan.entity.LenderAccount;
import loan.easyLoan.mapper.LenderAccountMapper;
import loan.easyLoan.service.LenderAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ywr
 * @date 2019/6/10 21:12
 */
@Service
public class LenderAccountServiceImpl implements LenderAccountService {

    @Autowired
    private LenderAccountMapper lenderAccountMapper;

    @Override
    public boolean addNewLender(String fundsAccount, String idCard) {
        int result = lenderAccountMapper.addNewLender(fundsAccount,idCard);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String findFundsAccount(String idCard) {
        return lenderAccountMapper.findFundsAccount(idCard);
    }

    @Override
    public boolean updateWithdrawAccount(double withdrawMoney, String fundsAccount) {
        int result = lenderAccountMapper.updateWithdrawAccount(withdrawMoney,fundsAccount);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateRechargeAccount(double rechargeMoney, String fundsAccount) {
        int result = lenderAccountMapper.updateRechargeAccount(rechargeMoney,fundsAccount);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String findLenderFundsAccount() {
        return lenderAccountMapper.findLenderFundsAccount();
    }

    @Override
    public double selectAccountBalance(String idCard) {
        return lenderAccountMapper.selectAccountBalance(idCard);
    }

    @Override
    public LenderAccount viewLenderAccount(String idCard) {
        return lenderAccountMapper.viewLenderAccount(idCard);
    }

    @Override
    public boolean updateLentMoney(double lendMoney, String fundsAccount) {
        int result = lenderAccountMapper.updateLentMoney(lendMoney,fundsAccount);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateAccountBalance(String fundsAccount) {
        int result = lenderAccountMapper.updateAccountBalance(fundsAccount);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public double getMoney(String fundsAccount) {
        return lenderAccountMapper.getMoney(fundsAccount);
    }
}
