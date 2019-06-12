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

    int selectIfExistFundsAccount(String fundsAccount);  //判断随机生成的资金账号是否发生了重复

    int selectIfExistDepositoryAccount(String depositoryAccount);//判断随机生成的三方存管账号是否发生了重复

}