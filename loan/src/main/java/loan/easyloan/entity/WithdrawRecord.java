package loan.easyloan.entity;


public class WithdrawRecord {

  private long serialNumber;
  private java.sql.Timestamp withdrawDate;
  private double withdrawMoney;
  private String bankAccount;


  public long getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(long serialNumber) {
    this.serialNumber = serialNumber;
  }


  public java.sql.Timestamp getWithdrawDate() {
    return withdrawDate;
  }

  public void setWithdrawDate(java.sql.Timestamp withdrawDate) {
    this.withdrawDate = withdrawDate;
  }


  public double getWithdrawMoney() {
    return withdrawMoney;
  }

  public void setWithdrawMoney(double withdrawMoney) {
    this.withdrawMoney = withdrawMoney;
  }


  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

}
