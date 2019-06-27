package loan.easyLoan.entity;

/**
 * @author Ywr
 * @date 2019/6/11 9:14
 */
public class Item {
    private double thisPeriodSumRepaidMoney; //这期总的还款金额，每月清零
    private double repayMoney; // 最近一次还钱数，会覆盖的
    private int billId;
    private String outBoundAccount; // 借出方的账户

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
