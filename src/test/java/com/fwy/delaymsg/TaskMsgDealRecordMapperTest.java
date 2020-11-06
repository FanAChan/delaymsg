package com.fwy.delaymsg;

import com.fwy.delaymsg.bean.entity.TaskMsgDealRecordBase;
import com.fwy.delaymsg.dao.mapper.TaskMsgDealRecordBaseMapper;
import com.fwy.delaymsg.util.DateTimeUtil;
import com.fwy.delaymsg.util.MessageProduceUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@SpringBootTest(classes = DelayMsgApplication.class)
public class TaskMsgDealRecordMapperTest {

    @Resource
    TaskMsgDealRecordBaseMapper taskMsgDealRecordBaseMapper;

    @Test
    public void insert(){
        int i = 500000;
        Date date = new Date();
        date = DateTimeUtil.addSeconds(date,60*60);
        System.out.println(date);
        while (i-- > 0){
            Date tempDate = DateTimeUtil.addSeconds(date, (int) (Math.random() * 30 * 60));
            System.out.println(tempDate);
            int[] messageDelayLevel = MessageProduceUtil.getMessageDelayLevel(tempDate);

            TaskMsgDealRecordBase taskMsgDealRecordBase = new TaskMsgDealRecordBase();
            taskMsgDealRecordBase.setID(UUID.randomUUID().toString().replace("-",""));
            taskMsgDealRecordBase.setBillID("");
            taskMsgDealRecordBase.setAction("");
            taskMsgDealRecordBase.setBillType("test");
            taskMsgDealRecordBase.setCreateTime(date);
            taskMsgDealRecordBase.setTriggerTime(tempDate);
            taskMsgDealRecordBase.setStatus(0);
            taskMsgDealRecordBase.setParams("");
            taskMsgDealRecordBase.setIsDelete(1);
            taskMsgDealRecordBase.setDealAdaptor("");
            taskMsgDealRecordBaseMapper.insert(taskMsgDealRecordBase);
        }

    }
}
