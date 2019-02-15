package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceListner {

    @Autowired
    private ConsumerService service;

    private Logger logger = LoggerFactory.getLogger(getClass());


    @StreamListener(InputStream.INPUT)
    public void consume(@Payload ConsumerEvent event)throws Exception{

        logger.info("listener start  processing ");
        String msg=service.transferMsg(event.getCid(),event.getMsg());
        logger.info("listener  process is completed...............");
        throw new  Exception();

    }

}
