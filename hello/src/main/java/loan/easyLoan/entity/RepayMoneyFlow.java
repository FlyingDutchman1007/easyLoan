package loan.easyLoan.entity;

import java.util.Date;

public class RepayMoneyFlow {
    private Integer serialNumber;

    private Integer billId;

    private String inBoundAccount;

    private String outBoundAccount;

    private Date exactDate;

    private Double money;

    private Double interestMoney;

    private Double liquidatedMoney;

    private Double principalMoney;

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

    public Date getExactDate() {
        return exactDate;
    }

    public void setExactDate(Date exactDate) {
        this.exactDate = exactDate;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getInterestMoney() {
        return interestMoney;
    }

    public void setInterestMoney(Double interestMoney) {
        this.interestMoney = interestMoney;
    }

    public Double getLiquidatedMoney() {
        return liquidatedMoney;
    }

    public void setLiquidatedMoney(Double liquidatedMoney) {
        this.liquidatedMoney = liquidatedMoney;
    }

    public Double getPrincipalMoney() {
        return principalMoney;
    }

    public void setPrincipalMoney(Double principalMoney) {
        this.principalMoney = principalMoney;
    }
}