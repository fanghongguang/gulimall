package com.atguigu.gulimall.member;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }
    @Bean
    public GlobalConfig globalConfig(){
        GlobalConfig config = new GlobalConfig();
        config.setDbConfig(new GlobalConfig.DbConfig().setIdType(IdType.AUTO));
        return config;
    }
}
