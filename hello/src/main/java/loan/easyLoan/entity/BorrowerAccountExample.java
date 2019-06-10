package loan.easyLoan.entity;

import java.util.ArrayList;
import java.util.List;

public class BorrowerAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowerAccountExample() {
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

        public Criteria andAccountBalanceIsNull() {
            addCriterion("account_balance is null");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceIsNotNull() {
            addCriterion("account_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceEqualTo(Double value) {
            addCriterion("account_balance =", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotEqualTo(Double value) {
            addCriterion("account_balance <>", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceGreaterThan(Double value) {
            addCriterion("account_balance >", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("account_balance >=", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceLessThan(Double value) {
            addCriterion("account_balance <", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceLessThanOrEqualTo(Double value) {
            addCriterion("account_balance <=", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceIn(List<Double> values) {
            addCriterion("account_balance in", values, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotIn(List<Double> values) {
            addCriterion("account_balance not in", values, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceBetween(Double value1, Double value2) {
            addCriterion("account_balance between", value1, value2, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotBetween(Double value1, Double value2) {
            addCriterion("account_balance not between", value1, value2, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyIsNull() {
            addCriterion("borrowed_money is null");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyIsNotNull() {
            addCriterion("borrowed_money is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyEqualTo(Double value) {
            addCriterion("borrowed_money =", value, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyNotEqualTo(Double value) {
            addCriterion("borrowed_money <>", value, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyGreaterThan(Double value) {
            addCriterion("borrowed_money >", value, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("borrowed_money >=", value, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyLessThan(Double value) {
            addCriterion("borrowed_money <", value, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyLessThanOrEqualTo(Double value) {
            addCriterion("borrowed_money <=", value, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyIn(List<Double> values) {
            addCriterion("borrowed_money in", values, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyNotIn(List<Double> values) {
            addCriterion("borrowed_money not in", values, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyBetween(Double value1, Double value2) {
            addCriterion("borrowed_money between", value1, value2, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowedMoneyNotBetween(Double value1, Double value2) {
            addCriterion("borrowed_money not between", value1, value2, "borrowedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNull() {
            addCriterion("credit_score is null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNotNull() {
            addCriterion("credit_score is not null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreEqualTo(Integer value) {
            addCriterion("credit_score =", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotEqualTo(Integer value) {
            addCriterion("credit_score <>", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThan(Integer value) {
            addCriterion("credit_score >", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_score >=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThan(Integer value) {
            addCriterion("credit_score <", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThanOrEqualTo(Integer value) {
            addCriterion("credit_score <=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIn(List<Integer> values) {
            addCriterion("credit_score in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotIn(List<Integer> values) {
            addCriterion("credit_score not in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreBetween(Integer value1, Integer value2) {
            addCriterion("credit_score between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_score not between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andTotalLimitIsNull() {
            addCriterion("total_limit is null");
            return (Criteria) this;
        }

        public Criteria andTotalLimitIsNotNull() {
            addCriterion("total_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLimitEqualTo(Double value) {
            addCriterion("total_limit =", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotEqualTo(Double value) {
            addCriterion("total_limit <>", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitGreaterThan(Double value) {
            addCriterion("total_limit >", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("total_limit >=", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitLessThan(Double value) {
            addCriterion("total_limit <", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitLessThanOrEqualTo(Double value) {
            addCriterion("total_limit <=", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitIn(List<Double> values) {
            addCriterion("total_limit in", values, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotIn(List<Double> values) {
            addCriterion("total_limit not in", values, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitBetween(Double value1, Double value2) {
            addCriterion("total_limit between", value1, value2, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotBetween(Double value1, Double value2) {
            addCriterion("total_limit not between", value1, value2, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitIsNull() {
            addCriterion("available_limit is null");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitIsNotNull() {
            addCriterion("available_limit is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitEqualTo(Double value) {
            addCriterion("available_limit =", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitNotEqualTo(Double value) {
            addCriterion("available_limit <>", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitGreaterThan(Double value) {
            addCriterion("available_limit >", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("available_limit >=", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitLessThan(Double value) {
            addCriterion("available_limit <", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitLessThanOrEqualTo(Double value) {
            addCriterion("available_limit <=", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitIn(List<Double> values) {
            addCriterion("available_limit in", values, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitNotIn(List<Double> values) {
            addCriterion("available_limit not in", values, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitBetween(Double value1, Double value2) {
            addCriterion("available_limit between", value1, value2, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitNotBetween(Double value1, Double value2) {
            addCriterion("available_limit not between", value1, value2, "availableLimit");
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