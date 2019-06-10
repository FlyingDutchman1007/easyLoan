package loan.easyLoan.entity;

import java.util.Date;

public class IntendBorrow {
    private Integer billId;

    private String idCard;

    private Double intendMoney;

    private Date startDate;

    private Float payRate;

    private Integer payType;

    private Integer limitMonths;

    private Integer state;

    private Double raisedMoney;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getIntendMoney() {
        return intendMoney;
    }

    public void setIntendMoney(Double intendMoney) {
        this.intendMoney = intendMoney;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Float getPayRate() {
        return payRate;
    }

    public void setPayRate(Float payRate) {
        this.payRate = payRate;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getLimitMonths() {
        return limitMonths;
    }

    public void setLimitMonths(Integer limitMonths) {
        this.limitMonths = limitMonths;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getRaisedMoney() {
        return raisedMoney;
    }

    public void setRaisedMoney(Double raisedMoney) {
        this.raisedMoney = raisedMoney;
    }
}