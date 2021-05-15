package com.gy.kanke.store.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public OrderExample() {
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoIsNull() {
            addCriterion("parent_order_no is null");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoIsNotNull() {
            addCriterion("parent_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoEqualTo(String value) {
            addCriterion("parent_order_no =", value, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoNotEqualTo(String value) {
            addCriterion("parent_order_no <>", value, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoGreaterThan(String value) {
            addCriterion("parent_order_no >", value, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("parent_order_no >=", value, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoLessThan(String value) {
            addCriterion("parent_order_no <", value, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoLessThanOrEqualTo(String value) {
            addCriterion("parent_order_no <=", value, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoLike(String value) {
            addCriterion("parent_order_no like", value, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoNotLike(String value) {
            addCriterion("parent_order_no not like", value, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoIn(List<String> values) {
            addCriterion("parent_order_no in", values, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoNotIn(List<String> values) {
            addCriterion("parent_order_no not in", values, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoBetween(String value1, String value2) {
            addCriterion("parent_order_no between", value1, value2, "parentOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOrderNoNotBetween(String value1, String value2) {
            addCriterion("parent_order_no not between", value1, value2, "parentOrderNo");
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

        public Criteria andExpressNameIsNull() {
            addCriterion("express_name is null");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNotNull() {
            addCriterion("express_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNameEqualTo(String value) {
            addCriterion("express_name =", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotEqualTo(String value) {
            addCriterion("express_name <>", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThan(String value) {
            addCriterion("express_name >", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThanOrEqualTo(String value) {
            addCriterion("express_name >=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThan(String value) {
            addCriterion("express_name <", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThanOrEqualTo(String value) {
            addCriterion("express_name <=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLike(String value) {
            addCriterion("express_name like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotLike(String value) {
            addCriterion("express_name not like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameIn(List<String> values) {
            addCriterion("express_name in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotIn(List<String> values) {
            addCriterion("express_name not in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameBetween(String value1, String value2) {
            addCriterion("express_name between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotBetween(String value1, String value2) {
            addCriterion("express_name not between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNull() {
            addCriterion("express_no is null");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNotNull() {
            addCriterion("express_no is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNoEqualTo(String value) {
            addCriterion("express_no =", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotEqualTo(String value) {
            addCriterion("express_no <>", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThan(String value) {
            addCriterion("express_no >", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("express_no >=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThan(String value) {
            addCriterion("express_no <", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThanOrEqualTo(String value) {
            addCriterion("express_no <=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLike(String value) {
            addCriterion("express_no like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotLike(String value) {
            addCriterion("express_no not like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoIn(List<String> values) {
            addCriterion("express_no in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotIn(List<String> values) {
            addCriterion("express_no not in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoBetween(String value1, String value2) {
            addCriterion("express_no between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotBetween(String value1, String value2) {
            addCriterion("express_no not between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateIsNull() {
            addCriterion("send_goods_state is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateIsNotNull() {
            addCriterion("send_goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateEqualTo(Integer value) {
            addCriterion("send_goods_state =", value, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateNotEqualTo(Integer value) {
            addCriterion("send_goods_state <>", value, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateGreaterThan(Integer value) {
            addCriterion("send_goods_state >", value, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_goods_state >=", value, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateLessThan(Integer value) {
            addCriterion("send_goods_state <", value, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateLessThanOrEqualTo(Integer value) {
            addCriterion("send_goods_state <=", value, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateIn(List<Integer> values) {
            addCriterion("send_goods_state in", values, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateNotIn(List<Integer> values) {
            addCriterion("send_goods_state not in", values, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateBetween(Integer value1, Integer value2) {
            addCriterion("send_goods_state between", value1, value2, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andSendGoodsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("send_goods_state not between", value1, value2, "sendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateIsNull() {
            addCriterion("confirm_send_goods_state is null");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateIsNotNull() {
            addCriterion("confirm_send_goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateEqualTo(Integer value) {
            addCriterion("confirm_send_goods_state =", value, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateNotEqualTo(Integer value) {
            addCriterion("confirm_send_goods_state <>", value, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateGreaterThan(Integer value) {
            addCriterion("confirm_send_goods_state >", value, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_send_goods_state >=", value, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateLessThan(Integer value) {
            addCriterion("confirm_send_goods_state <", value, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_send_goods_state <=", value, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateIn(List<Integer> values) {
            addCriterion("confirm_send_goods_state in", values, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateNotIn(List<Integer> values) {
            addCriterion("confirm_send_goods_state not in", values, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateBetween(Integer value1, Integer value2) {
            addCriterion("confirm_send_goods_state between", value1, value2, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andConfirmSendGoodsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_send_goods_state not between", value1, value2, "confirmSendGoodsState");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(Integer value) {
            addCriterion("pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(Integer value) {
            addCriterion("pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(Integer value) {
            addCriterion("pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(Integer value) {
            addCriterion("pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(Integer value) {
            addCriterion("pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<Integer> values) {
            addCriterion("pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<Integer> values) {
            addCriterion("pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(Integer value1, Integer value2) {
            addCriterion("pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_state not between", value1, value2, "payState");
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

        public Criteria andEvaluateStateIsNull() {
            addCriterion("evaluate_state is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateIsNotNull() {
            addCriterion("evaluate_state is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateEqualTo(Integer value) {
            addCriterion("evaluate_state =", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateNotEqualTo(Integer value) {
            addCriterion("evaluate_state <>", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateGreaterThan(Integer value) {
            addCriterion("evaluate_state >", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_state >=", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateLessThan(Integer value) {
            addCriterion("evaluate_state <", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_state <=", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateIn(List<Integer> values) {
            addCriterion("evaluate_state in", values, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateNotIn(List<Integer> values) {
            addCriterion("evaluate_state not in", values, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_state between", value1, value2, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_state not between", value1, value2, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeIsNull() {
            addCriterion("evaluate_type is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeIsNotNull() {
            addCriterion("evaluate_type is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeEqualTo(Integer value) {
            addCriterion("evaluate_type =", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeNotEqualTo(Integer value) {
            addCriterion("evaluate_type <>", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeGreaterThan(Integer value) {
            addCriterion("evaluate_type >", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_type >=", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeLessThan(Integer value) {
            addCriterion("evaluate_type <", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_type <=", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeIn(List<Integer> values) {
            addCriterion("evaluate_type in", values, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeNotIn(List<Integer> values) {
            addCriterion("evaluate_type not in", values, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_type between", value1, value2, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_type not between", value1, value2, "evaluateType");
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

        public Criteria andConfirmReceiveTimeIsNull() {
            addCriterion("confirm_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeIsNotNull() {
            addCriterion("confirm_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeEqualTo(Date value) {
            addCriterion("confirm_receive_time =", value, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeNotEqualTo(Date value) {
            addCriterion("confirm_receive_time <>", value, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeGreaterThan(Date value) {
            addCriterion("confirm_receive_time >", value, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_receive_time >=", value, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeLessThan(Date value) {
            addCriterion("confirm_receive_time <", value, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_receive_time <=", value, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeIn(List<Date> values) {
            addCriterion("confirm_receive_time in", values, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeNotIn(List<Date> values) {
            addCriterion("confirm_receive_time not in", values, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_receive_time between", value1, value2, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_receive_time not between", value1, value2, "confirmReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeIsNull() {
            addCriterion("member_create_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeIsNotNull() {
            addCriterion("member_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeEqualTo(Date value) {
            addCriterion("member_create_time =", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeNotEqualTo(Date value) {
            addCriterion("member_create_time <>", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeGreaterThan(Date value) {
            addCriterion("member_create_time >", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("member_create_time >=", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeLessThan(Date value) {
            addCriterion("member_create_time <", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("member_create_time <=", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeIn(List<Date> values) {
            addCriterion("member_create_time in", values, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeNotIn(List<Date> values) {
            addCriterion("member_create_time not in", values, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeBetween(Date value1, Date value2) {
            addCriterion("member_create_time between", value1, value2, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("member_create_time not between", value1, value2, "memberCreateTime");
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