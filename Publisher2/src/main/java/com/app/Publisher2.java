package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(StreamConfig.class)
public class Publisher2 {

    public static void main(String[] args) {
        SpringApplication.run(com.app.Publisher2.class,args);
    }
}
