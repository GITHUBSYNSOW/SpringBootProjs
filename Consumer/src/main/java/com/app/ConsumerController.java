package com.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private ConsumerServiceImpl service;

    @GetMapping
    public List<Consumer1> getConsumer(){
        List<Consumer1> resList=service.getAllConsumers();
        return resList;

    }
    @PostMapping
    public String registerConsumer(@RequestBody Consumer1 consumer1){
        String resMsg=service.insertConsumer(consumer1);
        return resMsg;

    }





}
