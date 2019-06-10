package loan.easyLoan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeRecordExample() {
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

        public Criteria andRechargeDateIsNull() {
            addCriterion("recharge_date is null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIsNotNull() {
            addCriterion("recharge_date is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateEqualTo(Date value) {
            addCriterion("recharge_date =", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotEqualTo(Date value) {
            addCriterion("recharge_date <>", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThan(Date value) {
            addCriterion("recharge_date >", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("recharge_date >=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThan(Date value) {
            addCriterion("recharge_date <", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThanOrEqualTo(Date value) {
            addCriterion("recharge_date <=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIn(List<Date> values) {
            addCriterion("recharge_date in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotIn(List<Date> values) {
            addCriterion("recharge_date not in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateBetween(Date value1, Date value2) {
            addCriterion("recharge_date between", value1, value2, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotBetween(Date value1, Date value2) {
            addCriterion("recharge_date not between", value1, value2, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(Double value) {
            addCriterion("recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(Double value) {
            addCriterion("recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(Double value) {
            addCriterion("recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(Double value) {
            addCriterion("recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(Double value) {
            addCriterion("recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<Double> values) {
            addCriterion("recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<Double> values) {
            addCriterion("recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(Double value1, Double value2) {
            addCriterion("recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(Double value1, Double value2) {
            addCriterion("recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
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