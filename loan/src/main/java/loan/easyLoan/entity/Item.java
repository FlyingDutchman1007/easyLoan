package loan.easyLoan.entity;

/**
 * @author Ywr
 * @date 2019/6/11 9:14
 */
public class Item {
    private double thisPeriodSumRepaidMoney;
    private double repayMoney;
    private int billId;
    private String outBoundAccount;

    public double getThisPeriodSumRepaidMoney() {
        return thisPeriodSumRepaidMoney;
    }

    public void setThisPeriodSumRepaidMoney(double thisPeriodSumRepaidMoney) {
        this.thisPeriodSumRepaidMoney = thisPeriodSumRepaidMoney;
    }

    public double getRepayMoney() {
        return repayMoney;
    }

    public void setRepayMoney(double repayMoney) {
        this.repayMoney = repayMoney;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getOutBoundAccount() {
        return outBoundAccount;
    }

    public void setOutBoundAccount(String outBoundAccount) {
        this.outBoundAccount = outBoundAccount;
    }

    @Override
    public String
    toString() {
        return "Item{" +
                "thisPeriodSumRepaidMoney=" + thisPeriodSumRepaidMoney +
                ", repayMoney=" + repayMoney +
                ", billId=" + billId +
                ", outBoundAccount='" + outBoundAccount + '\'' +
                '}';
    }
}
