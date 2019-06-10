package loan.easyLoan.entity;

import java.util.ArrayList;
import java.util.List;

public class DepositoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepositoryExample() {
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

        public Criteria andFundsAccountIsNull() {
            addCriterion("funds_account is null");
            return (Criteria) this;
        }

        public Criteria andFundsAccountIsNotNull() {
            addCriterion("funds_account is not null");
            return (Criteria) this;
        }

        public Criteria andFundsAccountEqualTo(String value) {
            addCriterion("funds_account =", value, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountNotEqualTo(String value) {
            addCriterion("funds_account <>", value, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountGreaterThan(String value) {
            addCriterion("funds_account >", value, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountGreaterThanOrEqualTo(String value) {
            addCriterion("funds_account >=", value, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountLessThan(String value) {
            addCriterion("funds_account <", value, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountLessThanOrEqualTo(String value) {
            addCriterion("funds_account <=", value, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountLike(String value) {
            addCriterion("funds_account like", value, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountNotLike(String value) {
            addCriterion("funds_account not like", value, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountIn(List<String> values) {
            addCriterion("funds_account in", values, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountNotIn(List<String> values) {
            addCriterion("funds_account not in", values, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountBetween(String value1, String value2) {
            addCriterion("funds_account between", value1, value2, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andFundsAccountNotBetween(String value1, String value2) {
            addCriterion("funds_account not between", value1, value2, "fundsAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountIsNull() {
            addCriterion("depository_account is null");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountIsNotNull() {
            addCriterion("depository_account is not null");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountEqualTo(String value) {
            addCriterion("depository_account =", value, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountNotEqualTo(String value) {
            addCriterion("depository_account <>", value, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountGreaterThan(String value) {
            addCriterion("depository_account >", value, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountGreaterThanOrEqualTo(String value) {
            addCriterion("depository_account >=", value, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountLessThan(String value) {
            addCriterion("depository_account <", value, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountLessThanOrEqualTo(String value) {
            addCriterion("depository_account <=", value, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountLike(String value) {
            addCriterion("depository_account like", value, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountNotLike(String value) {
            addCriterion("depository_account not like", value, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountIn(List<String> values) {
            addCriterion("depository_account in", values, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountNotIn(List<String> values) {
            addCriterion("depository_account not in", values, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountBetween(String value1, String value2) {
            addCriterion("depository_account between", value1, value2, "depositoryAccount");
            return (Criteria) this;
        }

        public Criteria andDepositoryAccountNotBetween(String value1, String value2) {
            addCriterion("depository_account not between", value1, value2, "depositoryAccount");
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