package loan.easyLoan.VO;
// 可用于lendMatchController
public class BorrowerToTradeVO {

    private int billId;
    private double intendMoney;
    private java.sql.Timestamp startDate;
    private double rate;
    private int payType;
    private int limitMonths;
    private double raisedMoney;

    public BorrowerToTradeVO() {}

    public BorrowerToTradeVO(int billId, double intendMoney, java.sql.Timestamp startDate, double rate, int payType, int limitMonths, double raisedMoney) {
        this.billId = billId;
        this.intendMoney = intendMoney;
        this.startDate = startDate;
        this.rate = rate;
        this.payType = payType;
        this.limitMonths = limitMonths;
        this.raisedMoney = raisedMoney;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getIntendMoney() {
        return intendMoney;
    }

    public void setIntendMoney(double intendMoney) {
        this.intendMoney = intendMoney;
    }

    public java.sql.Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(java.sql.Timestamp startDate) {
        this.startDate = startDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
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

    public double getRaisedMoney() {
        return raisedMoney;
    }

    public void setRaisedMoney(double raisedMoney) {
        this.raisedMoney = raisedMoney;
    }
}
