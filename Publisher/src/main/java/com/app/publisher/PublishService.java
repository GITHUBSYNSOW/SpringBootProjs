package com.app.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PublishService {

    @Autowired
    private PublishRepo repo;


    public String savePublish(Publish publish){
        Publish publish1=repo.save(publish);
        return "saved";
    }

    public String transferMsg(String pid,String msg){
      Optional<Publish> res=repo.findById(pid);
      if(res.isPresent()){
        String result=res.get().msg(pid,msg);
            if(result!=null){
                repo.save(res.get());
                return  " msg transfer  Pid  Found>>>>>>>>>>>>";
            }

      }
    return  "Pid Not Found>>>>>>>>>>>>";
    }

}
