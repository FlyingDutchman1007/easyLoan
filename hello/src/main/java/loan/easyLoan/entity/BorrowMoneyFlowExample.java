package loan.easyLoan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowMoneyFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowMoneyFlowExample() {
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