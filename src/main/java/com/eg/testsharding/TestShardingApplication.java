package com.eg.testsharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class TestShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestShardingApplication.class, args);
    }

}
