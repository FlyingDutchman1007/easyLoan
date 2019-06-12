package loan.easyLoan.service;

import loan.easyLoan.entity.RepayMoneyFlow;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/10 21:57
 */
public interface RepayMoneyFlowSrevice {

    boolean insertRepayRecord(ArrayList<RepayMoneyFlow> list);   //借入方还款

    Map checkIfFinishedThisRepay(int billId, int payType, int repayPeriod); //查看指定账目本期各款项的总的已还款信息，判断本期是否还清，进而判断是否逾期,传入的参数表示账目号、当前是还款的第几期、还款类型

}
