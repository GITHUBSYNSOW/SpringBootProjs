package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(StreamConfig.class)
public class Consumer {

    public static void main(String[] args) {
        SpringApplication.run(Consumer.class,args);
    }
}
