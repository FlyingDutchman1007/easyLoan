package loan.easyLoan.VO;

import java.util.Date;

public class LenderToReceiveVO {

    private int billId;
    private Date startDate;
    private double money;
    private double collectedMoney;
    private double interest;
    private double collectedInterest;
    private double liquidatedMoney;
    private double collectedLiquidatedMoney;
    private double totalMoney;
    private double collectedTotalMoney;
    private double rate;
    private int payType;
    private Date deadline;

    public LenderToReceiveVO() {}

    public LenderToReceiveVO(int billId, Date startDate, double money, double collectedMoney, double interest, double collectedInterest, double liquidatedMoney, double collectedLiquidatedMoney, double totalMoney, double collectedTotalMoney, double rate, int payType, Date deadline) {
        this.billId = billId;
        this.startDate = startDate;
        this.money = money;
        this.collectedMoney = collectedMoney;
        this.interest = interest;
        this.collectedInterest = collectedInterest;
        this.liquidatedMoney = liquidatedMoney;
        this.collectedLiquidatedMoney = collectedLiquidatedMoney;
        this.totalMoney = totalMoney;
        this.collectedTotalMoney = collectedTotalMoney;
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

    public double getCollectedMoney() {
        return collectedMoney;
    }

    public void setCollectedMoney(double collectedMoney) {
        this.collectedMoney = collectedMoney;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getCollectedInterest() {
        return collectedInterest;
    }

    public void setCollectedInterest(double collectedInterest) {
        this.collectedInterest = collectedInterest;
    }

    public double getLiquidatedMoney() {
        return liquidatedMoney;
    }

    public void setLiquidatedMoney(double liquidatedMoney) {
        this.liquidatedMoney = liquidatedMoney;
    }

    public double getCollectedLiquidatedMoney() {
        return collectedLiquidatedMoney;
    }

    public void setCollectedLiquidatedMoney(double collectedLiquidatedMoney) {
        this.collectedLiquidatedMoney = collectedLiquidatedMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getCollectedTotalMoney() {
        return collectedTotalMoney;
    }

    public void setCollectedTotalMoney(double collectedTotalMoney) {
        this.collectedTotalMoney = collectedTotalMoney;
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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
