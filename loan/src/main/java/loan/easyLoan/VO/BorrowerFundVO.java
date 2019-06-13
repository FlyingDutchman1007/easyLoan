package loan.easyLoan.VO;

public class BorrowerFundVO {
    private String userName;
    private String bankAccount;
    private double accountBalance;
    private String fundsAccount;
    private String idCard;
    private double borrowedMoney;
    private int creditScore;
    private double totalLimit;
    private double availableLimit;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

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

    public double getBorrowedMoney() {
        return borrowedMoney;
    }

    public void setBorrowedMoney(double borrowedMoney) {
        this.borrowedMoney = borrowedMoney;
    }

    public long getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(double totalLimit) {
        this.totalLimit = totalLimit;
    }

    public double getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(double availableLimit) {
        this.availableLimit = availableLimit;
    }

    public BorrowerFundVO(String userNmae, String bankAccount, double accountBalance, String fundsAccount, String idCard, double borrowedMoney, int creditScore, double totalLimit, double availableLimit) {
        this.userName = userNmae;
        this.bankAccount = bankAccount;
        this.accountBalance = accountBalance;
        this.fundsAccount = fundsAccount;
        this.idCard = idCard;
        this.borrowedMoney = borrowedMoney;
        this.creditScore = creditScore;
        this.totalLimit = totalLimit;
        this.availableLimit = availableLimit;
    }

    public BorrowerFundVO() {
    }
}
