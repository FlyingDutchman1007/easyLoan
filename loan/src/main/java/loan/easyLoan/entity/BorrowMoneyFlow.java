package loan.easyLoan.entity;


public class BorrowMoneyFlow {

  private long serialNumber;
  private long billId;
  private String inBoundAccount;
  private String outBoundAccount;
  private double money;
  private java.sql.Timestamp exactDate;


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


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public java.sql.Timestamp getExactDate() {
    return exactDate;
  }

  public void setExactDate(java.sql.Timestamp exactDate) {
    this.exactDate = exactDate;
  }

}
