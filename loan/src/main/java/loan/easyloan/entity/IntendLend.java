package loan.easyLoan.entity;


public class IntendLend {

  private int billId;
  private String idCard;
  private double lendMoney;
  private java.sql.Timestamp startDate;
  private int state;


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


  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "IntendLend{" +
            "billId=" + billId +
            ", idCard='" + idCard + '\'' +
            ", lendMoney=" + lendMoney +
            ", startDate=" + startDate +
            ", state=" + state +
            '}';
  }
}
