package loan.easyLoan.service.impl;

import loan.easyLoan.entity.BorrowMoneyFlow;
import loan.easyLoan.mapper.BorrowMoneyFlowMapper;
import loan.easyLoan.service.BorrowMoneyFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Ywr
 * @date 2019/6/10 21:05
 */
@Service
public class BorrowMoneyFlowServiceImpl implements BorrowMoneyFlowService {

    @Autowired
    private BorrowMoneyFlowMapper borrowMoneyFlowMapper;

    @Override
    public boolean addBorrowFlow(ArrayList<BorrowMoneyFlow> list) {
        int result = borrowMoneyFlowMapper.addBorrowFlow(list);
        if(result == 1){
            return true;
        }else {
            return false;
        }
    }
}
