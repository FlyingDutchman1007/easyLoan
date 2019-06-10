package loan.easyLoan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(Integer value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(Integer value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(Integer value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(Integer value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<Integer> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<Integer> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountIsNull() {
            addCriterion("in_bound_account is null");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountIsNotNull() {
            addCriterion("in_bound_account is not null");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountEqualTo(String value) {
            addCriterion("in_bound_account =", value, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountNotEqualTo(String value) {
            addCriterion("in_bound_account <>", value, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountGreaterThan(String value) {
            addCriterion("in_bound_account >", value, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountGreaterThanOrEqualTo(String value) {
            addCriterion("in_bound_account >=", value, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountLessThan(String value) {
            addCriterion("in_bound_account <", value, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountLessThanOrEqualTo(String value) {
            addCriterion("in_bound_account <=", value, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountLike(String value) {
            addCriterion("in_bound_account like", value, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountNotLike(String value) {
            addCriterion("in_bound_account not like", value, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountIn(List<String> values) {
            addCriterion("in_bound_account in", values, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountNotIn(List<String> values) {
            addCriterion("in_bound_account not in", values, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountBetween(String value1, String value2) {
            addCriterion("in_bound_account between", value1, value2, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andInBoundAccountNotBetween(String value1, String value2) {
            addCriterion("in_bound_account not between", value1, value2, "inBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountIsNull() {
            addCriterion("out_bound_account is null");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountIsNotNull() {
            addCriterion("out_bound_account is not null");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountEqualTo(String value) {
            addCriterion("out_bound_account =", value, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountNotEqualTo(String value) {
            addCriterion("out_bound_account <>", value, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountGreaterThan(String value) {
            addCriterion("out_bound_account >", value, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountGreaterThanOrEqualTo(String value) {
            addCriterion("out_bound_account >=", value, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountLessThan(String value) {
            addCriterion("out_bound_account <", value, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountLessThanOrEqualTo(String value) {
            addCriterion("out_bound_account <=", value, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountLike(String value) {
            addCriterion("out_bound_account like", value, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountNotLike(String value) {
            addCriterion("out_bound_account not like", value, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountIn(List<String> values) {
            addCriterion("out_bound_account in", values, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountNotIn(List<String> values) {
            addCriterion("out_bound_account not in", values, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountBetween(String value1, String value2) {
            addCriterion("out_bound_account between", value1, value2, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andOutBoundAccountNotBetween(String value1, String value2) {
            addCriterion("out_bound_account not between", value1, value2, "outBoundAccount");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsIsNull() {
            addCriterion("limit_months is null");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsIsNotNull() {
            addCriterion("limit_months is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsEqualTo(Integer value) {
            addCriterion("limit_months =", value, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsNotEqualTo(Integer value) {
            addCriterion("limit_months <>", value, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsGreaterThan(Integer value) {
            addCriterion("limit_months >", value, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_months >=", value, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsLessThan(Integer value) {
            addCriterion("limit_months <", value, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsLessThanOrEqualTo(Integer value) {
            addCriterion("limit_months <=", value, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsIn(List<Integer> values) {
            addCriterion("limit_months in", values, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsNotIn(List<Integer> values) {
            addCriterion("limit_months not in", values, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsBetween(Integer value1, Integer value2) {
            addCriterion("limit_months between", value1, value2, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andLimitMonthsNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_months not between", value1, value2, "limitMonths");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayRateIsNull() {
            addCriterion("pay_rate is null");
            return (Criteria) this;
        }

        public Criteria andPayRateIsNotNull() {
            addCriterion("pay_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPayRateEqualTo(Float value) {
            addCriterion("pay_rate =", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateNotEqualTo(Float value) {
            addCriterion("pay_rate <>", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateGreaterThan(Float value) {
            addCriterion("pay_rate >", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_rate >=", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateLessThan(Float value) {
            addCriterion("pay_rate <", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateLessThanOrEqualTo(Float value) {
            addCriterion("pay_rate <=", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateIn(List<Float> values) {
            addCriterion("pay_rate in", values, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateNotIn(List<Float> values) {
            addCriterion("pay_rate not in", values, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateBetween(Float value1, Float value2) {
            addCriterion("pay_rate between", value1, value2, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateNotBetween(Float value1, Float value2) {
            addCriterion("pay_rate not between", value1, value2, "payRate");
            return (Criteria) this;
        }

        public Criteria andExactDateIsNull() {
            addCriterion("exact_date is null");
            return (Criteria) this;
        }

        public Criteria andExactDateIsNotNull() {
            addCriterion("exact_date is not null");
            return (Criteria) this;
        }

        public Criteria andExactDateEqualTo(Date value) {
            addCriterion("exact_date =", value, "exactDate");
            return (Criteria) this;
        }

        public Criteria andExactDateNotEqualTo(Date value) {
            addCriterion("exact_date <>", value, "exactDate");
            return (Criteria) this;
        }

        public Criteria andExactDateGreaterThan(Date value) {
            addCriterion("exact_date >", value, "exactDate");
            return (Criteria) this;
        }

        public Criteria andExactDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exact_date >=", value, "exactDate");
            return (Criteria) this;
        }

        public Criteria andExactDateLessThan(Date value) {
            addCriterion("exact_date <", value, "exactDate");
            return (Criteria) this;
        }

        public Criteria andExactDateLessThanOrEqualTo(Date value) {
            addCriterion("exact_date <=", value, "exactDate");
            return (Criteria) this;
        }

        public Criteria andExactDateIn(List<Date> values) {
            addCriterion("exact_date in", values, "exactDate");
            return (Criteria) this;
        }

        public Criteria andExactDateNotIn(List<Date> values) {
            addCriterion("exact_date not in", values, "exactDate");
            return (Criteria) this;
        }

        public Criteria andExactDateBetween(Date value1, Date value2) {
            addCriterion("exact_date between", value1, value2, "exactDate");
            return (Criteria) this;
        }

        public Criteria andExactDateNotBetween(Date value1, Date value2) {
            addCriterion("exact_date not between", value1, value2, "exactDate");
            return (Criteria) this;
        }

        public Criteria andNextTimePayIsNull() {
            addCriterion("next_time_pay is null");
            return (Criteria) this;
        }

        public Criteria andNextTimePayIsNotNull() {
            addCriterion("next_time_pay is not null");
            return (Criteria) this;
        }

        public Criteria andNextTimePayEqualTo(Double value) {
            addCriterion("next_time_pay =", value, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andNextTimePayNotEqualTo(Double value) {
            addCriterion("next_time_pay <>", value, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andNextTimePayGreaterThan(Double value) {
            addCriterion("next_time_pay >", value, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andNextTimePayGreaterThanOrEqualTo(Double value) {
            addCriterion("next_time_pay >=", value, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andNextTimePayLessThan(Double value) {
            addCriterion("next_time_pay <", value, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andNextTimePayLessThanOrEqualTo(Double value) {
            addCriterion("next_time_pay <=", value, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andNextTimePayIn(List<Double> values) {
            addCriterion("next_time_pay in", values, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andNextTimePayNotIn(List<Double> values) {
            addCriterion("next_time_pay not in", values, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andNextTimePayBetween(Double value1, Double value2) {
            addCriterion("next_time_pay between", value1, value2, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andNextTimePayNotBetween(Double value1, Double value2) {
            addCriterion("next_time_pay not between", value1, value2, "nextTimePay");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalIsNull() {
            addCriterion("repaid_principal is null");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalIsNotNull() {
            addCriterion("repaid_principal is not null");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalEqualTo(Double value) {
            addCriterion("repaid_principal =", value, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalNotEqualTo(Double value) {
            addCriterion("repaid_principal <>", value, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalGreaterThan(Double value) {
            addCriterion("repaid_principal >", value, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalGreaterThanOrEqualTo(Double value) {
            addCriterion("repaid_principal >=", value, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalLessThan(Double value) {
            addCriterion("repaid_principal <", value, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalLessThanOrEqualTo(Double value) {
            addCriterion("repaid_principal <=", value, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalIn(List<Double> values) {
            addCriterion("repaid_principal in", values, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalNotIn(List<Double> values) {
            addCriterion("repaid_principal not in", values, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalBetween(Double value1, Double value2) {
            addCriterion("repaid_principal between", value1, value2, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidPrincipalNotBetween(Double value1, Double value2) {
            addCriterion("repaid_principal not between", value1, value2, "repaidPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestIsNull() {
            addCriterion("repaid_interest is null");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestIsNotNull() {
            addCriterion("repaid_interest is not null");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestEqualTo(Double value) {
            addCriterion("repaid_interest =", value, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestNotEqualTo(Double value) {
            addCriterion("repaid_interest <>", value, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestGreaterThan(Double value) {
            addCriterion("repaid_interest >", value, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestGreaterThanOrEqualTo(Double value) {
            addCriterion("repaid_interest >=", value, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestLessThan(Double value) {
            addCriterion("repaid_interest <", value, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestLessThanOrEqualTo(Double value) {
            addCriterion("repaid_interest <=", value, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestIn(List<Double> values) {
            addCriterion("repaid_interest in", values, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestNotIn(List<Double> values) {
            addCriterion("repaid_interest not in", values, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestBetween(Double value1, Double value2) {
            addCriterion("repaid_interest between", value1, value2, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andRepaidInterestNotBetween(Double value1, Double value2) {
            addCriterion("repaid_interest not between", value1, value2, "repaidInterest");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyIsNull() {
            addCriterion("liquidated_money is null");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyIsNotNull() {
            addCriterion("liquidated_money is not null");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyEqualTo(Double value) {
            addCriterion("liquidated_money =", value, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyNotEqualTo(Double value) {
            addCriterion("liquidated_money <>", value, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyGreaterThan(Double value) {
            addCriterion("liquidated_money >", value, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("liquidated_money >=", value, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyLessThan(Double value) {
            addCriterion("liquidated_money <", value, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyLessThanOrEqualTo(Double value) {
            addCriterion("liquidated_money <=", value, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyIn(List<Double> values) {
            addCriterion("liquidated_money in", values, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyNotIn(List<Double> values) {
            addCriterion("liquidated_money not in", values, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyBetween(Double value1, Double value2) {
            addCriterion("liquidated_money between", value1, value2, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andLiquidatedMoneyNotBetween(Double value1, Double value2) {
            addCriterion("liquidated_money not between", value1, value2, "liquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalIsNull() {
            addCriterion("should_repay_principal is null");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalIsNotNull() {
            addCriterion("should_repay_principal is not null");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalEqualTo(Double value) {
            addCriterion("should_repay_principal =", value, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalNotEqualTo(Double value) {
            addCriterion("should_repay_principal <>", value, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalGreaterThan(Double value) {
            addCriterion("should_repay_principal >", value, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalGreaterThanOrEqualTo(Double value) {
            addCriterion("should_repay_principal >=", value, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalLessThan(Double value) {
            addCriterion("should_repay_principal <", value, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalLessThanOrEqualTo(Double value) {
            addCriterion("should_repay_principal <=", value, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalIn(List<Double> values) {
            addCriterion("should_repay_principal in", values, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalNotIn(List<Double> values) {
            addCriterion("should_repay_principal not in", values, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalBetween(Double value1, Double value2) {
            addCriterion("should_repay_principal between", value1, value2, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayPrincipalNotBetween(Double value1, Double value2) {
            addCriterion("should_repay_principal not between", value1, value2, "shouldRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestIsNull() {
            addCriterion("should_repay_interest is null");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestIsNotNull() {
            addCriterion("should_repay_interest is not null");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestEqualTo(Double value) {
            addCriterion("should_repay_interest =", value, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestNotEqualTo(Double value) {
            addCriterion("should_repay_interest <>", value, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestGreaterThan(Double value) {
            addCriterion("should_repay_interest >", value, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestGreaterThanOrEqualTo(Double value) {
            addCriterion("should_repay_interest >=", value, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestLessThan(Double value) {
            addCriterion("should_repay_interest <", value, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestLessThanOrEqualTo(Double value) {
            addCriterion("should_repay_interest <=", value, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestIn(List<Double> values) {
            addCriterion("should_repay_interest in", values, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestNotIn(List<Double> values) {
            addCriterion("should_repay_interest not in", values, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestBetween(Double value1, Double value2) {
            addCriterion("should_repay_interest between", value1, value2, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayInterestNotBetween(Double value1, Double value2) {
            addCriterion("should_repay_interest not between", value1, value2, "shouldRepayInterest");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyIsNull() {
            addCriterion("should_repay_liquidated_money is null");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyIsNotNull() {
            addCriterion("should_repay_liquidated_money is not null");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyEqualTo(Double value) {
            addCriterion("should_repay_liquidated_money =", value, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyNotEqualTo(Double value) {
            addCriterion("should_repay_liquidated_money <>", value, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyGreaterThan(Double value) {
            addCriterion("should_repay_liquidated_money >", value, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("should_repay_liquidated_money >=", value, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyLessThan(Double value) {
            addCriterion("should_repay_liquidated_money <", value, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyLessThanOrEqualTo(Double value) {
            addCriterion("should_repay_liquidated_money <=", value, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyIn(List<Double> values) {
            addCriterion("should_repay_liquidated_money in", values, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyNotIn(List<Double> values) {
            addCriterion("should_repay_liquidated_money not in", values, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyBetween(Double value1, Double value2) {
            addCriterion("should_repay_liquidated_money between", value1, value2, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRepayLiquidatedMoneyNotBetween(Double value1, Double value2) {
            addCriterion("should_repay_liquidated_money not between", value1, value2, "shouldRepayLiquidatedMoney");
            return (Criteria) this;
        }

        public Criteria andFinishedDateIsNull() {
            addCriterion("finished_date is null");
            return (Criteria) this;
        }

        public Criteria andFinishedDateIsNotNull() {
            addCriterion("finished_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedDateEqualTo(Date value) {
            addCriterion("finished_date =", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateNotEqualTo(Date value) {
            addCriterion("finished_date <>", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateGreaterThan(Date value) {
            addCriterion("finished_date >", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("finished_date >=", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateLessThan(Date value) {
            addCriterion("finished_date <", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateLessThanOrEqualTo(Date value) {
            addCriterion("finished_date <=", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateIn(List<Date> values) {
            addCriterion("finished_date in", values, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateNotIn(List<Date> values) {
            addCriterion("finished_date not in", values, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateBetween(Date value1, Date value2) {
            addCriterion("finished_date between", value1, value2, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateNotBetween(Date value1, Date value2) {
            addCriterion("finished_date not between", value1, value2, "finishedDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}