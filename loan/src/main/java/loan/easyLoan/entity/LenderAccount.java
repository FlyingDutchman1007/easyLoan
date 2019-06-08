package loan.easyLoan.entity;


public class LenderAccount {

  private String fundsAccount;
  private String idCard;
  private double accountBalance;
  private double lentMoney;
  private double currentIncome;
  private double expectedIncome;


  public String getFundsAccount() {
    return fundsAccount;
  }

  public void setFundsAccount(String fundsAccount) {
    this.fundsAccount = fundsAccount;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }


  public double getLentMoney() {
    return lentMoney;
  }

  public void setLentMoney(double lentMoney) {
    this.lentMoney = lentMoney;
  }


  public double getCurrentIncome() {
    return currentIncome;
  }

  public void setCurrentIncome(double currentIncome) {
    this.currentIncome = currentIncome;
  }


  public double getExpectedIncome() {
    return expectedIncome;
  }

  public void setExpectedIncome(double expectedIncome) {
    this.expectedIncome = expectedIncome;
  }

}
