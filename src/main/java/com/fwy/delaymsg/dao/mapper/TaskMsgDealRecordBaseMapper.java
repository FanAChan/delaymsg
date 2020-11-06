package com.fwy.delaymsg.dao.mapper;

import com.fwy.delaymsg.bean.entity.TaskMsgDealRecordBase;
import com.fwy.delaymsg.bean.entity.TaskMsgDealRecordBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskMsgDealRecordBaseMapper {
    long countByExample(TaskMsgDealRecordBaseExample example);

    int insert(TaskMsgDealRecordBase record);

    int insertSelective(TaskMsgDealRecordBase record);

    List<TaskMsgDealRecordBase> selectByExample(TaskMsgDealRecordBaseExample example);

    int updateByExampleSelective(@Param("record") TaskMsgDealRecordBase record, @Param("example") TaskMsgDealRecordBaseExample example);

    int updateByExample(@Param("record") TaskMsgDealRecordBase record, @Param("example") TaskMsgDealRecordBaseExample example);
}