package com.fwy.delaymsg.bean.entity;

import java.io.Serializable;
import java.util.Date;

public class TaskMsgDealRecordBase implements Serializable {
    private String ID;

    private String billID;

    private Date triggerTime;

    private String action;

    private Integer status;

    private String dealAdaptor;

    private String billType;

    private Date createTime;

    private Date deleteTime;

    private Integer isDelete;

    private String params;

    private String ECID;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID == null ? null : billID.trim();
    }

    public Date getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDealAdaptor() {
        return dealAdaptor;
    }

    public void setDealAdaptor(String dealAdaptor) {
        this.dealAdaptor = dealAdaptor == null ? null : dealAdaptor.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getECID() {
        return ECID;
    }

    public void setECID(String ECID) {
        this.ECID = ECID == null ? null : ECID.trim();
    }
}