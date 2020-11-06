package com.fwy.delaymsg;

import com.fwy.delaymsg.bean.entity.TaskMsgDealRecordBase;
import com.fwy.delaymsg.bean.entity.TaskMsgDealRecordBaseExample;
import com.fwy.delaymsg.dao.mapper.TaskMsgDealRecordBaseMapper;
import com.fwy.delaymsg.util.DateTimeUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@SpringBootTest(classes = DelayMsgApplication.class)
class DelayMsgApplicationTests {

    @Resource
    TaskMsgDealRecordBaseMapper taskMsgDealRecordBaseMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void test1(){
        Date date = new Date();
        Date endTime = DateTimeUtil.addSeconds(date, 30 * 60);
        TaskMsgDealRecordBaseExample example = new TaskMsgDealRecordBaseExample();
        example.createCriteria()
                .andIsDeleteEqualTo(1)
                .andBillTypeEqualTo("test")
                .andStatusEqualTo(0)
                .andTriggerTimeBetween(date,endTime);

        List<TaskMsgDealRecordBase> taskMsgDealRecordBases = taskMsgDealRecordBaseMapper.selectByExample(example);
        System.out.println(taskMsgDealRecordBases.size());
        System.out.println(System.currentTimeMillis() - date.getTime());
    }

}
