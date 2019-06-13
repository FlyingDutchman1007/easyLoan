package loan.easyLoan.entity;

import java.util.Date;

public class PendingTransaction {
    private int billId;
    private double intendMoney;
    private double intendBorrow;
    private Date startDate;
    private double payRate;
    private int payType;
    private int limitMonths;
    private double raisedMoney;

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

    public double getIntendBorrow() {
        return intendBorrow;
    }

    public void setIntendBorrow(double intendBorrow) {
        this.intendBorrow = intendBorrow;
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

    public double getRaisedMoney() {
        return raisedMoney;
    }

    public void setRaisedMoney(double raisedMoney) {
        this.raisedMoney = raisedMoney;
    }

    @Override
    public String toString() {
        return "PendingTransaction{" +
                "billId=" + billId +
                ", intendMoney=" + intendMoney +
                ", intendBorrow=" + intendBorrow +
                ", startDate=" + startDate +
                ", payRate=" + payRate +
                ", payType=" + payType +
                ", limitMonths=" + limitMonths +
                ", raisedMoney=" + raisedMoney +
                '}';
    }
}
