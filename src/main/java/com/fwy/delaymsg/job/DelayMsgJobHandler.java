package com.fwy.delaymsg.job;

import com.fwy.delaymsg.bean.entity.TaskMsgDealRecordBase;
import com.fwy.delaymsg.bean.entity.TaskMsgDealRecordBaseExample;
import com.fwy.delaymsg.bean.entity.vo.TaskMsgDealRecordVo;
import com.fwy.delaymsg.dao.mapper.TaskMsgDealRecordBaseMapper;
import com.fwy.delaymsg.util.DateTimeUtil;
import com.fwy.delaymsg.util.MessageProduceUtil;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.dom4j.CDATA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Component
@JobHandler("delayMsgJobHandler")
public class DelayMsgJobHandler extends IJobHandler {

    @Resource
    private TaskMsgDealRecordBaseMapper taskMsgDealRecordBaseMapper;

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        List<TaskMsgDealRecordBase> last30MinMsg = this.getLast30MinMsg();
        return ReturnT.SUCCESS;
    }

    private List<TaskMsgDealRecordBase> getLast30MinMsg(){
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

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        //延迟1s执行
        scheduledExecutorService.schedule(() -> {},1,TimeUnit.SECONDS);
        //延迟1s执行，之后每1s执行一次，按任务开始时间1s后
        scheduledExecutorService.scheduleAtFixedRate(() -> {},1,1,TimeUnit.SECONDS);
        //延迟1s执行，之后每1s执行一次，按任务结束时间1s后
        scheduledExecutorService.scheduleWithFixedDelay(() -> {},1,1,TimeUnit.SECONDS);
        scheduledExecutorService.schedule(() -> {},1,TimeUnit.SECONDS);

        for (TaskMsgDealRecordBase taskMsgDealRecordBase : taskMsgDealRecordBases) {
            int[] messageDelayLevel = MessageProduceUtil.getMessageDelayLevel(taskMsgDealRecordBase.getTriggerTime());
            //延迟级别为0 延迟时间为0 直接发送
            if(0 == messageDelayLevel[0] && 0 == messageDelayLevel[1]){
                System.out.println("直接发送--->"+taskMsgDealRecordBase.getTriggerTime());
            }else if(0 != messageDelayLevel[0] && 0 == messageDelayLevel[1]){
                //延迟级别不为0 延迟时间为0 直接发送并设置延迟级别
                System.out.println("设置延迟级别后发送--->"+taskMsgDealRecordBase.getTriggerTime());
            }else if( 0 != messageDelayLevel[0] && 0 != messageDelayLevel[1]){
                //延时级别不为0 延迟时间不为0 延时后发送
                scheduledExecutorService.schedule(new DelaySendMsg(taskMsgDealRecordBase,messageDelayLevel[0]),messageDelayLevel[1], TimeUnit.SECONDS);
            }
        }
        return taskMsgDealRecordBases;
    }
}

class DelaySendMsg implements Runnable{

    private TaskMsgDealRecordBase taskMsgDealRecordBase;

    private int delayLevel;

    public DelaySendMsg(TaskMsgDealRecordBase taskMsgDealRecordBase, int delayLevel) {
        this.taskMsgDealRecordBase = taskMsgDealRecordBase;
        this.delayLevel = delayLevel;
    }

    @Override
    public void run() {
        System.out.println("延迟发送--->"+ taskMsgDealRecordBase.getTriggerTime());
    }
}
