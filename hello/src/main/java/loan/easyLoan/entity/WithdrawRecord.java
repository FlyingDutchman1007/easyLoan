package loan.easyLoan.entity;

import java.util.Date;

public class WithdrawRecord {
    private Integer serialNumber;

    private Date withdrawDate;

    private Double withdrawMoney;

    private String bankAccount;

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getWithdrawDate() {
        return withdrawDate;
    }

    public void setWithdrawDate(Date withdrawDate) {
        this.withdrawDate = withdrawDate;
    }

    public Double getWithdrawMoney() {
        return withdrawMoney;
    }

    public void setWithdrawMoney(Double withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}