package com.app.conusmer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(StreamConfig.class)
public class Consumer1 {

    public static void main(String[] args) {
        SpringApplication.run(Consumer1.class,args);
    }
}

