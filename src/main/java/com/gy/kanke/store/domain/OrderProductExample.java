package com.gy.kanke.store.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public OrderProductExample() {
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

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(String value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(String value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(String value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(String value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(String value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(String value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLike(String value) {
            addCriterion("pro_id like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotLike(String value) {
            addCriterion("pro_id not like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<String> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<String> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(String value1, String value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(String value1, String value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
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

        public Criteria andNormContentIsNull() {
            addCriterion("norm_content is null");
            return (Criteria) this;
        }

        public Criteria andNormContentIsNotNull() {
            addCriterion("norm_content is not null");
            return (Criteria) this;
        }

        public Criteria andNormContentEqualTo(String value) {
            addCriterion("norm_content =", value, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentNotEqualTo(String value) {
            addCriterion("norm_content <>", value, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentGreaterThan(String value) {
            addCriterion("norm_content >", value, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentGreaterThanOrEqualTo(String value) {
            addCriterion("norm_content >=", value, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentLessThan(String value) {
            addCriterion("norm_content <", value, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentLessThanOrEqualTo(String value) {
            addCriterion("norm_content <=", value, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentLike(String value) {
            addCriterion("norm_content like", value, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentNotLike(String value) {
            addCriterion("norm_content not like", value, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentIn(List<String> values) {
            addCriterion("norm_content in", values, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentNotIn(List<String> values) {
            addCriterion("norm_content not in", values, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentBetween(String value1, String value2) {
            addCriterion("norm_content between", value1, value2, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormContentNotBetween(String value1, String value2) {
            addCriterion("norm_content not between", value1, value2, "normContent");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueIsNull() {
            addCriterion("norm_key_value is null");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueIsNotNull() {
            addCriterion("norm_key_value is not null");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueEqualTo(String value) {
            addCriterion("norm_key_value =", value, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueNotEqualTo(String value) {
            addCriterion("norm_key_value <>", value, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueGreaterThan(String value) {
            addCriterion("norm_key_value >", value, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueGreaterThanOrEqualTo(String value) {
            addCriterion("norm_key_value >=", value, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueLessThan(String value) {
            addCriterion("norm_key_value <", value, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueLessThanOrEqualTo(String value) {
            addCriterion("norm_key_value <=", value, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueLike(String value) {
            addCriterion("norm_key_value like", value, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueNotLike(String value) {
            addCriterion("norm_key_value not like", value, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueIn(List<String> values) {
            addCriterion("norm_key_value in", values, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueNotIn(List<String> values) {
            addCriterion("norm_key_value not in", values, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueBetween(String value1, String value2) {
            addCriterion("norm_key_value between", value1, value2, "normKeyValue");
            return (Criteria) this;
        }

        public Criteria andNormKeyValueNotBetween(String value1, String value2) {
            addCriterion("norm_key_value not between", value1, value2, "normKeyValue");
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

        public Criteria andMustNeedPriceIsNull() {
            addCriterion("must_need_price is null");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceIsNotNull() {
            addCriterion("must_need_price is not null");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceEqualTo(Integer value) {
            addCriterion("must_need_price =", value, "mustNeedPrice");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceNotEqualTo(Integer value) {
            addCriterion("must_need_price <>", value, "mustNeedPrice");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceGreaterThan(Integer value) {
            addCriterion("must_need_price >", value, "mustNeedPrice");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("must_need_price >=", value, "mustNeedPrice");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceLessThan(Integer value) {
            addCriterion("must_need_price <", value, "mustNeedPrice");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceLessThanOrEqualTo(Integer value) {
            addCriterion("must_need_price <=", value, "mustNeedPrice");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceIn(List<Integer> values) {
            addCriterion("must_need_price in", values, "mustNeedPrice");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceNotIn(List<Integer> values) {
            addCriterion("must_need_price not in", values, "mustNeedPrice");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceBetween(Integer value1, Integer value2) {
            addCriterion("must_need_price between", value1, value2, "mustNeedPrice");
            return (Criteria) this;
        }

        public Criteria andMustNeedPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("must_need_price not between", value1, value2, "mustNeedPrice");
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

        public Criteria andMustNeedMoneyIsNull() {
            addCriterion("must_need_money is null");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyIsNotNull() {
            addCriterion("must_need_money is not null");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyEqualTo(Integer value) {
            addCriterion("must_need_money =", value, "mustNeedMoney");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyNotEqualTo(Integer value) {
            addCriterion("must_need_money <>", value, "mustNeedMoney");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyGreaterThan(Integer value) {
            addCriterion("must_need_money >", value, "mustNeedMoney");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("must_need_money >=", value, "mustNeedMoney");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyLessThan(Integer value) {
            addCriterion("must_need_money <", value, "mustNeedMoney");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("must_need_money <=", value, "mustNeedMoney");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyIn(List<Integer> values) {
            addCriterion("must_need_money in", values, "mustNeedMoney");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyNotIn(List<Integer> values) {
            addCriterion("must_need_money not in", values, "mustNeedMoney");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyBetween(Integer value1, Integer value2) {
            addCriterion("must_need_money between", value1, value2, "mustNeedMoney");
            return (Criteria) this;
        }

        public Criteria andMustNeedMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("must_need_money not between", value1, value2, "mustNeedMoney");
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

        public Criteria andMustNeedGoldcoinIsNull() {
            addCriterion("must_need_goldcoin is null");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinIsNotNull() {
            addCriterion("must_need_goldcoin is not null");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinEqualTo(Integer value) {
            addCriterion("must_need_goldcoin =", value, "mustNeedGoldcoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinNotEqualTo(Integer value) {
            addCriterion("must_need_goldcoin <>", value, "mustNeedGoldcoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinGreaterThan(Integer value) {
            addCriterion("must_need_goldcoin >", value, "mustNeedGoldcoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("must_need_goldcoin >=", value, "mustNeedGoldcoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinLessThan(Integer value) {
            addCriterion("must_need_goldcoin <", value, "mustNeedGoldcoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinLessThanOrEqualTo(Integer value) {
            addCriterion("must_need_goldcoin <=", value, "mustNeedGoldcoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinIn(List<Integer> values) {
            addCriterion("must_need_goldcoin in", values, "mustNeedGoldcoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinNotIn(List<Integer> values) {
            addCriterion("must_need_goldcoin not in", values, "mustNeedGoldcoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinBetween(Integer value1, Integer value2) {
            addCriterion("must_need_goldcoin between", value1, value2, "mustNeedGoldcoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedGoldcoinNotBetween(Integer value1, Integer value2) {
            addCriterion("must_need_goldcoin not between", value1, value2, "mustNeedGoldcoin");
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

        public Criteria andMustNeedCoinIsNull() {
            addCriterion("must_need_coin is null");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinIsNotNull() {
            addCriterion("must_need_coin is not null");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinEqualTo(Integer value) {
            addCriterion("must_need_coin =", value, "mustNeedCoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinNotEqualTo(Integer value) {
            addCriterion("must_need_coin <>", value, "mustNeedCoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinGreaterThan(Integer value) {
            addCriterion("must_need_coin >", value, "mustNeedCoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("must_need_coin >=", value, "mustNeedCoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinLessThan(Integer value) {
            addCriterion("must_need_coin <", value, "mustNeedCoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinLessThanOrEqualTo(Integer value) {
            addCriterion("must_need_coin <=", value, "mustNeedCoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinIn(List<Integer> values) {
            addCriterion("must_need_coin in", values, "mustNeedCoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinNotIn(List<Integer> values) {
            addCriterion("must_need_coin not in", values, "mustNeedCoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinBetween(Integer value1, Integer value2) {
            addCriterion("must_need_coin between", value1, value2, "mustNeedCoin");
            return (Criteria) this;
        }

        public Criteria andMustNeedCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("must_need_coin not between", value1, value2, "mustNeedCoin");
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

        public Criteria andBuyCountIsNull() {
            addCriterion("buy_count is null");
            return (Criteria) this;
        }

        public Criteria andBuyCountIsNotNull() {
            addCriterion("buy_count is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCountEqualTo(Integer value) {
            addCriterion("buy_count =", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotEqualTo(Integer value) {
            addCriterion("buy_count <>", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountGreaterThan(Integer value) {
            addCriterion("buy_count >", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_count >=", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountLessThan(Integer value) {
            addCriterion("buy_count <", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountLessThanOrEqualTo(Integer value) {
            addCriterion("buy_count <=", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountIn(List<Integer> values) {
            addCriterion("buy_count in", values, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotIn(List<Integer> values) {
            addCriterion("buy_count not in", values, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountBetween(Integer value1, Integer value2) {
            addCriterion("buy_count between", value1, value2, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_count not between", value1, value2, "buyCount");
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