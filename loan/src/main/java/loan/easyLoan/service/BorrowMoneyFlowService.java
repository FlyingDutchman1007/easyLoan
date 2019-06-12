package loan.easyLoan.service;

import loan.easyLoan.entity.BorrowMoneyFlow;

import java.util.ArrayList;

/**
 * @author Ywr
 * @date 2019/6/10 21:05
 */
public interface BorrowMoneyFlowService {

    boolean addBorrowFlow(ArrayList<BorrowMoneyFlow> list); //债权关系确立，借入方借款成功，添加借入流水记录

}
