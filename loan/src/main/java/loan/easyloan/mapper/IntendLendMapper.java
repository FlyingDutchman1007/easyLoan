package loan.easyLoan.mapper;

import loan.easyLoan.entity.IntendLend;
import loan.easyLoan.entity.IntendLendKey;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */
@Component
public interface IntendLendMapper {

    int insertIntendLend(int billId, String idCard, double lendMoney, Date startDate);    //借出方选择好对手方并确定借出之后

    int updateState(int billId);    //筹集齐资金后，债权关系确立，该笔交易才生效

    List<IntendLend> viewPendingTransaction(String idCard); //借出方查看待交易记录

    int updateInvalidState(List<Integer> list);  //失效数据更新状态

}