package loan.easyLoan.entity;

import java.util.Date;

public class BorrowMoneyFlow {
    private Integer serialNumber;

    private Integer billId;

    private String inBoundAccount;

    private String outBoundAccount;

    private Double money;

    private Date exactDate;

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

    public Date getExactDate() {
        return exactDate;
    }

    public void setExactDate(Date exactDate) {
        this.exactDate = exactDate;
    }
}