package loan.easyLoan.entity;


public class RepayMoneyFlow {

  private long serialNumber;
  private long billId;
  private String inBoundAccount;
  private String outBoundAccount;
  private java.sql.Timestamp exactDate;
  private double money;
  private double interestMoney;
  private double liquidatedMoney;
  private double principalMoney;


  public long getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(long serialNumber) {
    this.serialNumber = serialNumber;
  }


  public long getBillId() {
    return billId;
  }

  public void setBillId(long billId) {
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


  public java.sql.Timestamp getExactDate() {
    return exactDate;
  }

  public void setExactDate(java.sql.Timestamp exactDate) {
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
