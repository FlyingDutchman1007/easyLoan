package loan.easyloan.entity;


public class IntendBorrow {

  private long billId;
  private String idCard;
  private double intendMoney;
  private java.sql.Timestamp startDate;
  private double payRate;
  private long payType;
  private long limitMonths;
  private long state;
  private double raisedMoney;


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


  public double getIntendMoney() {
    return intendMoney;
  }

  public void setIntendMoney(double intendMoney) {
    this.intendMoney = intendMoney;
  }


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public double getPayRate() {
    return payRate;
  }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }


  public long getPayType() {
    return payType;
  }

  public void setPayType(long payType) {
    this.payType = payType;
  }


  public long getLimitMonths() {
    return limitMonths;
  }

  public void setLimitMonths(long limitMonths) {
    this.limitMonths = limitMonths;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public double getRaisedMoney() {
    return raisedMoney;
  }

  public void setRaisedMoney(double raisedMoney) {
    this.raisedMoney = raisedMoney;
  }

}
