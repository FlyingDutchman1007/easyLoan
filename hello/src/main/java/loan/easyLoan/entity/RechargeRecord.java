package loan.easyLoan.entity;

import java.util.Date;

public class RechargeRecord {
    private Integer serialNumber;

    private Date rechargeDate;

    private Double rechargeMoney;

    private String bankAccount;

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getRechargeDate() {
        return rechargeDate;
    }

    public void setRechargeDate(Date rechargeDate) {
        this.rechargeDate = rechargeDate;
    }

    public Double getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(Double rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}