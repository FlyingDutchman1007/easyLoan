package loan.easyLoan.VO;

import java.util.Date;

public class BorrowerToTradeVO {

    private int billId;
    private double intendMoney;

    private Date startDate;
    private double payRate;

    private int payType;
    private int limitMonths;
    private double raisedMoney;

    public BorrowerToTradeVO() {}

    public BorrowerToTradeVO(int billId, double intendMoney, Date startDate, double rate, int payType, int limitMonths, double raisedMoney) {
        this.billId = billId;
        this.intendMoney = intendMoney;
        this.startDate = startDate;
        this.payRate = rate;
        this.payType = payType;
        this.limitMonths = limitMonths;
        this.raisedMoney = raisedMoney;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
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

    public double getRate() {
        return payRate;
    }

    public void setRate(double payRate) {
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

    public double getRaisedMoney() {
        return raisedMoney;
    }

    public void setRaisedMoney(double raisedMoney) {
        this.raisedMoney = raisedMoney;
    }

    @Override
    public String toString() {
        return "BorrowerToTradeVO{" +
                "billId=" + billId +
                ", intendMoney=" + intendMoney +
                ", startDate=" + startDate +
                ", rate=" + payRate +
                ", payType=" + payType +
                ", limitMonths=" + limitMonths +
                ", raisedMoney=" + raisedMoney +
                '}';
    }
}
