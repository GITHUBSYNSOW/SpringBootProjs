package com.app;

import java.security.PrivateKey;

public class ConsumerEvent {

    private int cid;
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
    public ConsumerEvent(int cid, String msg) {
        this.cid = cid;
        this.msg = msg;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
