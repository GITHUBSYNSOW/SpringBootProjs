package com.app.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceListner {

    @Autowired
    private  PublishService service;

    private Logger logger = LoggerFactory.getLogger(getClass());


    @StreamListener(InputStream.INPUT)
    public void consume(@Payload ConsumerEvent event){

        logger.info("listener start  processing ");
        String msg=service.transferMsg(event.getPid(),event.getMsg());
        logger.info("listener  process is completed...............");

    }

}
