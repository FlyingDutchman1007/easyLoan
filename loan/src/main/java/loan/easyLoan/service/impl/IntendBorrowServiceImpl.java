package loan.easyLoan.service.impl;

import loan.easyLoan.entity.IntendBorrow;
import loan.easyLoan.mapper.IntendBorrowMapper;
import loan.easyLoan.service.IntendBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * @author Ywr
 * @date 2019/6/10 21:34
 */
@Service
public class IntendBorrowServiceImpl implements IntendBorrowService {

    @Autowired
    private IntendBorrowMapper intendBorrowMapper;

    @Override
    public int selectBillId(String idCard) {
        return intendBorrowMapper.selectBillId(idCard);
    }

    @Override
    public List<IntendBorrow> selectCounterParty(float payRate, int limitMonths, double lendMoney) {
        return intendBorrowMapper.selectCounterParty(payRate,limitMonths,lendMoney);
    }

    @Override
    public boolean updateRaisedMoney(double lendMoney) {
        int result = intendBorrowMapper.updateRaisedMoney(lendMoney);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void prepareForTradeCreateTempTable() {
        intendBorrowMapper.prepareForTradeCreateTempTable();
    }

    @Override
    public void addColumn() {
        intendBorrowMapper.addColumn();
    }

    @Override
    public boolean updateBoundAccount(String borrowerFundsAccount, String lenderFundsAccount) {
        int result = intendBorrowMapper.updateBoundAccount(borrowerFundsAccount,lenderFundsAccount);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void dropTempTable() {
        intendBorrowMapper.dropTempTable();
    }

    @Override
    public boolean updateState(int billId) {
        int result = intendBorrowMapper.updateState(billId);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void insertApplicateForBorrow(int billId, String idCard, double intendMoney, Date startDate, float payRate, int payType, int limitMonths) {
        intendBorrowMapper.insertApplicateForBorrow(billId,idCard,intendMoney,startDate,payRate,payType,limitMonths);
    }

    @Override
    public List<IntendBorrow> selectPendingTransaction(String idCard) {
        return intendBorrowMapper.selectPendingTransaction(idCard);
    }

    @Override
    public List<Integer> selectLoseEfficacy() {
        return intendBorrowMapper.selectLoseEfficacy();
    }

    @Override
    public boolean updateInvalidState(List<Integer> list) {
        int result = intendBorrowMapper.updateInvalidState(list);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }
}
