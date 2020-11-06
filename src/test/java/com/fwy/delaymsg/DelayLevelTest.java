package com.fwy.delaymsg;

import com.fwy.delaymsg.util.DateTimeUtil;
import com.fwy.delaymsg.util.MessageProduceUtil;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Random;

public class DelayLevelTest {

    @Test
    public void testCalDelayLevel(){

        int i = 1000000;
        Date date = new Date();
        System.out.println(date);
        while (i-- > 0){
            Date tempDate = DateTimeUtil.addSeconds(date, (int) (Math.random() * 30 * 60));
            System.out.println(tempDate);
            int[] messageDelayLevel = MessageProduceUtil.getMessageDelayLevel(tempDate);
        }
        System.out.println("-----------------------");
        System.out.println(System.currentTimeMillis() - date.getTime());
    }
}
