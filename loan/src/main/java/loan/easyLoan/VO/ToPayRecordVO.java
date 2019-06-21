package loan.easyLoan.VO;

<<<<<<< HEAD
import java.sql.Timestamp;
=======
import java.util.Date;
>>>>>>> Ywr470832459-patch-1

public class ToPayRecordVO {

    private int billId;
<<<<<<< HEAD
    private Timestamp startDate;
=======
    private Date startDate;
>>>>>>> Ywr470832459-patch-1
    private double money;
    private double unpayMoney;
    private double nextTimeShouldPay;
    private double liquidatedMoney;
    private double rate;
    private int payType;
<<<<<<< HEAD
    private Timestamp deadline;

    public ToPayRecordVO() {}

    public ToPayRecordVO(int billId, Timestamp startDate, double money, double unpayMoney, double nextTimeShouldPay, double liquidatedMoney, double rate, int payType, Timestamp deadline) {
=======
    private Date deadline;

    public ToPayRecordVO() {}

    public ToPayRecordVO(int billId, Date startDate, double money, double unpayMoney, double nextTimeShouldPay, double liquidatedMoney, double rate, int payType, Date deadline) {
>>>>>>> Ywr470832459-patch-1
        this.billId = billId;
        this.startDate = startDate;
        this.money = money;
        this.unpayMoney = unpayMoney;
        this.nextTimeShouldPay = nextTimeShouldPay;
        this.liquidatedMoney = liquidatedMoney;
        this.rate = rate;
        this.payType = payType;
        this.deadline = deadline;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getUnpayMoney() {
        return unpayMoney;
    }

    public void setUnpayMoney(double unpayMoney) {
        this.unpayMoney = unpayMoney;
    }

    public double getNextTimeShouldPay() {
        return nextTimeShouldPay;
    }

    public void setNextTimeShouldPay(double nextTimeShouldPay) {
        this.nextTimeShouldPay = nextTimeShouldPay;
    }

    public double getLiquidatedMoney() {
        return liquidatedMoney;
    }

    public void setLiquidatedMoney(double liquidatedMoney) {
        this.liquidatedMoney = liquidatedMoney;
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

<<<<<<< HEAD
    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
=======
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
>>>>>>> Ywr470832459-patch-1
        this.deadline = deadline;
    }
}
