package loan.easyLoan.entity;

public class BorrowerAccount {
    private String fundsAccount;

    private String idCard;

    private Double accountBalance;

    private Double borrowedMoney;

    private Integer creditScore;

    private Double totalLimit;

    private Double availableLimit;

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

    public Double getBorrowedMoney() {
        return borrowedMoney;
    }

    public void setBorrowedMoney(Double borrowedMoney) {
        this.borrowedMoney = borrowedMoney;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Double getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(Double totalLimit) {
        this.totalLimit = totalLimit;
    }

    public Double getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(Double availableLimit) {
        this.availableLimit = availableLimit;
    }
}