package loan.easyLoan.entity;


import java.util.Date;

public class RechargeRecord {

  private int serialNumber;
  private Date rechargeDate;
  private double rechargeMoney;
  private String bankAccount;


  public int getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(int serialNumber) {
    this.serialNumber = serialNumber;
  }


  public Date getRechargeDate() {
    return rechargeDate;
  }

  public void setRechargeDate(Date rechargeDate) {
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

  @Override
  public String toString() {
    return "RechargeRecord{" +
            "serialNumber=" + serialNumber +
            ", rechargeDate=" + rechargeDate +
            ", rechargeMoney=" + rechargeMoney +
            ", bankAccount='" + bankAccount + '\'' +
            '}';
  }
}
