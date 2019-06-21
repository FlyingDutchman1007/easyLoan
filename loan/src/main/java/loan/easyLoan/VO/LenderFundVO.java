package loan.easyLoan.VO;

public class LenderFundVO {

    private String userName;
    private String bankAccount;
    private double accountBalance;
<<<<<<< HEAD
=======
    private String fundsAccount;
    private String idCard;
>>>>>>> Ywr470832459-patch-1
    private double lendMoney;
    private double totalBenefit;
    private double futureBenefit;
    private double availableMoney;

    public LenderFundVO() {}

    public LenderFundVO(String userName, String bankAccount, double accountBalance, double lendMoney, double totalBenefit, double futureBenefit, double availableMoney) {
        this.userName = userName;
        this.bankAccount = bankAccount;
        this.accountBalance = accountBalance;
        this.lendMoney = lendMoney;
        this.totalBenefit = totalBenefit;
        this.futureBenefit = futureBenefit;
        this.availableMoney = availableMoney;
    }

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

    public double getLendMoney() {
        return lendMoney;
    }

    public void setLendMoney(double lendMoney) {
        this.lendMoney = lendMoney;
    }

    public double getTotalBenefit() {
        return totalBenefit;
    }

    public void setTotalBenefit(double totalBenefit) {
        this.totalBenefit = totalBenefit;
    }

    public double getFutureBenefit() {
        return futureBenefit;
    }

    public void setFutureBenefit(double futureBenefit) {
        this.futureBenefit = futureBenefit;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }
<<<<<<< HEAD
=======

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

    @Override
    public String toString() {
        return "LenderFundVO{" +
                "userName='" + userName + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", accountBalance=" + accountBalance +
                ", fundsAccount='" + fundsAccount + '\'' +
                ", idCard='" + idCard + '\'' +
                ", lendMoney=" + lendMoney +
                ", totalBenefit=" + totalBenefit +
                ", futureBenefit=" + futureBenefit +
                ", availableMoney=" + availableMoney +
                '}';
    }
>>>>>>> Ywr470832459-patch-1
}
