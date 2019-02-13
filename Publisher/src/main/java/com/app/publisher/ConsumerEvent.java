package com.app.publisher;

import java.security.PrivateKey;

public class ConsumerEvent {

    private String pid;
    private String msg;
   /* private String mail;
    private String id;*/

   /* public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/

    public ConsumerEvent(){}
    public ConsumerEvent(String pid, String msg) {
        this.pid = pid;
        this.msg = msg;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
