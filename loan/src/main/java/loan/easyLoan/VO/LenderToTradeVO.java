package loan.easyLoan.VO;

import java.sql.Timestamp;

public class LenderToTradeVO {
    private int billId;
    private double intendMoney;
    private Timestamp startDate;
    private double rate;
    private int payType;
    private int limitMonths;
    private double raisedMoney;
    private double lendMoney;
    private Timestamp exactDate;

    public LenderToTradeVO() {}

    public LenderToTradeVO(int billId, double intendMoney, Timestamp startDate, double rate, int payType, int limitMonths, double raisedMoney, double lendMoney, Timestamp exactDate) {
        this.billId = billId;
        this.intendMoney = intendMoney;
        this.startDate = startDate;
        this.rate = rate;
        this.payType = payType;
        this.limitMonths = limitMonths;
        this.raisedMoney = raisedMoney;
        this.lendMoney = lendMoney;
        this.exactDate = exactDate;
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

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
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

    public double getLendMoney() {
        return lendMoney;
    }

    public void setLendMoney(double lendMoney) {
        this.lendMoney = lendMoney;
    }

    public Timestamp getExactDate() {
        return exactDate;
    }

    public void setExactDate(Timestamp exactDate) {
        this.exactDate = exactDate;
    }
}
