package loan.easyLoan.entity;

/**
 * @author Ywr
 * @date 2019/6/12 8:54
 */
public class CreditParameter {

    private int creditScore;
    private double totalLimit;
    private double availableLimit;

    public int getCreditScore() {
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

    @Override
    public String toString() {
        return "CreditParameter{" +
                "creditScore=" + creditScore +
                ", totalLimit=" + totalLimit +
                ", availableLimit=" + availableLimit +
                '}';
    }
}
