package loan.easyLoan.entity;


public class Trade {

  private int serialNumber;
  private int billId;
  private String inBoundAccount;
  private String outBoundAccount;
  private double money;
  private int limitMonths;
  private int payType;
  private double payRate;
  private java.sql.Timestamp exactDate;
  private double nextTimePay;
  private double repaidPrincipal;
  private double repaidInterest;
  private double liquidatedMoney;
  private double shouldRepayPrincipal;
  private double shouldRepayInterest;
  private double shouldRepayLiquidatedMoney;
  private java.sql.Timestamp finishedDate;


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


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public int getLimitMonths() {
    return limitMonths;
  }

  public void setLimitMonths(int limitMonths) {
    this.limitMonths = limitMonths;
  }


  public int getPayType() {
    return payType;
  }

  public void setPayType(int payType) {
    this.payType = payType;
  }


  public double getPayRate() {
    return payRate;
  }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }


  public java.sql.Timestamp getExactDate() {
    return exactDate;
  }

  public void setExactDate(java.sql.Timestamp exactDate) {
    this.exactDate = exactDate;
  }


  public double getNextTimePay() {
    return nextTimePay;
  }

  public void setNextTimePay(double nextTimePay) {
    this.nextTimePay = nextTimePay;
  }


  public double getRepaidPrincipal() {
    return repaidPrincipal;
  }

  public void setRepaidPrincipal(double repaidPrincipal) {
    this.repaidPrincipal = repaidPrincipal;
  }


  public double getRepaidInterest() {
    return repaidInterest;
  }

  public void setRepaidInterest(double repaidInterest) {
    this.repaidInterest = repaidInterest;
  }


  public double getLiquidatedMoney() {
    return liquidatedMoney;
  }

  public void setLiquidatedMoney(double liquidatedMoney) {
    this.liquidatedMoney = liquidatedMoney;
  }


  public double getShouldRepayPrincipal() {
    return shouldRepayPrincipal;
  }

  public void setShouldRepayPrincipal(double shouldRepayPrincipal) {
    this.shouldRepayPrincipal = shouldRepayPrincipal;
  }


  public double getShouldRepayInterest() {
    return shouldRepayInterest;
  }

  public void setShouldRepayInterest(double shouldRepayInterest) {
    this.shouldRepayInterest = shouldRepayInterest;
  }


  public double getShouldRepayLiquidatedMoney() {
    return shouldRepayLiquidatedMoney;
  }

  public void setShouldRepayLiquidatedMoney(double shouldRepayLiquidatedMoney) {
    this.shouldRepayLiquidatedMoney = shouldRepayLiquidatedMoney;
  }


  public java.sql.Timestamp getFinishedDate() {
    return finishedDate;
  }

  public void setFinishedDate(java.sql.Timestamp finishedDate) {
    this.finishedDate = finishedDate;
  }

  @Override
  public String toString() {
    return "Trade{" +
            "serialNumber=" + serialNumber +
            ", billId=" + billId +
            ", inBoundAccount='" + inBoundAccount + '\'' +
            ", outBoundAccount='" + outBoundAccount + '\'' +
            ", money=" + money +
            ", limitMonths=" + limitMonths +
            ", payType=" + payType +
            ", payRate=" + payRate +
            ", exactDate=" + exactDate +
            ", nextTimePay=" + nextTimePay +
            ", repaidPrincipal=" + repaidPrincipal +
            ", repaidInterest=" + repaidInterest +
            ", liquidatedMoney=" + liquidatedMoney +
            ", shouldRepayPrincipal=" + shouldRepayPrincipal +
            ", shouldRepayInterest=" + shouldRepayInterest +
            ", shouldRepayLiquidatedMoney=" + shouldRepayLiquidatedMoney +
            ", finishedDate=" + finishedDate +
            '}';
  }
}
