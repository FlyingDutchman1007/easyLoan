package loan.easyLoan.entity;


public class BorrowerAccount {

  private String fundsAccount;
  private String idCard;
  private double accountBalance;
  private double borrowedMoney;
  private int creditScore;
  private double totalLimit;
  private double availableLimit;


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


  public double getBorrowedMoney() {
    return borrowedMoney;
  }

  public void setBorrowedMoney(double borrowedMoney) {
    this.borrowedMoney = borrowedMoney;
  }


  public int getCreditScore() {
    return creditScore;
  }

  public void setCreditScore(int creditScore) {
    this.creditScore = creditScore;
  }


  public double getTotalLimit() {
    return totalLimit;
  }

  public void setTotalLimit(double totalLimit) {
    this.totalLimit = totalLimit;
  }


  public double getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(double availableLimit) {
    this.availableLimit = availableLimit;
  }

  @Override
  public String toString() {
    return "BorrowerAccount{" +
            "fundsAccount='" + fundsAccount + '\'' +
            ", idCard='" + idCard + '\'' +
            ", accountBalance=" + accountBalance +
            ", borrowedMoney=" + borrowedMoney +
            ", creditScore=" + creditScore +
            ", totalLimit=" + totalLimit +
            ", availableLimit=" + availableLimit +
            '}';
  }
}
