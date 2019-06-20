package loan.easyLoan.VO;

import java.sql.Timestamp;

public class ToPayRecordVO {

    private int billId;
    private Timestamp startDate;
    private double money;
    private double unpayMoney;
    private double nextTimeShouldPay;
    private double liquidatedMoney;
    private double rate;
    private int payType;
    private Timestamp deadline;

    public ToPayRecordVO() {}

    public ToPayRecordVO(int billId, Timestamp startDate, double money, double unpayMoney, double nextTimeShouldPay, double liquidatedMoney, double rate, int payType, Timestamp deadline) {
        this.billId = billId;
        this.startDate = startDate;
        this.money = money;
        this.unpayMoney = unpayMoney;
        this.nextTimeShouldPay = nextTimeShouldPay;
        this.liquidatedMoney = liquidatedMoney;
        this.rate = rate;
        this.payType = payType;
        this.deadline = deadline;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getUnpayMoney() {
        return unpayMoney;
    }

    public void setUnpayMoney(double unpayMoney) {
        this.unpayMoney = unpayMoney;
    }

    public double getNextTimeShouldPay() {
        return nextTimeShouldPay;
    }

    public void setNextTimeShouldPay(double nextTimeShouldPay) {
        this.nextTimeShouldPay = nextTimeShouldPay;
    }

    public double getLiquidatedMoney() {
        return liquidatedMoney;
    }

    public void setLiquidatedMoney(double liquidatedMoney) {
        this.liquidatedMoney = liquidatedMoney;
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

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }
}
