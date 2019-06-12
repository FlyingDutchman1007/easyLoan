package loan.easyLoan.service.impl;

import loan.easyLoan.entity.RepayMoneyFlow;
import loan.easyLoan.mapper.RepayMoneyFlowMapper;
import loan.easyLoan.service.RepayMoneyFlowSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/10 21:57
 */
@Service
public class RepayMoneyFlowSreviceImpl implements RepayMoneyFlowSrevice {

    @Autowired
    private RepayMoneyFlowMapper repayMoneyFlowMapper;

    @Override
    public boolean insertRepayRecord(ArrayList<RepayMoneyFlow> list) {
        int result =  repayMoneyFlowMapper.insertRepayRecord(list);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Map checkIfFinishedThisRepay(int billId, int payType, int repayPeriod) {
        return repayMoneyFlowMapper.checkIfFinishedThisRepay(billId,payType,repayPeriod);
    }
}
