package loan.easyLoan.entity;

import java.util.Date;

public class Trade {
    private Integer serialNumber;

    private Integer billId;

    private String inBoundAccount;

    private String outBoundAccount;

    private Double money;

    private Integer limitMonths;

    private Integer payType;

    private Float payRate;

    private Date exactDate;

    private Double nextTimePay;

    private Double repaidPrincipal;

    private Double repaidInterest;

    private Double liquidatedMoney;

    private Double shouldRepayPrincipal;

    private Double shouldRepayInterest;

    private Double shouldRepayLiquidatedMoney;

    private Date finishedDate;

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getInBoundAccount() {
        return inBoundAccount;
    }

    public void setInBoundAccount(String inBoundAccount) {
        this.inBoundAccount = inBoundAccount;
    }

    public String getOutBoundAccount() {
        return outBoundAccount;
    }

    public void setOutBoundAccount(String outBoundAccount) {
        this.outBoundAccount = outBoundAccount;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getLimitMonths() {
        return limitMonths;
    }

    public void setLimitMonths(Integer limitMonths) {
        this.limitMonths = limitMonths;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Float getPayRate() {
        return payRate;
    }

    public void setPayRate(Float payRate) {
        this.payRate = payRate;
    }

    public Date getExactDate() {
        return exactDate;
    }

    public void setExactDate(Date exactDate) {
        this.exactDate = exactDate;
    }

    public Double getNextTimePay() {
        return nextTimePay;
    }

    public void setNextTimePay(Double nextTimePay) {
        this.nextTimePay = nextTimePay;
    }

    public Double getRepaidPrincipal() {
        return repaidPrincipal;
    }

    public void setRepaidPrincipal(Double repaidPrincipal) {
        this.repaidPrincipal = repaidPrincipal;
    }

    public Double getRepaidInterest() {
        return repaidInterest;
    }

    public void setRepaidInterest(Double repaidInterest) {
        this.repaidInterest = repaidInterest;
    }

    public Double getLiquidatedMoney() {
        return liquidatedMoney;
    }

    public void setLiquidatedMoney(Double liquidatedMoney) {
        this.liquidatedMoney = liquidatedMoney;
    }

    public Double getShouldRepayPrincipal() {
        return shouldRepayPrincipal;
    }

    public void setShouldRepayPrincipal(Double shouldRepayPrincipal) {
        this.shouldRepayPrincipal = shouldRepayPrincipal;
    }

    public Double getShouldRepayInterest() {
        return shouldRepayInterest;
    }

    public void setShouldRepayInterest(Double shouldRepayInterest) {
        this.shouldRepayInterest = shouldRepayInterest;
    }

    public Double getShouldRepayLiquidatedMoney() {
        return shouldRepayLiquidatedMoney;
    }

    public void setShouldRepayLiquidatedMoney(Double shouldRepayLiquidatedMoney) {
        this.shouldRepayLiquidatedMoney = shouldRepayLiquidatedMoney;
    }

    public Date getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }
}