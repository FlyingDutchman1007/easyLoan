package loan.easyLoan.entity;


import java.util.Date;

public class IntendBorrow {

  private int billId;
  private String idCard;
  private double intendMoney;
  private Date startDate;

  private double payRate;
  private int payType;
  private int limitMonths;
  private int state;
  private double raisedMoney;


  public int getBillId() {
    return billId;
  }

  public void setBillId(int billId) {
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



  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  public double getPayRate() {
    return payRate;
  }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }


  public int getPayType() {
    return payType;
  }

  public void setPayType(int payType) {
    this.payType = payType;
  }


  public int getLimitMonths() {
    return limitMonths;
  }

  public void setLimitMonths(int limitMonths) {
    this.limitMonths = limitMonths;
  }


  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }


  public double getRaisedMoney() {
    return raisedMoney;
  }

  public void setRaisedMoney(double raisedMoney) {
    this.raisedMoney = raisedMoney;
  }

  @Override
  public String toString() {
    return "IntendBorrow{" +
            "billId=" + billId +
            ", idCard='" + idCard + '\'' +
            ", intendMoney=" + intendMoney +
            ", startDate=" + startDate +
            ", payRate=" + payRate +
            ", payType=" + payType +
            ", limitMonths=" + limitMonths +
            ", state=" + state +
            ", raisedMoney=" + raisedMoney +
            '}';
  }
}
