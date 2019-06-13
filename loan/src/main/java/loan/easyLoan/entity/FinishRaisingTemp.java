package loan.easyLoan.entity;

public class FinishRaisingTemp {

    private int billId;
    private String borrowerId;
    private String lenderId;
    private double lendMoney;
    private double intendMoney;
    private double payRate;
    private int payType;
    private int limitMonths;
    private String inBoundAccount;
    private String outBoundAccount;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getLenderId() {
        return lenderId;
    }

    public void setLenderId(String lenderId) {
        this.lenderId = lenderId;
    }

    public double getLendMoney() {
        return lendMoney;
    }

    public void setLendMoney(double lendMoney) {
        this.lendMoney = lendMoney;
    }

    public double getIntendMoney() {
        return intendMoney;
    }

    public void setIntendMoney(double intendMoney) {
        this.intendMoney = intendMoney;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getLimitMonths() {
        return limitMonths;
    }

    public void setLimitMonths(int limitMonths) {
        this.limitMonths = limitMonths;
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

    @Override
    public String toString() {
        return "FinishRaisingTemp{" +
                "billId=" + billId +
                ", borrowerId='" + borrowerId + '\'' +
                ", lenderId='" + lenderId + '\'' +
                ", lendMoney=" + lendMoney +
                ", intendMoney=" + intendMoney +
                ", payRate=" + payRate +
                ", payType=" + payType +
                ", limitMonths=" + limitMonths +
                ", inBoundAccount='" + inBoundAccount + '\'' +
                ", outBoundAccount='" + outBoundAccount + '\'' +
                '}';
    }
}
