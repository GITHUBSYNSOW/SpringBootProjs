package com.app;

public class ConsumerEvent {

        private int cid;
        private String msg;


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
