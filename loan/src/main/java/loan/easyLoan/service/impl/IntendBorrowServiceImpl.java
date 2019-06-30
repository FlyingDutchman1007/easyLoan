package loan.easyLoan.service.impl;

import loan.easyLoan.entity.BorrowerAccount;
import loan.easyLoan.entity.IntendBorrow;
import loan.easyLoan.entity.Match;
import loan.easyLoan.entity.PendingTransaction;
import loan.easyLoan.mapper.IntendBorrowMapper;
import loan.easyLoan.service.BorrowerAccountService;
import loan.easyLoan.service.IntendBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


/**
 * @author Ywr
 * @date 2019/6/10 21:34
 */
@Service
public class IntendBorrowServiceImpl implements IntendBorrowService {

    @Autowired
    private IntendBorrowMapper intendBorrowMapper;

    @Autowired
    private BorrowerAccountService borrowerAccountService;

    @Override
    public int selectBillId(String idCard) {
        return intendBorrowMapper.selectBillId(idCard);
    }

    @Override
    public List<Match> selectCounterParty(float payRate, int limitMonths, int payType) {
        List<Match> matchList = new ArrayList<>();
        List<IntendBorrow> intendBorrowList = intendBorrowMapper.selectCounterParty(payRate, limitMonths, payType);
        //先把还款方式相等、月利率大于等于借出方、还款期限小于等于借出方的借入者加入matchList，此时没有特定顺序
        for (IntendBorrow intendBorrow : intendBorrowList) {
            Match match = new Match();
            match.setBillId(intendBorrow.getBillId());
            match.setIdCard(intendBorrow.getIdCard());
            match.setIntendMoney(intendBorrow.getIntendMoney());
            match.setLimitMonths(intendBorrow.getLimitMonths());
            match.setPayRate(intendBorrow.getPayRate());
            match.setPayType(intendBorrow.getPayType());
            match.setStartDate(intendBorrow.getStartDate());
            match.setState(intendBorrow.getState());
            match.setRaisedMoney(intendBorrow.getRaisedMoney());
            BorrowerAccount borrowerAccount = borrowerAccountService.viewBorrowerAccount(intendBorrow.getIdCard());
            match.setCreditScore(borrowerAccount.getCreditScore());

            int rateWeight = (int) (Math.abs(match.getPayRate()-payRate)/0.005);
            int monthsWeight = Math.abs(match.getLimitMonths()-limitMonths)/payType;
            int scoreWeight = Math.abs((match.getCreditScore()-600)/10);

            System.out.println(rateWeight);
            System.out.println(monthsWeight);
            System.out.println(scoreWeight);

            int weight = rateWeight+monthsWeight+scoreWeight;
            match.setWeight(weight);

            matchList.add(match);
        }

        //按照权重递增排序，权重越小，优先级越高
        Collections.sort(matchList, new Comparator<Match>() {
            @Override
            public int compare(Match o1, Match o2) {
                //变成 < 可以变成递减排序
                if (o1.getWeight() - o2.getWeight() > 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        return matchList;
    }


    @Override
    public boolean updateRaisedMoney(String idCard, double lendMoney) {
        int result = intendBorrowMapper.updateRaisedMoney(idCard, lendMoney);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public IntendBorrow selectIntendAndRaisedMoney(int billId) {
        return intendBorrowMapper.selectIntendAndRaisedMoney(billId);
    }

    @Override
    public void prepareForTradeCreateTempTable(int billId) {
        intendBorrowMapper.prepareForTradeCreateTempTable(billId);
    }

    @Override
    public int selectCount() {
        return intendBorrowMapper.selectCount();
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
    public List<PendingTransaction> selectPendingTransaction(String idCard) {
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

    @Override
    public void insertApplicateForBorrower(String idCard, double intendMoney, Date startDate, float payRate, int payType, int limitMonths) {
        //需要加入的方法
        intendBorrowMapper.insertApplicateForBorrower(idCard,intendMoney,startDate,payRate,payType,limitMonths);
    }
}
