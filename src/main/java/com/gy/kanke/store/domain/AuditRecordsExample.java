package com.gy.kanke.store.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public AuditRecordsExample() {
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

        public Criteria andAuditTypeIsNull() {
            addCriterion("audit_type is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("audit_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(String value) {
            addCriterion("audit_type =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(String value) {
            addCriterion("audit_type <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(String value) {
            addCriterion("audit_type >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(String value) {
            addCriterion("audit_type >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(String value) {
            addCriterion("audit_type <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(String value) {
            addCriterion("audit_type <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLike(String value) {
            addCriterion("audit_type like", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotLike(String value) {
            addCriterion("audit_type not like", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<String> values) {
            addCriterion("audit_type in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<String> values) {
            addCriterion("audit_type not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(String value1, String value2) {
            addCriterion("audit_type between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(String value1, String value2) {
            addCriterion("audit_type not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdIsNull() {
            addCriterion("audit_object_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdIsNotNull() {
            addCriterion("audit_object_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdEqualTo(String value) {
            addCriterion("audit_object_id =", value, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdNotEqualTo(String value) {
            addCriterion("audit_object_id <>", value, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdGreaterThan(String value) {
            addCriterion("audit_object_id >", value, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_object_id >=", value, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdLessThan(String value) {
            addCriterion("audit_object_id <", value, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdLessThanOrEqualTo(String value) {
            addCriterion("audit_object_id <=", value, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdLike(String value) {
            addCriterion("audit_object_id like", value, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdNotLike(String value) {
            addCriterion("audit_object_id not like", value, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdIn(List<String> values) {
            addCriterion("audit_object_id in", values, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdNotIn(List<String> values) {
            addCriterion("audit_object_id not in", values, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdBetween(String value1, String value2) {
            addCriterion("audit_object_id between", value1, value2, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditObjectIdNotBetween(String value1, String value2) {
            addCriterion("audit_object_id not between", value1, value2, "auditObjectId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdIsNull() {
            addCriterion("audit_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdIsNotNull() {
            addCriterion("audit_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdEqualTo(String value) {
            addCriterion("audit_manager_id =", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdNotEqualTo(String value) {
            addCriterion("audit_manager_id <>", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdGreaterThan(String value) {
            addCriterion("audit_manager_id >", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_manager_id >=", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdLessThan(String value) {
            addCriterion("audit_manager_id <", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdLessThanOrEqualTo(String value) {
            addCriterion("audit_manager_id <=", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdLike(String value) {
            addCriterion("audit_manager_id like", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdNotLike(String value) {
            addCriterion("audit_manager_id not like", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdIn(List<String> values) {
            addCriterion("audit_manager_id in", values, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdNotIn(List<String> values) {
            addCriterion("audit_manager_id not in", values, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdBetween(String value1, String value2) {
            addCriterion("audit_manager_id between", value1, value2, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdNotBetween(String value1, String value2) {
            addCriterion("audit_manager_id not between", value1, value2, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameIsNull() {
            addCriterion("audit_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameIsNotNull() {
            addCriterion("audit_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameEqualTo(String value) {
            addCriterion("audit_manager_name =", value, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameNotEqualTo(String value) {
            addCriterion("audit_manager_name <>", value, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameGreaterThan(String value) {
            addCriterion("audit_manager_name >", value, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_manager_name >=", value, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameLessThan(String value) {
            addCriterion("audit_manager_name <", value, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameLessThanOrEqualTo(String value) {
            addCriterion("audit_manager_name <=", value, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameLike(String value) {
            addCriterion("audit_manager_name like", value, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameNotLike(String value) {
            addCriterion("audit_manager_name not like", value, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameIn(List<String> values) {
            addCriterion("audit_manager_name in", values, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameNotIn(List<String> values) {
            addCriterion("audit_manager_name not in", values, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameBetween(String value1, String value2) {
            addCriterion("audit_manager_name between", value1, value2, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditManagerNameNotBetween(String value1, String value2) {
            addCriterion("audit_manager_name not between", value1, value2, "auditManagerName");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(Integer value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(Integer value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(Integer value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(Integer value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(Integer value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<Integer> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<Integer> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(Integer value1, Integer value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("audit_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("audit_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(String value) {
            addCriterion("audit_result =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(String value) {
            addCriterion("audit_result <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(String value) {
            addCriterion("audit_result >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(String value) {
            addCriterion("audit_result >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(String value) {
            addCriterion("audit_result <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(String value) {
            addCriterion("audit_result <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLike(String value) {
            addCriterion("audit_result like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotLike(String value) {
            addCriterion("audit_result not like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<String> values) {
            addCriterion("audit_result in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<String> values) {
            addCriterion("audit_result not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(String value1, String value2) {
            addCriterion("audit_result between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(String value1, String value2) {
            addCriterion("audit_result not between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
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