package com.gy.kanke.store.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallProNormValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MallProNormValueExample() {
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

        public Criteria andNormIdIsNull() {
            addCriterion("norm_id is null");
            return (Criteria) this;
        }

        public Criteria andNormIdIsNotNull() {
            addCriterion("norm_id is not null");
            return (Criteria) this;
        }

        public Criteria andNormIdEqualTo(String value) {
            addCriterion("norm_id =", value, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdNotEqualTo(String value) {
            addCriterion("norm_id <>", value, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdGreaterThan(String value) {
            addCriterion("norm_id >", value, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdGreaterThanOrEqualTo(String value) {
            addCriterion("norm_id >=", value, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdLessThan(String value) {
            addCriterion("norm_id <", value, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdLessThanOrEqualTo(String value) {
            addCriterion("norm_id <=", value, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdLike(String value) {
            addCriterion("norm_id like", value, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdNotLike(String value) {
            addCriterion("norm_id not like", value, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdIn(List<String> values) {
            addCriterion("norm_id in", values, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdNotIn(List<String> values) {
            addCriterion("norm_id not in", values, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdBetween(String value1, String value2) {
            addCriterion("norm_id between", value1, value2, "normId");
            return (Criteria) this;
        }

        public Criteria andNormIdNotBetween(String value1, String value2) {
            addCriterion("norm_id not between", value1, value2, "normId");
            return (Criteria) this;
        }

        public Criteria andNormNameIsNull() {
            addCriterion("norm_name is null");
            return (Criteria) this;
        }

        public Criteria andNormNameIsNotNull() {
            addCriterion("norm_name is not null");
            return (Criteria) this;
        }

        public Criteria andNormNameEqualTo(String value) {
            addCriterion("norm_name =", value, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameNotEqualTo(String value) {
            addCriterion("norm_name <>", value, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameGreaterThan(String value) {
            addCriterion("norm_name >", value, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameGreaterThanOrEqualTo(String value) {
            addCriterion("norm_name >=", value, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameLessThan(String value) {
            addCriterion("norm_name <", value, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameLessThanOrEqualTo(String value) {
            addCriterion("norm_name <=", value, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameLike(String value) {
            addCriterion("norm_name like", value, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameNotLike(String value) {
            addCriterion("norm_name not like", value, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameIn(List<String> values) {
            addCriterion("norm_name in", values, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameNotIn(List<String> values) {
            addCriterion("norm_name not in", values, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameBetween(String value1, String value2) {
            addCriterion("norm_name between", value1, value2, "normName");
            return (Criteria) this;
        }

        public Criteria andNormNameNotBetween(String value1, String value2) {
            addCriterion("norm_name not between", value1, value2, "normName");
            return (Criteria) this;
        }

        public Criteria andNormValueIsNull() {
            addCriterion("norm_value is null");
            return (Criteria) this;
        }

        public Criteria andNormValueIsNotNull() {
            addCriterion("norm_value is not null");
            return (Criteria) this;
        }

        public Criteria andNormValueEqualTo(String value) {
            addCriterion("norm_value =", value, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueNotEqualTo(String value) {
            addCriterion("norm_value <>", value, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueGreaterThan(String value) {
            addCriterion("norm_value >", value, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueGreaterThanOrEqualTo(String value) {
            addCriterion("norm_value >=", value, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueLessThan(String value) {
            addCriterion("norm_value <", value, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueLessThanOrEqualTo(String value) {
            addCriterion("norm_value <=", value, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueLike(String value) {
            addCriterion("norm_value like", value, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueNotLike(String value) {
            addCriterion("norm_value not like", value, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueIn(List<String> values) {
            addCriterion("norm_value in", values, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueNotIn(List<String> values) {
            addCriterion("norm_value not in", values, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueBetween(String value1, String value2) {
            addCriterion("norm_value between", value1, value2, "normValue");
            return (Criteria) this;
        }

        public Criteria andNormValueNotBetween(String value1, String value2) {
            addCriterion("norm_value not between", value1, value2, "normValue");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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