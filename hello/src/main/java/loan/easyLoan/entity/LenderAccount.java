package loan.easyLoan.entity;

public class LenderAccount {
    private String fundsAccount;

    private String idCard;

    private Double accountBalance;

    private Double lentMoney;

    private Double currentIncome;

    private Double expectedIncome;

    public String getFundsAccount() {
        return fundsAccount;
    }

    public void setFundsAccount(String fundsAccount) {
        this.fundsAccount = fundsAccount;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Double getLentMoney() {
        return lentMoney;
    }

    public void setLentMoney(Double lentMoney) {
        this.lentMoney = lentMoney;
    }

    public Double getCurrentIncome() {
        return currentIncome;
    }

    public void setCurrentIncome(Double currentIncome) {
        this.currentIncome = currentIncome;
    }

    public Double getExpectedIncome() {
        return expectedIncome;
    }

    public void setExpectedIncome(Double expectedIncome) {
        this.expectedIncome = expectedIncome;
    }
}