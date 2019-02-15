package com.app;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consume")
public class ConsumerController {
    @Autowired
    private ConsumerService service;
    private Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping
    public String registerPublisher(@RequestBody Consumer1 consumer1){
        String resultMsg=service.saveConsumer(consumer1);
        logger.info(resultMsg);
        return resultMsg;

    }



}
