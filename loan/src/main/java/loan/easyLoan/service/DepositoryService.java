package loan.easyLoan.service;

import loan.easyLoan.entity.Depository;

/**
 * @author Ywr
 * @date 2019/6/10 21:07
 */
public interface DepositoryService {

    boolean addNewDepository(Depository depository);    //新用户注册之后三方存管账户分配

    boolean selectIfExistFundsAccount(String fundsAccount);  //判断随机生成的资金账号是否发生了重复

    boolean selectIfExistDepositoryAccount(String depositoryAccount);//判断随机生成的三方存管账号是否发生了重复

}
