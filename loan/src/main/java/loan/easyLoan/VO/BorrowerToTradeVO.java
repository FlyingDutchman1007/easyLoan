package loan.easyLoan.VO;
<<<<<<< HEAD
// 可用于lendMatchController
=======

import java.util.Date;

>>>>>>> Ywr470832459-patch-1
public class BorrowerToTradeVO {

    private int billId;
    private double intendMoney;
<<<<<<< HEAD
    private java.sql.Timestamp startDate;
    private double rate;
=======
    private Date startDate;
    private double payRate;
>>>>>>> Ywr470832459-patch-1
    private int payType;
    private int limitMonths;
    private double raisedMoney;

    public BorrowerToTradeVO() {}

<<<<<<< HEAD
    public BorrowerToTradeVO(int billId, double intendMoney, java.sql.Timestamp startDate, double rate, int payType, int limitMonths, double raisedMoney) {
        this.billId = billId;
        this.intendMoney = intendMoney;
        this.startDate = startDate;
        this.rate = rate;
=======
    public BorrowerToTradeVO(int billId, double intendMoney, Date startDate, double rate, int payType, int limitMonths, double raisedMoney) {
        this.billId = billId;
        this.intendMoney = intendMoney;
        this.startDate = startDate;
        this.payRate = rate;
>>>>>>> Ywr470832459-patch-1
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

<<<<<<< HEAD
    public java.sql.Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(java.sql.Timestamp startDate) {
=======
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
>>>>>>> Ywr470832459-patch-1
        this.startDate = startDate;
    }

    public double getRate() {
<<<<<<< HEAD
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
=======
        return payRate;
    }

    public void setRate(double payRate) {
        this.payRate = payRate;
>>>>>>> Ywr470832459-patch-1
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
<<<<<<< HEAD
=======

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
>>>>>>> Ywr470832459-patch-1
}
