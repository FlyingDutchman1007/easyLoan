package loan.easyLoan.entity;


public class RechargeRecord {

  private long serialNumber;
  private java.sql.Timestamp rechargeDate;
  private double rechargeMoney;
  private String bankAccount;


  public long getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(long serialNumber) {
    this.serialNumber = serialNumber;
  }


  public java.sql.Timestamp getRechargeDate() {
    return rechargeDate;
  }

  public void setRechargeDate(java.sql.Timestamp rechargeDate) {
    this.rechargeDate = rechargeDate;
  }


  public double getRechargeMoney() {
    return rechargeMoney;
  }

  public void setRechargeMoney(double rechargeMoney) {
    this.rechargeMoney = rechargeMoney;
  }


  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

}
