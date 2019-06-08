package loan.easyloan.entity;


public class IntendLend {

  private long billId;
  private String idCard;
  private double lendMoney;
  private java.sql.Timestamp startDate;
  private long state;


  public long getBillId() {
    return billId;
  }

  public void setBillId(long billId) {
    this.billId = billId;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public double getLendMoney() {
    return lendMoney;
  }

  public void setLendMoney(double lendMoney) {
    this.lendMoney = lendMoney;
  }


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
