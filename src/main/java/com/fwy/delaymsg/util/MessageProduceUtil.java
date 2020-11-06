package com.fwy.delaymsg.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageProduceUtil {

    private static Integer[] messageDelayLevelArray = {1, 5, 10, 30, 60, 120, 180, 240, 300, 360, 420, 480, 540};

    /**
     * 计算消息延时级别，上取整
     * 超过消息可设置的延时级别时返回-1
     *
     * @Author wuyin_fan
     * @Date 2020/5/27 16:06
     * @Param messageDate
     * @Return void
     */
    public static int[] getMessageDelayLevel(Date messageDate){
        //messageDelayLevel=1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h
        int[] result = new int[2];
        Date currentTime = new Date();
        int level = 0;
        //小于当前时间时直接触发不设置延时
        if(messageDate.compareTo(currentTime) <= 0){
            return result;
        }
        //超过消息可设置的延时级别
        long betweenSeconds = DateTimeUtil.betweenSeconds(messageDate, currentTime);
        if(betweenSeconds > messageDelayLevelArray[messageDelayLevelArray.length - 1]){
            result[0] = -1;
            result[1] = 0;
            return result;
        }
        for (Integer seconds : messageDelayLevelArray) {
            if(betweenSeconds <= seconds){
                break;
            }
            level++;
        }
        result[0] = level;
        if(level > 1) {
            result[1] = (int)betweenSeconds - messageDelayLevelArray[level - 1];
        }else{
            result[1] = (int)betweenSeconds;
        }
//        System.out.println("betweenSeconds-->"+betweenSeconds+",level->"+result[0]+",seconds->"+result[1]);
        return result;
    }
}
