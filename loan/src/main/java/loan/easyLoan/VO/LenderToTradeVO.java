package loan.easyLoan.VO;

<<<<<<< HEAD
import java.sql.Timestamp;
=======
import java.util.Date;
>>>>>>> Ywr470832459-patch-1

public class LenderToTradeVO {
    private int billId;
    private double intendMoney;
<<<<<<< HEAD
    private Timestamp startDate;
=======
    private Date startDate;
>>>>>>> Ywr470832459-patch-1
    private double rate;
    private int payType;
    private int limitMonths;
    private double raisedMoney;
    private double lendMoney;
<<<<<<< HEAD
    private Timestamp exactDate;

    public LenderToTradeVO() {}

    public LenderToTradeVO(int billId, double intendMoney, Timestamp startDate, double rate, int payType, int limitMonths, double raisedMoney, double lendMoney, Timestamp exactDate) {
=======
    private Date exactDate;

    public LenderToTradeVO() {}

    public LenderToTradeVO(int billId, double intendMoney, Date startDate, double rate, int payType, int limitMonths, double raisedMoney, double lendMoney, Date exactDate) {
>>>>>>> Ywr470832459-patch-1
        this.billId = billId;
        this.intendMoney = intendMoney;
        this.startDate = startDate;
        this.rate = rate;
        this.payType = payType;
        this.limitMonths = limitMonths;
        this.raisedMoney = raisedMoney;
        this.lendMoney = lendMoney;
        this.exactDate = exactDate;
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

<<<<<<< HEAD
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
=======
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
>>>>>>> Ywr470832459-patch-1
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

    public double getLendMoney() {
        return lendMoney;
    }

    public void setLendMoney(double lendMoney) {
        this.lendMoney = lendMoney;
    }

<<<<<<< HEAD
    public Timestamp getExactDate() {
        return exactDate;
    }

    public void setExactDate(Timestamp exactDate) {
=======
    public Date getExactDate() {
        return exactDate;
    }

    public void setExactDate(Date exactDate) {
>>>>>>> Ywr470832459-patch-1
        this.exactDate = exactDate;
    }
}
