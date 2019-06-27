package loan.easyLoan.entity;

/**
 * @author Ywr
 * @date 2019/6/21 17:33
 */
public class CalculateTable {
    private int period;
    private double repayMoney;
    private double repayPrincipal;
    private double repayInterest;
    private double balance;

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getRepayMoney() {
        return repayMoney;
    }

    public void setRepayMoney(double repayMoney) {
        this.repayMoney = repayMoney;
    }

    public double getRepayPrincipal() {
        return repayPrincipal;
    }

    public void setRepayPrincipal(double repayPrincipal) {
        this.repayPrincipal = repayPrincipal;
    }

    public double getRepayInterest() {
        return repayInterest;
    }

    public void setRepayInterest(double repayInterest) {
        this.repayInterest = repayInterest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CalculateTable{" +
                "period=" + period +
                ", repayMoney=" + repayMoney +
                ", repayPrincipal=" + repayPrincipal +
                ", repayInterest=" + repayInterest +
                ", balance=" + balance +
                '}';
    }
}
