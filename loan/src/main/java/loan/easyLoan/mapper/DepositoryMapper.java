package loan.easyLoan.mapper;

import loan.easyLoan.entity.Depository;
import org.springframework.stereotype.Component;

/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */
@Component
public interface DepositoryMapper {

    int addNewDepository(Depository depository);    //新用户注册之后三方存管账户分配

}