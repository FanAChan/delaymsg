package com.fwy.delaymsg.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

    public static Date subSeconds(Date date,long seconds){
        return new Date(date.getTime()-seconds * 1000);
    }

    public static Date addSeconds(Date date,long seconds){
        return new Date(date.getTime()+seconds * 1000);
    }

    /**
     *
     * @title 计算相差秒数
     */
    public static long betweenSeconds(Date endDate, Date startDate) {
        long seconds = 1000L;
        long difSeconds = (endDate.getTime() - startDate.getTime()) / seconds;
        return difSeconds;
    }

    public static String format(Date date,String format){
        return new SimpleDateFormat(format).format(date);
    }
}
