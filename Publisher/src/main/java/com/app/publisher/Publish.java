package com.app.publisher;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "publish")
public class Publish {
    @Id
  /*  @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")*/
    private String pid;

    private String name;

    private String mail;

    private  String msg;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Publish(){}

    public Publish(String pid,String msg){
        this.pid = pid;
        this.msg = msg;
    }

    public Publish(String pid, String name, String mail, String msg) {
        this.pid = pid;
        this.name = name;
        this.mail = mail;
        this.msg = msg;
    }

    public String  msg(String pid,String msg){
        if(this.pid.equals(pid))
        {
             this.msg=msg;
             return  "msg transfer!!";
        }
        return  "Msg Is Not Transfer..Id Not matched";
    }
}
