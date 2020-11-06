package com.fwy.delaymsg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.fwy.delaymsg.dao.mapper")
public class DelayMsgApplication {

    public static void main(String[] args) {
        SpringApplication.run(DelayMsgApplication.class, args);
    }

}
