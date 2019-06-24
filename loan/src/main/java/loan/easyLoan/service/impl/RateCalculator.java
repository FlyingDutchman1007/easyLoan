package loan.easyLoan.service.impl;

import loan.easyLoan.entity.CalculateTable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 等额本息还款法
 *
 * @author Ywr
 * @date 2019/6/21 17:20
 */
public class RateCalculator {

    public List<CalculateTable> calculate(double lendMoney, float payRate, int limitMonths, int payType){
        List<CalculateTable> list = new ArrayList<>();
        int period = limitMonths / payType;

        //本金
        BigDecimal invest = new BigDecimal(lendMoney);
        // 每月本息金额  = (本金×月利率×(1＋月利率)＾还款月数)÷ ((1＋月利率)＾还款月数-1)
        BigDecimal monthIncome = invest.multiply(new BigDecimal(payRate * Math.pow(1 +
                payRate, period))).divide(new BigDecimal(Math.pow(1 + payRate, period) - 1), 2,
                BigDecimal.ROUND_HALF_UP);

        //每月本金
        BigDecimal monthCapital;
        //每月利息
        BigDecimal monthInterest;
        //剩余本金
        BigDecimal capital = invest;
        for (int i = 1; i < period + 1; i++) {
            CalculateTable calculateTable = new CalculateTable();
            if(i == period){
                monthCapital = capital;
                monthInterest = capital.multiply(new BigDecimal(payRate)).setScale(2, BigDecimal
                        .ROUND_HALF_UP);
                capital = BigDecimal.ZERO;

                calculateTable.setPeriod(i);
                calculateTable.setRepayMoney(monthIncome.doubleValue());
                calculateTable.setBalance(capital.doubleValue());
                calculateTable.setRepayPrincipal(monthCapital.doubleValue());
                calculateTable.setRepayInterest(monthInterest.doubleValue());
                list.add(calculateTable);
            }else {
                //每月利息  = 剩余本金 x 贷款月利率
                monthInterest = capital.multiply(new BigDecimal(payRate)).setScale(2, BigDecimal
                        .ROUND_HALF_UP);
                // 每月本金 = 本金×月利率×(1+月利率)^(还款月序号-1)÷((1+月利率)^还款月数-1)
                monthCapital = invest.multiply(new BigDecimal(payRate * (Math.pow((1 + payRate),
                        i - 1)))).divide(new BigDecimal(Math.pow(1 + payRate, period) - 1), 2,
                        BigDecimal.ROUND_HALF_UP);

                capital = capital.subtract(monthCapital);

                calculateTable.setPeriod(i);
                calculateTable.setRepayMoney(monthIncome.doubleValue());
                calculateTable.setBalance(capital.doubleValue());
                calculateTable.setRepayPrincipal(monthCapital.doubleValue());
                calculateTable.setRepayInterest(monthInterest.doubleValue());
                list.add(calculateTable);
            }
        }

        return list;
    }
}
