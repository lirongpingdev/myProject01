package com.gy.kanke.store.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallProExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MallProExample() {
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

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andShortTitleIsNull() {
            addCriterion("short_title is null");
            return (Criteria) this;
        }

        public Criteria andShortTitleIsNotNull() {
            addCriterion("short_title is not null");
            return (Criteria) this;
        }

        public Criteria andShortTitleEqualTo(String value) {
            addCriterion("short_title =", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotEqualTo(String value) {
            addCriterion("short_title <>", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThan(String value) {
            addCriterion("short_title >", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThanOrEqualTo(String value) {
            addCriterion("short_title >=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThan(String value) {
            addCriterion("short_title <", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThanOrEqualTo(String value) {
            addCriterion("short_title <=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLike(String value) {
            addCriterion("short_title like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotLike(String value) {
            addCriterion("short_title not like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleIn(List<String> values) {
            addCriterion("short_title in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotIn(List<String> values) {
            addCriterion("short_title not in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleBetween(String value1, String value2) {
            addCriterion("short_title between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotBetween(String value1, String value2) {
            addCriterion("short_title not between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleIsNull() {
            addCriterion("long_title is null");
            return (Criteria) this;
        }

        public Criteria andLongTitleIsNotNull() {
            addCriterion("long_title is not null");
            return (Criteria) this;
        }

        public Criteria andLongTitleEqualTo(String value) {
            addCriterion("long_title =", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotEqualTo(String value) {
            addCriterion("long_title <>", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleGreaterThan(String value) {
            addCriterion("long_title >", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleGreaterThanOrEqualTo(String value) {
            addCriterion("long_title >=", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleLessThan(String value) {
            addCriterion("long_title <", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleLessThanOrEqualTo(String value) {
            addCriterion("long_title <=", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleLike(String value) {
            addCriterion("long_title like", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotLike(String value) {
            addCriterion("long_title not like", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleIn(List<String> values) {
            addCriterion("long_title in", values, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotIn(List<String> values) {
            addCriterion("long_title not in", values, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleBetween(String value1, String value2) {
            addCriterion("long_title between", value1, value2, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotBetween(String value1, String value2) {
            addCriterion("long_title not between", value1, value2, "longTitle");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdIsNull() {
            addCriterion("prefecture_id is null");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdIsNotNull() {
            addCriterion("prefecture_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdEqualTo(Integer value) {
            addCriterion("prefecture_id =", value, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdNotEqualTo(Integer value) {
            addCriterion("prefecture_id <>", value, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdGreaterThan(Integer value) {
            addCriterion("prefecture_id >", value, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prefecture_id >=", value, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdLessThan(Integer value) {
            addCriterion("prefecture_id <", value, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdLessThanOrEqualTo(Integer value) {
            addCriterion("prefecture_id <=", value, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdIn(List<Integer> values) {
            addCriterion("prefecture_id in", values, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdNotIn(List<Integer> values) {
            addCriterion("prefecture_id not in", values, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdBetween(Integer value1, Integer value2) {
            addCriterion("prefecture_id between", value1, value2, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andPrefectureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prefecture_id not between", value1, value2, "prefectureId");
            return (Criteria) this;
        }

        public Criteria andProDescIsNull() {
            addCriterion("pro_desc is null");
            return (Criteria) this;
        }

        public Criteria andProDescIsNotNull() {
            addCriterion("pro_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProDescEqualTo(String value) {
            addCriterion("pro_desc =", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotEqualTo(String value) {
            addCriterion("pro_desc <>", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThan(String value) {
            addCriterion("pro_desc >", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThanOrEqualTo(String value) {
            addCriterion("pro_desc >=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThan(String value) {
            addCriterion("pro_desc <", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThanOrEqualTo(String value) {
            addCriterion("pro_desc <=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLike(String value) {
            addCriterion("pro_desc like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotLike(String value) {
            addCriterion("pro_desc not like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescIn(List<String> values) {
            addCriterion("pro_desc in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotIn(List<String> values) {
            addCriterion("pro_desc not in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescBetween(String value1, String value2) {
            addCriterion("pro_desc between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotBetween(String value1, String value2) {
            addCriterion("pro_desc not between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
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

        public Criteria andPostPriceModelIsNull() {
            addCriterion("post_price_model is null");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelIsNotNull() {
            addCriterion("post_price_model is not null");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelEqualTo(Integer value) {
            addCriterion("post_price_model =", value, "postPriceModel");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelNotEqualTo(Integer value) {
            addCriterion("post_price_model <>", value, "postPriceModel");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelGreaterThan(Integer value) {
            addCriterion("post_price_model >", value, "postPriceModel");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_price_model >=", value, "postPriceModel");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelLessThan(Integer value) {
            addCriterion("post_price_model <", value, "postPriceModel");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelLessThanOrEqualTo(Integer value) {
            addCriterion("post_price_model <=", value, "postPriceModel");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelIn(List<Integer> values) {
            addCriterion("post_price_model in", values, "postPriceModel");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelNotIn(List<Integer> values) {
            addCriterion("post_price_model not in", values, "postPriceModel");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelBetween(Integer value1, Integer value2) {
            addCriterion("post_price_model between", value1, value2, "postPriceModel");
            return (Criteria) this;
        }

        public Criteria andPostPriceModelNotBetween(Integer value1, Integer value2) {
            addCriterion("post_price_model not between", value1, value2, "postPriceModel");
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

        public Criteria andPutawayTimeIsNull() {
            addCriterion("putaway_time is null");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeIsNotNull() {
            addCriterion("putaway_time is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeEqualTo(Date value) {
            addCriterion("putaway_time =", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeNotEqualTo(Date value) {
            addCriterion("putaway_time <>", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeGreaterThan(Date value) {
            addCriterion("putaway_time >", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("putaway_time >=", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeLessThan(Date value) {
            addCriterion("putaway_time <", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeLessThanOrEqualTo(Date value) {
            addCriterion("putaway_time <=", value, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeIn(List<Date> values) {
            addCriterion("putaway_time in", values, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeNotIn(List<Date> values) {
            addCriterion("putaway_time not in", values, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeBetween(Date value1, Date value2) {
            addCriterion("putaway_time between", value1, value2, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andPutawayTimeNotBetween(Date value1, Date value2) {
            addCriterion("putaway_time not between", value1, value2, "putawayTime");
            return (Criteria) this;
        }

        public Criteria andAnagerIdIsNull() {
            addCriterion("anager_id is null");
            return (Criteria) this;
        }

        public Criteria andAnagerIdIsNotNull() {
            addCriterion("anager_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnagerIdEqualTo(String value) {
            addCriterion("anager_id =", value, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdNotEqualTo(String value) {
            addCriterion("anager_id <>", value, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdGreaterThan(String value) {
            addCriterion("anager_id >", value, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("anager_id >=", value, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdLessThan(String value) {
            addCriterion("anager_id <", value, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdLessThanOrEqualTo(String value) {
            addCriterion("anager_id <=", value, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdLike(String value) {
            addCriterion("anager_id like", value, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdNotLike(String value) {
            addCriterion("anager_id not like", value, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdIn(List<String> values) {
            addCriterion("anager_id in", values, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdNotIn(List<String> values) {
            addCriterion("anager_id not in", values, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdBetween(String value1, String value2) {
            addCriterion("anager_id between", value1, value2, "anagerId");
            return (Criteria) this;
        }

        public Criteria andAnagerIdNotBetween(String value1, String value2) {
            addCriterion("anager_id not between", value1, value2, "anagerId");
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

        public Criteria andDeleteStateIsNull() {
            addCriterion("delete_state is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIsNotNull() {
            addCriterion("delete_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateEqualTo(Integer value) {
            addCriterion("delete_state =", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotEqualTo(Integer value) {
            addCriterion("delete_state <>", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThan(Integer value) {
            addCriterion("delete_state >", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_state >=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThan(Integer value) {
            addCriterion("delete_state <", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThanOrEqualTo(Integer value) {
            addCriterion("delete_state <=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIn(List<Integer> values) {
            addCriterion("delete_state in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotIn(List<Integer> values) {
            addCriterion("delete_state not in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateBetween(Integer value1, Integer value2) {
            addCriterion("delete_state between", value1, value2, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_state not between", value1, value2, "deleteState");
            return (Criteria) this;
        }

        public Criteria andPicturesShowIsNull() {
            addCriterion("pictures_show is null");
            return (Criteria) this;
        }

        public Criteria andPicturesShowIsNotNull() {
            addCriterion("pictures_show is not null");
            return (Criteria) this;
        }

        public Criteria andPicturesShowEqualTo(String value) {
            addCriterion("pictures_show =", value, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowNotEqualTo(String value) {
            addCriterion("pictures_show <>", value, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowGreaterThan(String value) {
            addCriterion("pictures_show >", value, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowGreaterThanOrEqualTo(String value) {
            addCriterion("pictures_show >=", value, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowLessThan(String value) {
            addCriterion("pictures_show <", value, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowLessThanOrEqualTo(String value) {
            addCriterion("pictures_show <=", value, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowLike(String value) {
            addCriterion("pictures_show like", value, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowNotLike(String value) {
            addCriterion("pictures_show not like", value, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowIn(List<String> values) {
            addCriterion("pictures_show in", values, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowNotIn(List<String> values) {
            addCriterion("pictures_show not in", values, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowBetween(String value1, String value2) {
            addCriterion("pictures_show between", value1, value2, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andPicturesShowNotBetween(String value1, String value2) {
            addCriterion("pictures_show not between", value1, value2, "picturesShow");
            return (Criteria) this;
        }

        public Criteria andImgOneIsNull() {
            addCriterion("img_one is null");
            return (Criteria) this;
        }

        public Criteria andImgOneIsNotNull() {
            addCriterion("img_one is not null");
            return (Criteria) this;
        }

        public Criteria andImgOneEqualTo(String value) {
            addCriterion("img_one =", value, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneNotEqualTo(String value) {
            addCriterion("img_one <>", value, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneGreaterThan(String value) {
            addCriterion("img_one >", value, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneGreaterThanOrEqualTo(String value) {
            addCriterion("img_one >=", value, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneLessThan(String value) {
            addCriterion("img_one <", value, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneLessThanOrEqualTo(String value) {
            addCriterion("img_one <=", value, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneLike(String value) {
            addCriterion("img_one like", value, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneNotLike(String value) {
            addCriterion("img_one not like", value, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneIn(List<String> values) {
            addCriterion("img_one in", values, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneNotIn(List<String> values) {
            addCriterion("img_one not in", values, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneBetween(String value1, String value2) {
            addCriterion("img_one between", value1, value2, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgOneNotBetween(String value1, String value2) {
            addCriterion("img_one not between", value1, value2, "imgOne");
            return (Criteria) this;
        }

        public Criteria andImgTwoIsNull() {
            addCriterion("img_two is null");
            return (Criteria) this;
        }

        public Criteria andImgTwoIsNotNull() {
            addCriterion("img_two is not null");
            return (Criteria) this;
        }

        public Criteria andImgTwoEqualTo(String value) {
            addCriterion("img_two =", value, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoNotEqualTo(String value) {
            addCriterion("img_two <>", value, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoGreaterThan(String value) {
            addCriterion("img_two >", value, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoGreaterThanOrEqualTo(String value) {
            addCriterion("img_two >=", value, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoLessThan(String value) {
            addCriterion("img_two <", value, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoLessThanOrEqualTo(String value) {
            addCriterion("img_two <=", value, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoLike(String value) {
            addCriterion("img_two like", value, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoNotLike(String value) {
            addCriterion("img_two not like", value, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoIn(List<String> values) {
            addCriterion("img_two in", values, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoNotIn(List<String> values) {
            addCriterion("img_two not in", values, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoBetween(String value1, String value2) {
            addCriterion("img_two between", value1, value2, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgTwoNotBetween(String value1, String value2) {
            addCriterion("img_two not between", value1, value2, "imgTwo");
            return (Criteria) this;
        }

        public Criteria andImgThreeIsNull() {
            addCriterion("img_three is null");
            return (Criteria) this;
        }

        public Criteria andImgThreeIsNotNull() {
            addCriterion("img_three is not null");
            return (Criteria) this;
        }

        public Criteria andImgThreeEqualTo(String value) {
            addCriterion("img_three =", value, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeNotEqualTo(String value) {
            addCriterion("img_three <>", value, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeGreaterThan(String value) {
            addCriterion("img_three >", value, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeGreaterThanOrEqualTo(String value) {
            addCriterion("img_three >=", value, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeLessThan(String value) {
            addCriterion("img_three <", value, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeLessThanOrEqualTo(String value) {
            addCriterion("img_three <=", value, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeLike(String value) {
            addCriterion("img_three like", value, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeNotLike(String value) {
            addCriterion("img_three not like", value, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeIn(List<String> values) {
            addCriterion("img_three in", values, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeNotIn(List<String> values) {
            addCriterion("img_three not in", values, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeBetween(String value1, String value2) {
            addCriterion("img_three between", value1, value2, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgThreeNotBetween(String value1, String value2) {
            addCriterion("img_three not between", value1, value2, "imgThree");
            return (Criteria) this;
        }

        public Criteria andImgFourIsNull() {
            addCriterion("img_four is null");
            return (Criteria) this;
        }

        public Criteria andImgFourIsNotNull() {
            addCriterion("img_four is not null");
            return (Criteria) this;
        }

        public Criteria andImgFourEqualTo(String value) {
            addCriterion("img_four =", value, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourNotEqualTo(String value) {
            addCriterion("img_four <>", value, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourGreaterThan(String value) {
            addCriterion("img_four >", value, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourGreaterThanOrEqualTo(String value) {
            addCriterion("img_four >=", value, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourLessThan(String value) {
            addCriterion("img_four <", value, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourLessThanOrEqualTo(String value) {
            addCriterion("img_four <=", value, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourLike(String value) {
            addCriterion("img_four like", value, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourNotLike(String value) {
            addCriterion("img_four not like", value, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourIn(List<String> values) {
            addCriterion("img_four in", values, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourNotIn(List<String> values) {
            addCriterion("img_four not in", values, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourBetween(String value1, String value2) {
            addCriterion("img_four between", value1, value2, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFourNotBetween(String value1, String value2) {
            addCriterion("img_four not between", value1, value2, "imgFour");
            return (Criteria) this;
        }

        public Criteria andImgFiveIsNull() {
            addCriterion("img_five is null");
            return (Criteria) this;
        }

        public Criteria andImgFiveIsNotNull() {
            addCriterion("img_five is not null");
            return (Criteria) this;
        }

        public Criteria andImgFiveEqualTo(String value) {
            addCriterion("img_five =", value, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveNotEqualTo(String value) {
            addCriterion("img_five <>", value, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveGreaterThan(String value) {
            addCriterion("img_five >", value, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveGreaterThanOrEqualTo(String value) {
            addCriterion("img_five >=", value, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveLessThan(String value) {
            addCriterion("img_five <", value, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveLessThanOrEqualTo(String value) {
            addCriterion("img_five <=", value, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveLike(String value) {
            addCriterion("img_five like", value, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveNotLike(String value) {
            addCriterion("img_five not like", value, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveIn(List<String> values) {
            addCriterion("img_five in", values, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveNotIn(List<String> values) {
            addCriterion("img_five not in", values, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveBetween(String value1, String value2) {
            addCriterion("img_five between", value1, value2, "imgFive");
            return (Criteria) this;
        }

        public Criteria andImgFiveNotBetween(String value1, String value2) {
            addCriterion("img_five not between", value1, value2, "imgFive");
            return (Criteria) this;
        }

        public Criteria andSynchronousIsNull() {
            addCriterion("synchronous is null");
            return (Criteria) this;
        }

        public Criteria andSynchronousIsNotNull() {
            addCriterion("synchronous is not null");
            return (Criteria) this;
        }

        public Criteria andSynchronousEqualTo(Integer value) {
            addCriterion("synchronous =", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousNotEqualTo(Integer value) {
            addCriterion("synchronous <>", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousGreaterThan(Integer value) {
            addCriterion("synchronous >", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousGreaterThanOrEqualTo(Integer value) {
            addCriterion("synchronous >=", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousLessThan(Integer value) {
            addCriterion("synchronous <", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousLessThanOrEqualTo(Integer value) {
            addCriterion("synchronous <=", value, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousIn(List<Integer> values) {
            addCriterion("synchronous in", values, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousNotIn(List<Integer> values) {
            addCriterion("synchronous not in", values, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousBetween(Integer value1, Integer value2) {
            addCriterion("synchronous between", value1, value2, "synchronous");
            return (Criteria) this;
        }

        public Criteria andSynchronousNotBetween(Integer value1, Integer value2) {
            addCriterion("synchronous not between", value1, value2, "synchronous");
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