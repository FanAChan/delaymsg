package com.fwy.delaymsg.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskMsgDealRecordBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskMsgDealRecordBaseExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(String value) {
            addCriterion("FID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(String value) {
            addCriterion("FID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(String value) {
            addCriterion("FID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(String value) {
            addCriterion("FID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(String value) {
            addCriterion("FID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(String value) {
            addCriterion("FID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLike(String value) {
            addCriterion("FID like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotLike(String value) {
            addCriterion("FID not like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<String> values) {
            addCriterion("FID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<String> values) {
            addCriterion("FID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(String value1, String value2) {
            addCriterion("FID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(String value1, String value2) {
            addCriterion("FID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andBillIDIsNull() {
            addCriterion("FBillID is null");
            return (Criteria) this;
        }

        public Criteria andBillIDIsNotNull() {
            addCriterion("FBillID is not null");
            return (Criteria) this;
        }

        public Criteria andBillIDEqualTo(String value) {
            addCriterion("FBillID =", value, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDNotEqualTo(String value) {
            addCriterion("FBillID <>", value, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDGreaterThan(String value) {
            addCriterion("FBillID >", value, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDGreaterThanOrEqualTo(String value) {
            addCriterion("FBillID >=", value, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDLessThan(String value) {
            addCriterion("FBillID <", value, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDLessThanOrEqualTo(String value) {
            addCriterion("FBillID <=", value, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDLike(String value) {
            addCriterion("FBillID like", value, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDNotLike(String value) {
            addCriterion("FBillID not like", value, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDIn(List<String> values) {
            addCriterion("FBillID in", values, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDNotIn(List<String> values) {
            addCriterion("FBillID not in", values, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDBetween(String value1, String value2) {
            addCriterion("FBillID between", value1, value2, "billID");
            return (Criteria) this;
        }

        public Criteria andBillIDNotBetween(String value1, String value2) {
            addCriterion("FBillID not between", value1, value2, "billID");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIsNull() {
            addCriterion("FTriggerTime is null");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIsNotNull() {
            addCriterion("FTriggerTime is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeEqualTo(Date value) {
            addCriterion("FTriggerTime =", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotEqualTo(Date value) {
            addCriterion("FTriggerTime <>", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeGreaterThan(Date value) {
            addCriterion("FTriggerTime >", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FTriggerTime >=", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeLessThan(Date value) {
            addCriterion("FTriggerTime <", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeLessThanOrEqualTo(Date value) {
            addCriterion("FTriggerTime <=", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIn(List<Date> values) {
            addCriterion("FTriggerTime in", values, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotIn(List<Date> values) {
            addCriterion("FTriggerTime not in", values, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeBetween(Date value1, Date value2) {
            addCriterion("FTriggerTime between", value1, value2, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotBetween(Date value1, Date value2) {
            addCriterion("FTriggerTime not between", value1, value2, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("FAction is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("FAction is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("FAction =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("FAction <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("FAction >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("FAction >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("FAction <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("FAction <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("FAction like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("FAction not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("FAction in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("FAction not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("FAction between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("FAction not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("FStatus is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("FStatus is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("FStatus =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("FStatus <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("FStatus >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("FStatus >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("FStatus <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("FStatus <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("FStatus in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("FStatus not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("FStatus between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("FStatus not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorIsNull() {
            addCriterion("FDealAdaptor is null");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorIsNotNull() {
            addCriterion("FDealAdaptor is not null");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorEqualTo(String value) {
            addCriterion("FDealAdaptor =", value, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorNotEqualTo(String value) {
            addCriterion("FDealAdaptor <>", value, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorGreaterThan(String value) {
            addCriterion("FDealAdaptor >", value, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorGreaterThanOrEqualTo(String value) {
            addCriterion("FDealAdaptor >=", value, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorLessThan(String value) {
            addCriterion("FDealAdaptor <", value, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorLessThanOrEqualTo(String value) {
            addCriterion("FDealAdaptor <=", value, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorLike(String value) {
            addCriterion("FDealAdaptor like", value, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorNotLike(String value) {
            addCriterion("FDealAdaptor not like", value, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorIn(List<String> values) {
            addCriterion("FDealAdaptor in", values, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorNotIn(List<String> values) {
            addCriterion("FDealAdaptor not in", values, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorBetween(String value1, String value2) {
            addCriterion("FDealAdaptor between", value1, value2, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andDealAdaptorNotBetween(String value1, String value2) {
            addCriterion("FDealAdaptor not between", value1, value2, "dealAdaptor");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("FBillType is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("FBillType is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(String value) {
            addCriterion("FBillType =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(String value) {
            addCriterion("FBillType <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(String value) {
            addCriterion("FBillType >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FBillType >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(String value) {
            addCriterion("FBillType <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(String value) {
            addCriterion("FBillType <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLike(String value) {
            addCriterion("FBillType like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotLike(String value) {
            addCriterion("FBillType not like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<String> values) {
            addCriterion("FBillType in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<String> values) {
            addCriterion("FBillType not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(String value1, String value2) {
            addCriterion("FBillType between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(String value1, String value2) {
            addCriterion("FBillType not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("FCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("FCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("FCreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("FCreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("FCreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FCreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("FCreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("FCreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("FCreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("FCreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("FCreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("FCreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("FDeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("FDeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("FDeleteTime =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("FDeleteTime <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("FDeleteTime >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FDeleteTime >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("FDeleteTime <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("FDeleteTime <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("FDeleteTime in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("FDeleteTime not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("FDeleteTime between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("FDeleteTime not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("FIsDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("FIsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("FIsDelete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("FIsDelete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("FIsDelete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIsDelete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("FIsDelete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("FIsDelete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("FIsDelete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("FIsDelete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("FIsDelete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("FIsDelete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andParamsIsNull() {
            addCriterion("FParams is null");
            return (Criteria) this;
        }

        public Criteria andParamsIsNotNull() {
            addCriterion("FParams is not null");
            return (Criteria) this;
        }

        public Criteria andParamsEqualTo(String value) {
            addCriterion("FParams =", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotEqualTo(String value) {
            addCriterion("FParams <>", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThan(String value) {
            addCriterion("FParams >", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThanOrEqualTo(String value) {
            addCriterion("FParams >=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThan(String value) {
            addCriterion("FParams <", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThanOrEqualTo(String value) {
            addCriterion("FParams <=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLike(String value) {
            addCriterion("FParams like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotLike(String value) {
            addCriterion("FParams not like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsIn(List<String> values) {
            addCriterion("FParams in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotIn(List<String> values) {
            addCriterion("FParams not in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsBetween(String value1, String value2) {
            addCriterion("FParams between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotBetween(String value1, String value2) {
            addCriterion("FParams not between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andECIDIsNull() {
            addCriterion("FECID is null");
            return (Criteria) this;
        }

        public Criteria andECIDIsNotNull() {
            addCriterion("FECID is not null");
            return (Criteria) this;
        }

        public Criteria andECIDEqualTo(String value) {
            addCriterion("FECID =", value, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDNotEqualTo(String value) {
            addCriterion("FECID <>", value, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDGreaterThan(String value) {
            addCriterion("FECID >", value, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDGreaterThanOrEqualTo(String value) {
            addCriterion("FECID >=", value, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDLessThan(String value) {
            addCriterion("FECID <", value, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDLessThanOrEqualTo(String value) {
            addCriterion("FECID <=", value, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDLike(String value) {
            addCriterion("FECID like", value, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDNotLike(String value) {
            addCriterion("FECID not like", value, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDIn(List<String> values) {
            addCriterion("FECID in", values, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDNotIn(List<String> values) {
            addCriterion("FECID not in", values, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDBetween(String value1, String value2) {
            addCriterion("FECID between", value1, value2, "ECID");
            return (Criteria) this;
        }

        public Criteria andECIDNotBetween(String value1, String value2) {
            addCriterion("FECID not between", value1, value2, "ECID");
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