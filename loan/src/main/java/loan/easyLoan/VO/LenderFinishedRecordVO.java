package loan.easyLoan.VO;

import java.util.Date;

public class LenderFinishedRecordVO {

    private int billId;
    private Date startDate;
    private double money;
    private double interest;
    private double liquidatedMoney;
    private double totalMoney;
    private double rate;
    private int limitMonths;
    private Date payUpDate;

    public LenderFinishedRecordVO() {}

    public LenderFinishedRecordVO(int billId, Date startDate, double money, double interest, double liquidatedMoney, double totalMoney, double rate, int limitMonths, Date payUpDate) {
        this.billId = billId;
        this.startDate = startDate;
        this.money = money;
        this.interest = interest;
        this.liquidatedMoney = liquidatedMoney;
        this.totalMoney = totalMoney;
        this.rate = rate;
        this.limitMonths = limitMonths;
        this.payUpDate = payUpDate;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getLiquidatedMoney() {
        return liquidatedMoney;
    }

    public void setLiquidatedMoney(double liquidatedMoney) {
        this.liquidatedMoney = liquidatedMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getLimitMonths() {
        return limitMonths;
    }

    public void setLimitMonths(int limitMonths) {
        this.limitMonths = limitMonths;
    }

    public Date getPayUpDate() {
        return payUpDate;
    }

    public void setPayUpDate(Date payUpDate) {
        this.payUpDate = payUpDate;
    }
}
