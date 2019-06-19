/**
*
*
*/
package loan.easyLoan.VO;

import java.sql.Date;
import java.sql.Timestamp;

public class RepaymentRecordVO {

    private int billId;
    private String startDate;
    private double startMoney;
    private double payRate;
    private int payType;
    private double unpayMoney;
    private double nextTimeShouldPay;
    private double liquidatedMoney;
    private String deadline;
    /*
     *  private int billId;
     *  private java.sql.Timestamp exactDate;
     * private double money;
     * private double payRate;
     * private int payType;
     * private double shouldRepayPrincipal;
     * private double shouldRepayInterest;
     * private double shouldRepayLiquidatedMoney;
     * */
/*
* bill_id,exact_date,money,pay_rate,pay_type,should_repay_principal,should_repay_interest,should_repay_liquidated_money
* */



    public void setBillId(int billId) {
        this.billId = billId;
    }



    public void setStartMoney(double startMoney) {
        this.startMoney = startMoney;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getBillId() {
        return billId;
    }


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getStartMoney() {
        return startMoney;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getPayType() {
        return payType;
    }

    public double getUnpayMoney() {
        return unpayMoney;
    }

    public double getNextTimeShouldPay() {
        return nextTimeShouldPay;
    }

    public double getLiquidatedMoney() {
        return liquidatedMoney;
    }

    public String getDeadline() {
        return deadline;
    }

    public RepaymentRecordVO() {
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public void setUnpayMoney(double unpayMoney) {
        this.unpayMoney = unpayMoney;
    }

    public void setNextTimeShouldPay(double nextTimeShouldPay) {
        this.nextTimeShouldPay = nextTimeShouldPay;
    }

    public void setLiquidatedMoney(double liquidatedMoney) {
        this.liquidatedMoney = liquidatedMoney;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
