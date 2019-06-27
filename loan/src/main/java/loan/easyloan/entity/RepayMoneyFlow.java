package loan.easyLoan.entity;


import java.util.Date;

public class RepayMoneyFlow {

  private int serialNumber;
  private int billId;
  private String inBoundAccount;
  private String outBoundAccount;
  private Date exactDate;
  private double money;
  private double interestMoney;
  private double liquidatedMoney;
  private double principalMoney;


  public int getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(int serialNumber) {
    this.serialNumber = serialNumber;
  }


  public int getBillId() {
    return billId;
  }

  public void setBillId(int billId) {
    this.billId = billId;
  }


  public String getInBoundAccount() {
    return inBoundAccount;
  }

  public void setInBoundAccount(String inBoundAccount) {
    this.inBoundAccount = inBoundAccount;
  }


  public String getOutBoundAccount() {
    return outBoundAccount;
  }

  public void setOutBoundAccount(String outBoundAccount) {
    this.outBoundAccount = outBoundAccount;
  }


  public Date getExactDate() {
    return exactDate;
  }

  public void setExactDate(Date exactDate) {
    this.exactDate = exactDate;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public double getInterestMoney() {
    return interestMoney;
  }

  public void setInterestMoney(double interestMoney) {
    this.interestMoney = interestMoney;
  }


  public double getLiquidatedMoney() {
    return liquidatedMoney;
  }

  public void setLiquidatedMoney(double liquidatedMoney) {
    this.liquidatedMoney = liquidatedMoney;
  }


  public double getPrincipalMoney() {
    return principalMoney;
  }

  public void setPrincipalMoney(double principalMoney) {
    this.principalMoney = principalMoney;
  }

  @Override
  public String toString() {
    return "RepayMoneyFlow{" +
            "serialNumber=" + serialNumber +
            ", billId=" + billId +
            ", inBoundAccount='" + inBoundAccount + '\'' +
            ", outBoundAccount='" + outBoundAccount + '\'' +
            ", exactDate=" + exactDate +
            ", money=" + money +
            ", interestMoney=" + interestMoney +
            ", liquidatedMoney=" + liquidatedMoney +
            ", principalMoney=" + principalMoney +
            '}';
  }
}
