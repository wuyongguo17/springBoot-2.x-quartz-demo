package com.wyg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class QuartzDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuartzDemoApplication.class);
    }
}
