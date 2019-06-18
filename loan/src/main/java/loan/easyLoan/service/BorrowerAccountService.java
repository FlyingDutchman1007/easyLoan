package loan.easyLoan.service;

import loan.easyLoan.entity.BorrowerAccount;

/**
 * @author Ywr
 * @date 2019/6/10 20:39
 */
public interface BorrowerAccountService {

    boolean updateAvailableLimit(String idCard,double intendMoney);//借入方意向借入完成后更新额度

    boolean addNewBorrower(String fundsAccount, String idCard, int creditScore, double totalLimit, double availableLimit);  //新用户注册后分配资金账号

    String findFundsAccount(String idCard);  //根据身份证号找到用户的资金账号

    boolean updateWithdrawAccount(double withdrawMoney,String fundsAccount);   //提现后修改用户资金账户余额

    boolean updateRechargeAccount(double rechargeMoney,String fundsAccount);   //充值后修改用户资金账户余额

    String findBorrowerFundsAccount();  //确立债权关系时查询借入方的资金账户

    double selectAvailableLimit(String idCard);  //查看借入方的额度

    BorrowerAccount viewBorrowerAccount(String idCard); //借入方查看个人账户

    boolean updateBorrowerAccount(double intendMoney,String fundsAccount);//更新借入方资金账户

    double getMoney(String fundsAccount);  //根据资金账户找到帐户余额
}
