package com.eg.testsharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//        (exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.eg.testsharding.bean.mapper")
public class TestShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestShardingApplication.class, args);
    }

}
