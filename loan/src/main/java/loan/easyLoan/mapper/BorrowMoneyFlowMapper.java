package loan.easyLoan.mapper;

import loan.easyLoan.entity.BorrowMoneyFlow;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */
@Component
public interface BorrowMoneyFlowMapper {

    int addBorrowFlow(ArrayList<BorrowMoneyFlow> list); //债权关系确立，借入方借款成功，添加借入流水记录

}