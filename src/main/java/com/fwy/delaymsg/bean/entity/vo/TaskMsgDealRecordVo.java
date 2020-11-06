package com.fwy.delaymsg.bean.entity.vo;

import com.fwy.delaymsg.bean.entity.TaskMsgDealRecordBase;

public class TaskMsgDealRecordVo extends TaskMsgDealRecordBase {

    /**
     * 延时级别，用户mq延时
     */
    private int delayLevel;

    /**
     * 延时时间，用于线程延时
     */
    private int delayTimes;

    public int getDelayLevel() {
        return delayLevel;
    }

    public void setDelayLevel(int delayLevel) {
        this.delayLevel = delayLevel;
    }

    public int getDelayTimes() {
        return delayTimes;
    }

    public void setDelayTimes(int delayTimes) {
        this.delayTimes = delayTimes;
    }
}
