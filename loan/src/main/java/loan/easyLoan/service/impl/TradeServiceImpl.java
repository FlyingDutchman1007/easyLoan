package loan.easyLoan.service.impl;

import loan.easyLoan.entity.Item;
import loan.easyLoan.entity.RepayMoneyFlow;
import loan.easyLoan.entity.Trade;
import loan.easyLoan.mapper.TradeMapper;
import loan.easyLoan.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/11 9:02
 */
@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeMapper tradeMapper;

    @Override
    public List<Trade> selectPendingRepayment(String inBoundAccount) {
        return tradeMapper.selectPendingRepayment(inBoundAccount);
    }

    @Override
    public List<Trade> selectPendingReceivable(String outBoundAccount) {
        return tradeMapper.selectPendingReceivable(outBoundAccount);
    }

    @Override
    public void prepareForTrade() {
        tradeMapper.prepareForTrade();
    }

    @Override
    public int selectBillId() {
        return tradeMapper.selectBillId();
    }

    @Override
    public void establish1(int billId, Date exactDate) {
        tradeMapper.establish1(billId,exactDate);
    }

    @Override
    public void establish2(int billId) {
        tradeMapper.establish2(billId);
    }

    @Override
    public boolean selectIfFinishedRepayment(int billId) {
        int result = tradeMapper.selectIfFinishedRepayment(billId);
        if (result == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Trade> borrowViewFinishedRecord(String inBoundAccount) {
        return tradeMapper.borrowViewFinishedRecord(inBoundAccount);
    }

    @Override
    public List<Trade> lendViewFinishedRecord(String outBoundAccount) {
        return tradeMapper.lendViewFinishedRecord(outBoundAccount);
    }

    @Override
    public void createPendingRepayment(int billId) {
        tradeMapper.createPendingRepayment(billId);
    }

    @Override
    public List<Trade> viewMoneyOfLender() {
        return tradeMapper.viewMoneyOfLender();
    }

    @Override
    public Date selectExactDate(int billId) {
        return tradeMapper.selectExactDate(billId);
    }

    //返回该期未还款的截止日期
    @Override
    public Date judgeDeadline(int billId) {
        Date exactDate = tradeMapper.selectExactDate(billId);
        Date date = new Date();
        //SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //Date currentDate = dateFormat.parse(date);

        Calendar exactDate1 = Calendar.getInstance();
        Calendar currentDate = Calendar.getInstance();
        exactDate1.setTime(exactDate);
        currentDate.setTime(date);
        int result = currentDate.get(Calendar.MONTH) - exactDate1.get(Calendar.MONTH);
        int month = (currentDate.get(Calendar.YEAR) - exactDate1.get(Calendar.YEAR)) * 12;
        exactDate1.add(Calendar.MONTH,Math.abs(month + result)+1);
        return exactDate1.getTime();
    }

    @Override
    public boolean repayUpdate(ArrayList<RepayMoneyFlow> list) {
        int result = tradeMapper.repayUpdate(list);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List selectNextTimePay(int billId) {
        return tradeMapper.selectNextTimePay(billId);
    }

    @Override
    public boolean overdueUpdate(ArrayList<Item> list1) {
        int result = tradeMapper.overdueUpdate(list1);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Trade> selectBadDebt() {
        return tradeMapper.selectBadDebt();
    }

    @Override
    public boolean updateBadDebt(List<Trade> list2) {
        int result = tradeMapper.updateBadDebt(list2);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }
}
