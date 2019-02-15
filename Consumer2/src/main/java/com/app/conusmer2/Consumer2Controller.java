package com.app.conusmer2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/consumer2")
public class Consumer2Controller {


    @Autowired
    private ConsumerService service;
    private Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping
    public String registerPublisher(@RequestBody Consumer2 consumer2) {
        String resultMsg = service.saveConsumer(consumer2);
        logger.info(resultMsg);
        return resultMsg;

    }
}






























