package com.app.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class PublishController {
    @Autowired
    private  PublishService service;

    @PostMapping
    public String registerPublisher(@RequestBody Publish publish){
        String resultMsg=service.savePublish(publish);
        return resultMsg;

}



}
