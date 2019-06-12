package loan.easyLoan.entity;


public class BorrowMoneyFlow {

  private int serialNumber;
  private int billId;
  private String inBoundAccount;
  private String outBoundAccount;
  private double money;
  private java.sql.Timestamp exactDate;


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


  public java.sql.Timestamp getExactDate() {
    return exactDate;
  }

  public void setExactDate(java.sql.Timestamp exactDate) {
    this.exactDate = exactDate;
  }

  @Override
  public String toString() {
    return "BorrowMoneyFlow{" +
            "serialNumber=" + serialNumber +
            ", billId=" + billId +
            ", inBoundAccount='" + inBoundAccount + '\'' +
            ", outBoundAccount='" + outBoundAccount + '\'' +
            ", money=" + money +
            ", exactDate=" + exactDate +
            '}';
  }
}
