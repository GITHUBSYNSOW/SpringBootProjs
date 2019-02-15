package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepo repo;


    public String saveConsumer(Consumer1 consumer){
        Consumer1 consumer1 =repo.save(consumer);
        return "saved";
    }

    public String transferMsg(int cid,String msg){
      Optional<Consumer1> res=repo.findById(cid);
      if(res.isPresent()){
        String result=res.get().msg(cid,msg);
            if(result!=null){
                repo.save(res.get());
                return  " msg transfer  Pid  Found>>>>>>>>>>>>";
            }

      }
    return  "Pid Not Found>>>>>>>>>>>>";
    }

}
