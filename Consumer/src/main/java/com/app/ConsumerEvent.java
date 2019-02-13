package com.app;

public class ConsumerEvent {

        private String pid;
        private String msg;


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
