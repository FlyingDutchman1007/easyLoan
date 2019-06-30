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

    public List<CalculateTable> calculate(double lendMoney, float payRate, int limitMonths, int payType, int rateCalculateType) {
        List<CalculateTable> list = new ArrayList<>();
        int period = limitMonths / payType;
        double periodRate = payRate * payType;

        if (rateCalculateType == 1) {
            //本金
            BigDecimal invest = new BigDecimal(lendMoney);
            //每期本金
            BigDecimal monthCapital;
            //每期利息
            BigDecimal monthInterest;
            //剩余本金
            BigDecimal capital = invest;
            // 每期本息金额  = (本金×期利率×(1＋期利率)＾还款期数)÷ ((1＋期利率)＾还款期数-1)
            BigDecimal monthIncome = invest.multiply(new BigDecimal(periodRate * Math.pow(1 +
                    periodRate, period))).divide(new BigDecimal(Math.pow(1 + periodRate, period) - 1), 2,
                    BigDecimal.ROUND_HALF_UP);
            for (int i = 1; i < period + 1; i++) {
                CalculateTable calculateTable = new CalculateTable();
                if (i == period) {
                    monthCapital = capital;
                    monthInterest = capital.multiply(new BigDecimal(periodRate)).setScale(2, BigDecimal
                            .ROUND_HALF_UP);
                    capital = BigDecimal.ZERO;

                    calculateTable.setPeriod(i);
                    calculateTable.setRepayMoney(monthIncome.doubleValue());
                    calculateTable.setBalance(capital.doubleValue());
                    calculateTable.setRepayPrincipal(monthCapital.doubleValue());
                    calculateTable.setRepayInterest(monthInterest.doubleValue());
                    list.add(calculateTable);
                } else {
                    //每期利息  = 剩余本金 x 贷款期利率
                    monthInterest = capital.multiply(new BigDecimal(periodRate)).setScale(2, BigDecimal
                            .ROUND_HALF_UP);
                    // 每期本金 = 本金×期利率×(1+期利率)^(还款期序号-1)÷((1+期利率)^还款期数-1)
                    monthCapital = invest.multiply(new BigDecimal(periodRate * (Math.pow((1 + periodRate),
                            i - 1)))).divide(new BigDecimal(Math.pow(1 + periodRate, period) - 1), 2,
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
        } else if (rateCalculateType == 2) {
            //本金
            BigDecimal invest = new BigDecimal(lendMoney);
            //每期本金
            BigDecimal monthCapital;
            //每期利息
            BigDecimal monthInterest;
            //剩余本金
            BigDecimal capital = invest;
            for (int i = 1; i < period + 1; i++) {
                CalculateTable calculateTable = new CalculateTable();
                if (i == period) {
                    monthCapital = capital;
                    monthInterest = capital.multiply(new BigDecimal(periodRate)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    capital = BigDecimal.ZERO;
                    // 每期本息金额  =  贷款本金/还款期数 + （贷款本金-累计已还本金）* 期利率
                    BigDecimal monthIncome = monthCapital.add(monthInterest);

                    calculateTable.setPeriod(i);
                    calculateTable.setRepayMoney(monthIncome.doubleValue());
                    calculateTable.setBalance(capital.doubleValue());
                    calculateTable.setRepayPrincipal(monthCapital.doubleValue());
                    calculateTable.setRepayInterest(monthInterest.doubleValue());
                    list.add(calculateTable);
                } else {
                    // 每期应还本金 = 贷款本金/还款期数
                    monthCapital = invest.divide(new BigDecimal(period)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    //每期利息 = 第n期贷款剩余本金 * 期利率 / 30 * 第n期的实际天数(按月)
                    monthInterest = capital.multiply(new BigDecimal(periodRate)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    // 每期本息金额  =  贷款本金/还款期数 + （贷款本金-累计已还本金）* 期利率
                    BigDecimal monthIncome = capital.multiply(new BigDecimal(periodRate)).add(invest.divide(new BigDecimal(period))).setScale(2, BigDecimal.ROUND_HALF_UP);
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
        } else {
            //本金
            BigDecimal invest = new BigDecimal(lendMoney);
            //每期本金
            BigDecimal monthCapital;
            //每期利息
            BigDecimal monthInterest;
            //剩余本金
            BigDecimal capital = invest;
            for (int i = 1; i < period + 1; i++) {
                CalculateTable calculateTable = new CalculateTable();
                // 每期应还本金 = 贷款本金/还款期数
                monthCapital = invest.divide(new BigDecimal(period)).setScale(2, BigDecimal.ROUND_HALF_UP);
                //每期利息 = 总利息/还款期数
                monthInterest = (new BigDecimal(periodRate * limitMonths / period / period)).multiply(invest).setScale(2, BigDecimal.ROUND_HALF_UP);
                // 每期本息金额 =  每期应还本金 + 每期利息
                BigDecimal monthIncome = monthCapital.add(monthInterest);
                capital = capital.subtract(monthCapital);

                calculateTable.setPeriod(i);
                calculateTable.setRepayMoney(monthIncome.doubleValue());
                calculateTable.setBalance(capital.doubleValue());
                calculateTable.setRepayPrincipal(monthCapital.doubleValue());
                calculateTable.setRepayInterest(monthInterest.doubleValue());
                list.add(calculateTable);
            }
            return list;
        }
    }
}