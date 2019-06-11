package loan.easyLoan.service;

import loan.easyLoan.entity.LenderAccount;

/**
 * @author Ywr
 * @date 2019/6/10 21:11
 */
public interface LenderAccountService {

    boolean addNewLender(String fundsAccount, String idCard);  //新用户注册后分配资金账号

    String findFundsAccount(String idCard);  //由身份证号找到该用户的资金账号

    boolean updateWithdrawAccount(double withdrawMoney, String fundsAccount);    //提现后修改用户资金账户余额

    boolean updateRechargeAccount(double rechargeMoney, String fundsAccount);    //充值后修改用户资金账户余额

    String findLenderFundsAccount();   //确立债权关系时查询借出方的资金账号

    double selectAccountBalance(String idCard);   //查询借出方的帐户余额

    LenderAccount viewLenderAccount(String idCard);   //借出方查看个人账户

}
