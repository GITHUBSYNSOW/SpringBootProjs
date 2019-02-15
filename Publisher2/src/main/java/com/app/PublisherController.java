package com.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publish")
public class PublisherController {
    @Autowired
    private PublisherServiceImpl service;

    @GetMapping
    public List<Publisher1> getConsumer(){
        List<Publisher1> resList=service.getAllConsumers();
        return resList;

    }
    @PostMapping
    public String registerConsumer(@RequestBody Publisher1 publisher1){
        String resMsg=service.insertPublisher(publisher1);
        return resMsg;

    }





}
