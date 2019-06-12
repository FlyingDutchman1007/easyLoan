package loan.easyLoan.service.impl;

import loan.easyLoan.entity.IntendLend;
import loan.easyLoan.mapper.IntendLendMapper;
import loan.easyLoan.service.IntendLendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/10 21:38
 */
@Service
public class IntendLendServiceImpl implements IntendLendService {

    @Autowired
    private IntendLendMapper intendLendMapper;

    @Override
    public boolean insertIntendLend(int billId, String idCard, double lendMoney, Date startDate) {
        int result = intendLendMapper.insertIntendLend(billId,idCard,lendMoney,startDate);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateState(int billId) {
        int result = intendLendMapper.updateState(billId);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<IntendLend> viewPendingTransaction(String idCard) {
        return intendLendMapper.viewPendingTransaction(idCard);
    }

    @Override
    public boolean updateInvalidState(List<Integer> list) {
        int result = intendLendMapper.updateInvalidState(list);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }
}
