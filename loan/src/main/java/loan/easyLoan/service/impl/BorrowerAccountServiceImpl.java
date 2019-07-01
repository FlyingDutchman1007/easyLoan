package loan.easyLoan.service.impl;

import loan.easyLoan.entity.BorrowerAccount;
import loan.easyLoan.mapper.BorrowerAccountMapper;
import loan.easyLoan.service.BorrowerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ywr
 * @date 2019/6/10 20:39
 */
@Service
public class BorrowerAccountServiceImpl implements BorrowerAccountService {

    @Autowired
    private BorrowerAccountMapper borrowerAccountMapper;

    @Override
    public boolean updateAvailableLimit(String idCard, double intendMoney) {
        if(borrowerAccountMapper.updateAvailableLimit(idCard,intendMoney) == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean addNewBorrower(String fundsAccount, String idCard, int creditScore, double totalLimit, double availableLimit) {
        int result = borrowerAccountMapper.addNewBorrower(fundsAccount,idCard,creditScore,totalLimit,availableLimit);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String findFundsAccount(String idCard) {
        return borrowerAccountMapper.findFundsAccount(idCard);
    }

    @Override
    public boolean updateWithdrawAccount(double withdrawMoney, String fundsAccount) {
        int result = borrowerAccountMapper.updateWithdrawAccount(withdrawMoney,fundsAccount);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateRechargeAccount(double rechargeMoney, String fundsAccount) {
        int result = borrowerAccountMapper.updateRechargeAccount(rechargeMoney,fundsAccount);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String findBorrowerFundsAccount() {
        return borrowerAccountMapper.findBorrowerFundsAccount();
    }

    @Override
    public double selectAvailableLimit(String idCard) {
        return borrowerAccountMapper.selectAvailableLimit(idCard);
    }

    @Override
    public BorrowerAccount viewBorrowerAccount(String idCard) {
        return borrowerAccountMapper.viewBorrowerAccount(idCard);
    }

    @Override
    public boolean updateBorrowerAccount(double intendMoney,String fundsAccount) {
        int result = borrowerAccountMapper.updateBorrowerAccount(intendMoney,fundsAccount);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public double getMoney(String fundsAccount) {
        return borrowerAccountMapper.getMoney(fundsAccount);
    }

    @Override
    public BorrowerAccount decreaseCreditScore(String fundsAccount) {
        return borrowerAccountMapper.decreaseCreditScore(fundsAccount);
    }

    @Override
    public boolean updateCreditScore(BorrowerAccount borrowerAccount) { //更新借入方的信用额度（坏账，还完款之后使用）
        double new_credit = borrowerAccount.getAvailableLimit();
        int result =  borrowerAccountMapper.updateAvailableLimit(borrowerAccount.getIdCard(), new_credit);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }
}
