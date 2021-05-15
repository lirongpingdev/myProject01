package com.gy.kanke.store.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public SellerInfoExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNull() {
            addCriterion("license_no is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNotNull() {
            addCriterion("license_no is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoEqualTo(String value) {
            addCriterion("license_no =", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotEqualTo(String value) {
            addCriterion("license_no <>", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThan(String value) {
            addCriterion("license_no >", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("license_no >=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThan(String value) {
            addCriterion("license_no <", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("license_no <=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLike(String value) {
            addCriterion("license_no like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotLike(String value) {
            addCriterion("license_no not like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIn(List<String> values) {
            addCriterion("license_no in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotIn(List<String> values) {
            addCriterion("license_no not in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoBetween(String value1, String value2) {
            addCriterion("license_no between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotBetween(String value1, String value2) {
            addCriterion("license_no not between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameIsNull() {
            addCriterion("representative_name is null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameIsNotNull() {
            addCriterion("representative_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameEqualTo(String value) {
            addCriterion("representative_name =", value, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameNotEqualTo(String value) {
            addCriterion("representative_name <>", value, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameGreaterThan(String value) {
            addCriterion("representative_name >", value, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameGreaterThanOrEqualTo(String value) {
            addCriterion("representative_name >=", value, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameLessThan(String value) {
            addCriterion("representative_name <", value, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameLessThanOrEqualTo(String value) {
            addCriterion("representative_name <=", value, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameLike(String value) {
            addCriterion("representative_name like", value, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameNotLike(String value) {
            addCriterion("representative_name not like", value, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameIn(List<String> values) {
            addCriterion("representative_name in", values, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameNotIn(List<String> values) {
            addCriterion("representative_name not in", values, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameBetween(String value1, String value2) {
            addCriterion("representative_name between", value1, value2, "representativeName");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNameNotBetween(String value1, String value2) {
            addCriterion("representative_name not between", value1, value2, "representativeName");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNull() {
            addCriterion("idcard_no is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNotNull() {
            addCriterion("idcard_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoEqualTo(String value) {
            addCriterion("idcard_no =", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotEqualTo(String value) {
            addCriterion("idcard_no <>", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThan(String value) {
            addCriterion("idcard_no >", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_no >=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThan(String value) {
            addCriterion("idcard_no <", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThanOrEqualTo(String value) {
            addCriterion("idcard_no <=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLike(String value) {
            addCriterion("idcard_no like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotLike(String value) {
            addCriterion("idcard_no not like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIn(List<String> values) {
            addCriterion("idcard_no in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotIn(List<String> values) {
            addCriterion("idcard_no not in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoBetween(String value1, String value2) {
            addCriterion("idcard_no between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotBetween(String value1, String value2) {
            addCriterion("idcard_no not between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1IsNull() {
            addCriterion("idcard_img1 is null");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1IsNotNull() {
            addCriterion("idcard_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1EqualTo(String value) {
            addCriterion("idcard_img1 =", value, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1NotEqualTo(String value) {
            addCriterion("idcard_img1 <>", value, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1GreaterThan(String value) {
            addCriterion("idcard_img1 >", value, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1GreaterThanOrEqualTo(String value) {
            addCriterion("idcard_img1 >=", value, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1LessThan(String value) {
            addCriterion("idcard_img1 <", value, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1LessThanOrEqualTo(String value) {
            addCriterion("idcard_img1 <=", value, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1Like(String value) {
            addCriterion("idcard_img1 like", value, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1NotLike(String value) {
            addCriterion("idcard_img1 not like", value, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1In(List<String> values) {
            addCriterion("idcard_img1 in", values, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1NotIn(List<String> values) {
            addCriterion("idcard_img1 not in", values, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1Between(String value1, String value2) {
            addCriterion("idcard_img1 between", value1, value2, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg1NotBetween(String value1, String value2) {
            addCriterion("idcard_img1 not between", value1, value2, "idcardImg1");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2IsNull() {
            addCriterion("idcard_img2 is null");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2IsNotNull() {
            addCriterion("idcard_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2EqualTo(String value) {
            addCriterion("idcard_img2 =", value, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2NotEqualTo(String value) {
            addCriterion("idcard_img2 <>", value, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2GreaterThan(String value) {
            addCriterion("idcard_img2 >", value, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2GreaterThanOrEqualTo(String value) {
            addCriterion("idcard_img2 >=", value, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2LessThan(String value) {
            addCriterion("idcard_img2 <", value, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2LessThanOrEqualTo(String value) {
            addCriterion("idcard_img2 <=", value, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2Like(String value) {
            addCriterion("idcard_img2 like", value, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2NotLike(String value) {
            addCriterion("idcard_img2 not like", value, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2In(List<String> values) {
            addCriterion("idcard_img2 in", values, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2NotIn(List<String> values) {
            addCriterion("idcard_img2 not in", values, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2Between(String value1, String value2) {
            addCriterion("idcard_img2 between", value1, value2, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andIdcardImg2NotBetween(String value1, String value2) {
            addCriterion("idcard_img2 not between", value1, value2, "idcardImg2");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressIsNull() {
            addCriterion("license_address is null");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressIsNotNull() {
            addCriterion("license_address is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressEqualTo(String value) {
            addCriterion("license_address =", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressNotEqualTo(String value) {
            addCriterion("license_address <>", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressGreaterThan(String value) {
            addCriterion("license_address >", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("license_address >=", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressLessThan(String value) {
            addCriterion("license_address <", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressLessThanOrEqualTo(String value) {
            addCriterion("license_address <=", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressLike(String value) {
            addCriterion("license_address like", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressNotLike(String value) {
            addCriterion("license_address not like", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressIn(List<String> values) {
            addCriterion("license_address in", values, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressNotIn(List<String> values) {
            addCriterion("license_address not in", values, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressBetween(String value1, String value2) {
            addCriterion("license_address between", value1, value2, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressNotBetween(String value1, String value2) {
            addCriterion("license_address not between", value1, value2, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andIslongTermIsNull() {
            addCriterion("islong_term is null");
            return (Criteria) this;
        }

        public Criteria andIslongTermIsNotNull() {
            addCriterion("islong_term is not null");
            return (Criteria) this;
        }

        public Criteria andIslongTermEqualTo(Integer value) {
            addCriterion("islong_term =", value, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andIslongTermNotEqualTo(Integer value) {
            addCriterion("islong_term <>", value, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andIslongTermGreaterThan(Integer value) {
            addCriterion("islong_term >", value, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andIslongTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("islong_term >=", value, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andIslongTermLessThan(Integer value) {
            addCriterion("islong_term <", value, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andIslongTermLessThanOrEqualTo(Integer value) {
            addCriterion("islong_term <=", value, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andIslongTermIn(List<Integer> values) {
            addCriterion("islong_term in", values, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andIslongTermNotIn(List<Integer> values) {
            addCriterion("islong_term not in", values, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andIslongTermBetween(Integer value1, Integer value2) {
            addCriterion("islong_term between", value1, value2, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andIslongTermNotBetween(Integer value1, Integer value2) {
            addCriterion("islong_term not between", value1, value2, "islongTerm");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(BigDecimal value) {
            addCriterion("registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(BigDecimal value) {
            addCriterion("registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(BigDecimal value) {
            addCriterion("registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(BigDecimal value) {
            addCriterion("registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<BigDecimal> values) {
            addCriterion("registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<BigDecimal> values) {
            addCriterion("registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andLicenseImgIsNull() {
            addCriterion("license_img is null");
            return (Criteria) this;
        }

        public Criteria andLicenseImgIsNotNull() {
            addCriterion("license_img is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseImgEqualTo(String value) {
            addCriterion("license_img =", value, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgNotEqualTo(String value) {
            addCriterion("license_img <>", value, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgGreaterThan(String value) {
            addCriterion("license_img >", value, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgGreaterThanOrEqualTo(String value) {
            addCriterion("license_img >=", value, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgLessThan(String value) {
            addCriterion("license_img <", value, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgLessThanOrEqualTo(String value) {
            addCriterion("license_img <=", value, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgLike(String value) {
            addCriterion("license_img like", value, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgNotLike(String value) {
            addCriterion("license_img not like", value, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgIn(List<String> values) {
            addCriterion("license_img in", values, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgNotIn(List<String> values) {
            addCriterion("license_img not in", values, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgBetween(String value1, String value2) {
            addCriterion("license_img between", value1, value2, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andLicenseImgNotBetween(String value1, String value2) {
            addCriterion("license_img not between", value1, value2, "licenseImg");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoIsNull() {
            addCriterion("taxpayer_no is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoIsNotNull() {
            addCriterion("taxpayer_no is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoEqualTo(String value) {
            addCriterion("taxpayer_no =", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoNotEqualTo(String value) {
            addCriterion("taxpayer_no <>", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoGreaterThan(String value) {
            addCriterion("taxpayer_no >", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_no >=", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoLessThan(String value) {
            addCriterion("taxpayer_no <", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_no <=", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoLike(String value) {
            addCriterion("taxpayer_no like", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoNotLike(String value) {
            addCriterion("taxpayer_no not like", value, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoIn(List<String> values) {
            addCriterion("taxpayer_no in", values, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoNotIn(List<String> values) {
            addCriterion("taxpayer_no not in", values, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoBetween(String value1, String value2) {
            addCriterion("taxpayer_no between", value1, value2, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNoNotBetween(String value1, String value2) {
            addCriterion("taxpayer_no not between", value1, value2, "taxpayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgIsNull() {
            addCriterion("tax_register_img is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgIsNotNull() {
            addCriterion("tax_register_img is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgEqualTo(String value) {
            addCriterion("tax_register_img =", value, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgNotEqualTo(String value) {
            addCriterion("tax_register_img <>", value, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgGreaterThan(String value) {
            addCriterion("tax_register_img >", value, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgGreaterThanOrEqualTo(String value) {
            addCriterion("tax_register_img >=", value, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgLessThan(String value) {
            addCriterion("tax_register_img <", value, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgLessThanOrEqualTo(String value) {
            addCriterion("tax_register_img <=", value, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgLike(String value) {
            addCriterion("tax_register_img like", value, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgNotLike(String value) {
            addCriterion("tax_register_img not like", value, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgIn(List<String> values) {
            addCriterion("tax_register_img in", values, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgNotIn(List<String> values) {
            addCriterion("tax_register_img not in", values, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgBetween(String value1, String value2) {
            addCriterion("tax_register_img between", value1, value2, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegisterImgNotBetween(String value1, String value2) {
            addCriterion("tax_register_img not between", value1, value2, "taxRegisterImg");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("bank_no is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("bank_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("bank_no =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("bank_no <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("bank_no >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_no >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("bank_no <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("bank_no <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("bank_no like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("bank_no not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("bank_no in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("bank_no not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("bank_no between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("bank_no not between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgIsNull() {
            addCriterion("account_license_img is null");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgIsNotNull() {
            addCriterion("account_license_img is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgEqualTo(String value) {
            addCriterion("account_license_img =", value, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgNotEqualTo(String value) {
            addCriterion("account_license_img <>", value, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgGreaterThan(String value) {
            addCriterion("account_license_img >", value, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgGreaterThanOrEqualTo(String value) {
            addCriterion("account_license_img >=", value, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgLessThan(String value) {
            addCriterion("account_license_img <", value, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgLessThanOrEqualTo(String value) {
            addCriterion("account_license_img <=", value, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgLike(String value) {
            addCriterion("account_license_img like", value, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgNotLike(String value) {
            addCriterion("account_license_img not like", value, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgIn(List<String> values) {
            addCriterion("account_license_img in", values, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgNotIn(List<String> values) {
            addCriterion("account_license_img not in", values, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgBetween(String value1, String value2) {
            addCriterion("account_license_img between", value1, value2, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseImgNotBetween(String value1, String value2) {
            addCriterion("account_license_img not between", value1, value2, "accountLicenseImg");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIsNull() {
            addCriterion("billing_cycle is null");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIsNotNull() {
            addCriterion("billing_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andBillingCycleEqualTo(Integer value) {
            addCriterion("billing_cycle =", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleNotEqualTo(Integer value) {
            addCriterion("billing_cycle <>", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleGreaterThan(Integer value) {
            addCriterion("billing_cycle >", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_cycle >=", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleLessThan(Integer value) {
            addCriterion("billing_cycle <", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleLessThanOrEqualTo(Integer value) {
            addCriterion("billing_cycle <=", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIn(List<Integer> values) {
            addCriterion("billing_cycle in", values, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleNotIn(List<Integer> values) {
            addCriterion("billing_cycle not in", values, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleBetween(Integer value1, Integer value2) {
            addCriterion("billing_cycle between", value1, value2, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_cycle not between", value1, value2, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIsNull() {
            addCriterion("billing_type is null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIsNotNull() {
            addCriterion("billing_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeEqualTo(Integer value) {
            addCriterion("billing_type =", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotEqualTo(Integer value) {
            addCriterion("billing_type <>", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeGreaterThan(Integer value) {
            addCriterion("billing_type >", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_type >=", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeLessThan(Integer value) {
            addCriterion("billing_type <", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeLessThanOrEqualTo(Integer value) {
            addCriterion("billing_type <=", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIn(List<Integer> values) {
            addCriterion("billing_type in", values, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotIn(List<Integer> values) {
            addCriterion("billing_type not in", values, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeBetween(Integer value1, Integer value2) {
            addCriterion("billing_type between", value1, value2, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_type not between", value1, value2, "billingType");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("contacts_name =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("contacts_name <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("contacts_name >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_name >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("contacts_name <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_name <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("contacts_name like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("contacts_name not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("contacts_name in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("contacts_name not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("contacts_name between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("contacts_name not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("reviewer is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(String value) {
            addCriterion("reviewer =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(String value) {
            addCriterion("reviewer <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(String value) {
            addCriterion("reviewer >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(String value) {
            addCriterion("reviewer <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(String value) {
            addCriterion("reviewer <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLike(String value) {
            addCriterion("reviewer like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotLike(String value) {
            addCriterion("reviewer not like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<String> values) {
            addCriterion("reviewer in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<String> values) {
            addCriterion("reviewer not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(String value1, String value2) {
            addCriterion("reviewer between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(String value1, String value2) {
            addCriterion("reviewer not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonIsNull() {
            addCriterion("not_pass_reason is null");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonIsNotNull() {
            addCriterion("not_pass_reason is not null");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonEqualTo(String value) {
            addCriterion("not_pass_reason =", value, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonNotEqualTo(String value) {
            addCriterion("not_pass_reason <>", value, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonGreaterThan(String value) {
            addCriterion("not_pass_reason >", value, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonGreaterThanOrEqualTo(String value) {
            addCriterion("not_pass_reason >=", value, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonLessThan(String value) {
            addCriterion("not_pass_reason <", value, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonLessThanOrEqualTo(String value) {
            addCriterion("not_pass_reason <=", value, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonLike(String value) {
            addCriterion("not_pass_reason like", value, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonNotLike(String value) {
            addCriterion("not_pass_reason not like", value, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonIn(List<String> values) {
            addCriterion("not_pass_reason in", values, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonNotIn(List<String> values) {
            addCriterion("not_pass_reason not in", values, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonBetween(String value1, String value2) {
            addCriterion("not_pass_reason between", value1, value2, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andNotPassReasonNotBetween(String value1, String value2) {
            addCriterion("not_pass_reason not between", value1, value2, "notPassReason");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeIsNull() {
            addCriterion("try_application_time is null");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeIsNotNull() {
            addCriterion("try_application_time is not null");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeEqualTo(Date value) {
            addCriterion("try_application_time =", value, "tryApplicationTime");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeNotEqualTo(Date value) {
            addCriterion("try_application_time <>", value, "tryApplicationTime");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeGreaterThan(Date value) {
            addCriterion("try_application_time >", value, "tryApplicationTime");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("try_application_time >=", value, "tryApplicationTime");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeLessThan(Date value) {
            addCriterion("try_application_time <", value, "tryApplicationTime");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeLessThanOrEqualTo(Date value) {
            addCriterion("try_application_time <=", value, "tryApplicationTime");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeIn(List<Date> values) {
            addCriterion("try_application_time in", values, "tryApplicationTime");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeNotIn(List<Date> values) {
            addCriterion("try_application_time not in", values, "tryApplicationTime");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeBetween(Date value1, Date value2) {
            addCriterion("try_application_time between", value1, value2, "tryApplicationTime");
            return (Criteria) this;
        }

        public Criteria andTryApplicationTimeNotBetween(Date value1, Date value2) {
            addCriterion("try_application_time not between", value1, value2, "tryApplicationTime");
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

        public Criteria andLastUpdateByIsNull() {
            addCriterion("last_update_by is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("last_update_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(String value) {
            addCriterion("last_update_by =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("last_update_by <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("last_update_by >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_by >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("last_update_by <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("last_update_by <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLike(String value) {
            addCriterion("last_update_by like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotLike(String value) {
            addCriterion("last_update_by not like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<String> values) {
            addCriterion("last_update_by in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<String> values) {
            addCriterion("last_update_by not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(String value1, String value2) {
            addCriterion("last_update_by between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(String value1, String value2) {
            addCriterion("last_update_by not between", value1, value2, "lastUpdateBy");
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