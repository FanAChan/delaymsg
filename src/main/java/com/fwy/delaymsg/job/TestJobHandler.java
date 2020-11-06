package com.fwy.delaymsg.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;


@Component
@JobHandler("testJobHandler")
public class TestJobHandler extends IJobHandler {

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        System.out.println("test");
        return ReturnT.SUCCESS;
    }
}
