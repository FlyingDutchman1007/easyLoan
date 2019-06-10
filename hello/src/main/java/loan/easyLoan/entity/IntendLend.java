package loan.easyLoan.entity;

import java.util.Date;

public class IntendLend extends IntendLendKey {
    private Double lendMoney;

    private Date startDate;

    private Integer state;

    public Double getLendMoney() {
        return lendMoney;
    }

    public void setLendMoney(Double lendMoney) {
        this.lendMoney = lendMoney;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}