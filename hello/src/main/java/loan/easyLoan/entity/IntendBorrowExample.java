package loan.easyLoan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntendBorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntendBorrowExample() {
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

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyIsNull() {
            addCriterion("intend_money is null");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyIsNotNull() {
            addCriterion("intend_money is not null");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyEqualTo(Double value) {
            addCriterion("intend_money =", value, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyNotEqualTo(Double value) {
            addCriterion("intend_money <>", value, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyGreaterThan(Double value) {
            addCriterion("intend_money >", value, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("intend_money >=", value, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyLessThan(Double value) {
            addCriterion("intend_money <", value, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyLessThanOrEqualTo(Double value) {
            addCriterion("intend_money <=", value, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyIn(List<Double> values) {
            addCriterion("intend_money in", values, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyNotIn(List<Double> values) {
            addCriterion("intend_money not in", values, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyBetween(Double value1, Double value2) {
            addCriterion("intend_money between", value1, value2, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andIntendMoneyNotBetween(Double value1, Double value2) {
            addCriterion("intend_money not between", value1, value2, "intendMoney");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyIsNull() {
            addCriterion("raised_money is null");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyIsNotNull() {
            addCriterion("raised_money is not null");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyEqualTo(Double value) {
            addCriterion("raised_money =", value, "raisedMoney");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyNotEqualTo(Double value) {
            addCriterion("raised_money <>", value, "raisedMoney");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyGreaterThan(Double value) {
            addCriterion("raised_money >", value, "raisedMoney");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("raised_money >=", value, "raisedMoney");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyLessThan(Double value) {
            addCriterion("raised_money <", value, "raisedMoney");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyLessThanOrEqualTo(Double value) {
            addCriterion("raised_money <=", value, "raisedMoney");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyIn(List<Double> values) {
            addCriterion("raised_money in", values, "raisedMoney");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyNotIn(List<Double> values) {
            addCriterion("raised_money not in", values, "raisedMoney");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyBetween(Double value1, Double value2) {
            addCriterion("raised_money between", value1, value2, "raisedMoney");
            return (Criteria) this;
        }

        public Criteria andRaisedMoneyNotBetween(Double value1, Double value2) {
            addCriterion("raised_money not between", value1, value2, "raisedMoney");
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