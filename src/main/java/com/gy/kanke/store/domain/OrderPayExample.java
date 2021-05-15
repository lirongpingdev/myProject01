package com.gy.kanke.store.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public OrderPayExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyIsNull() {
            addCriterion("loos_pin_money is null");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyIsNotNull() {
            addCriterion("loos_pin_money is not null");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyEqualTo(BigDecimal value) {
            addCriterion("loos_pin_money =", value, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyNotEqualTo(BigDecimal value) {
            addCriterion("loos_pin_money <>", value, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyGreaterThan(BigDecimal value) {
            addCriterion("loos_pin_money >", value, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loos_pin_money >=", value, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyLessThan(BigDecimal value) {
            addCriterion("loos_pin_money <", value, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loos_pin_money <=", value, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyIn(List<BigDecimal> values) {
            addCriterion("loos_pin_money in", values, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyNotIn(List<BigDecimal> values) {
            addCriterion("loos_pin_money not in", values, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loos_pin_money between", value1, value2, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andLoosPinMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loos_pin_money not between", value1, value2, "loosPinMoney");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinIsNull() {
            addCriterion("total_goldcoin is null");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinIsNotNull() {
            addCriterion("total_goldcoin is not null");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinEqualTo(BigDecimal value) {
            addCriterion("total_goldcoin =", value, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinNotEqualTo(BigDecimal value) {
            addCriterion("total_goldcoin <>", value, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinGreaterThan(BigDecimal value) {
            addCriterion("total_goldcoin >", value, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_goldcoin >=", value, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinLessThan(BigDecimal value) {
            addCriterion("total_goldcoin <", value, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_goldcoin <=", value, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinIn(List<BigDecimal> values) {
            addCriterion("total_goldcoin in", values, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinNotIn(List<BigDecimal> values) {
            addCriterion("total_goldcoin not in", values, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_goldcoin between", value1, value2, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andTotalGoldcoinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_goldcoin not between", value1, value2, "totalGoldcoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinIsNull() {
            addCriterion("charity_coin is null");
            return (Criteria) this;
        }

        public Criteria andCharityCoinIsNotNull() {
            addCriterion("charity_coin is not null");
            return (Criteria) this;
        }

        public Criteria andCharityCoinEqualTo(BigDecimal value) {
            addCriterion("charity_coin =", value, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinNotEqualTo(BigDecimal value) {
            addCriterion("charity_coin <>", value, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinGreaterThan(BigDecimal value) {
            addCriterion("charity_coin >", value, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("charity_coin >=", value, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinLessThan(BigDecimal value) {
            addCriterion("charity_coin <", value, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("charity_coin <=", value, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinIn(List<BigDecimal> values) {
            addCriterion("charity_coin in", values, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinNotIn(List<BigDecimal> values) {
            addCriterion("charity_coin not in", values, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charity_coin between", value1, value2, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andCharityCoinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charity_coin not between", value1, value2, "charityCoin");
            return (Criteria) this;
        }

        public Criteria andTransNoIsNull() {
            addCriterion("trans_no is null");
            return (Criteria) this;
        }

        public Criteria andTransNoIsNotNull() {
            addCriterion("trans_no is not null");
            return (Criteria) this;
        }

        public Criteria andTransNoEqualTo(String value) {
            addCriterion("trans_no =", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotEqualTo(String value) {
            addCriterion("trans_no <>", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThan(String value) {
            addCriterion("trans_no >", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThanOrEqualTo(String value) {
            addCriterion("trans_no >=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThan(String value) {
            addCriterion("trans_no <", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThanOrEqualTo(String value) {
            addCriterion("trans_no <=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLike(String value) {
            addCriterion("trans_no like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotLike(String value) {
            addCriterion("trans_no not like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoIn(List<String> values) {
            addCriterion("trans_no in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotIn(List<String> values) {
            addCriterion("trans_no not in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoBetween(String value1, String value2) {
            addCriterion("trans_no between", value1, value2, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotBetween(String value1, String value2) {
            addCriterion("trans_no not between", value1, value2, "transNo");
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

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdIsNull() {
            addCriterion("last_update_id is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdIsNotNull() {
            addCriterion("last_update_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdEqualTo(String value) {
            addCriterion("last_update_id =", value, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdNotEqualTo(String value) {
            addCriterion("last_update_id <>", value, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdGreaterThan(String value) {
            addCriterion("last_update_id >", value, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_id >=", value, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdLessThan(String value) {
            addCriterion("last_update_id <", value, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("last_update_id <=", value, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdLike(String value) {
            addCriterion("last_update_id like", value, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdNotLike(String value) {
            addCriterion("last_update_id not like", value, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdIn(List<String> values) {
            addCriterion("last_update_id in", values, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdNotIn(List<String> values) {
            addCriterion("last_update_id not in", values, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdBetween(String value1, String value2) {
            addCriterion("last_update_id between", value1, value2, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIdNotBetween(String value1, String value2) {
            addCriterion("last_update_id not between", value1, value2, "lastUpdateId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPostPriceIsNull() {
            addCriterion("post_price is null");
            return (Criteria) this;
        }

        public Criteria andPostPriceIsNotNull() {
            addCriterion("post_price is not null");
            return (Criteria) this;
        }

        public Criteria andPostPriceEqualTo(BigDecimal value) {
            addCriterion("post_price =", value, "postPrice");
            return (Criteria) this;
        }

        public Criteria andPostPriceNotEqualTo(BigDecimal value) {
            addCriterion("post_price <>", value, "postPrice");
            return (Criteria) this;
        }

        public Criteria andPostPriceGreaterThan(BigDecimal value) {
            addCriterion("post_price >", value, "postPrice");
            return (Criteria) this;
        }

        public Criteria andPostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("post_price >=", value, "postPrice");
            return (Criteria) this;
        }

        public Criteria andPostPriceLessThan(BigDecimal value) {
            addCriterion("post_price <", value, "postPrice");
            return (Criteria) this;
        }

        public Criteria andPostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("post_price <=", value, "postPrice");
            return (Criteria) this;
        }

        public Criteria andPostPriceIn(List<BigDecimal> values) {
            addCriterion("post_price in", values, "postPrice");
            return (Criteria) this;
        }

        public Criteria andPostPriceNotIn(List<BigDecimal> values) {
            addCriterion("post_price not in", values, "postPrice");
            return (Criteria) this;
        }

        public Criteria andPostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("post_price between", value1, value2, "postPrice");
            return (Criteria) this;
        }

        public Criteria andPostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("post_price not between", value1, value2, "postPrice");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoIsNull() {
            addCriterion("old_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoIsNotNull() {
            addCriterion("old_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoEqualTo(String value) {
            addCriterion("old_order_no =", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotEqualTo(String value) {
            addCriterion("old_order_no <>", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoGreaterThan(String value) {
            addCriterion("old_order_no >", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("old_order_no >=", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoLessThan(String value) {
            addCriterion("old_order_no <", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoLessThanOrEqualTo(String value) {
            addCriterion("old_order_no <=", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoLike(String value) {
            addCriterion("old_order_no like", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotLike(String value) {
            addCriterion("old_order_no not like", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoIn(List<String> values) {
            addCriterion("old_order_no in", values, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotIn(List<String> values) {
            addCriterion("old_order_no not in", values, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoBetween(String value1, String value2) {
            addCriterion("old_order_no between", value1, value2, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotBetween(String value1, String value2) {
            addCriterion("old_order_no not between", value1, value2, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoIsNull() {
            addCriterion("kanke_trans_no is null");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoIsNotNull() {
            addCriterion("kanke_trans_no is not null");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoEqualTo(String value) {
            addCriterion("kanke_trans_no =", value, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoNotEqualTo(String value) {
            addCriterion("kanke_trans_no <>", value, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoGreaterThan(String value) {
            addCriterion("kanke_trans_no >", value, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoGreaterThanOrEqualTo(String value) {
            addCriterion("kanke_trans_no >=", value, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoLessThan(String value) {
            addCriterion("kanke_trans_no <", value, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoLessThanOrEqualTo(String value) {
            addCriterion("kanke_trans_no <=", value, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoLike(String value) {
            addCriterion("kanke_trans_no like", value, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoNotLike(String value) {
            addCriterion("kanke_trans_no not like", value, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoIn(List<String> values) {
            addCriterion("kanke_trans_no in", values, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoNotIn(List<String> values) {
            addCriterion("kanke_trans_no not in", values, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoBetween(String value1, String value2) {
            addCriterion("kanke_trans_no between", value1, value2, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andKankeTransNoNotBetween(String value1, String value2) {
            addCriterion("kanke_trans_no not between", value1, value2, "kankeTransNo");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIsNull() {
            addCriterion("settlement_price is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIsNotNull() {
            addCriterion("settlement_price is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceEqualTo(BigDecimal value) {
            addCriterion("settlement_price =", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotEqualTo(BigDecimal value) {
            addCriterion("settlement_price <>", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThan(BigDecimal value) {
            addCriterion("settlement_price >", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_price >=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThan(BigDecimal value) {
            addCriterion("settlement_price <", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_price <=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIn(List<BigDecimal> values) {
            addCriterion("settlement_price in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotIn(List<BigDecimal> values) {
            addCriterion("settlement_price not in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_price between", value1, value2, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_price not between", value1, value2, "settlementPrice");
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