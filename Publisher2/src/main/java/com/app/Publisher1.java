package com.app;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="publisher1")
public class Publisher1 implements Serializable {

    @Id
    /*@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pid")
    private int pid;
    @Column(name="cid")
    private int cid;
    @Column(name="msg")
    private  String msg;

    public Publisher1(){}

    public Publisher1(int pid, int cid, String msg) {
        this.pid = pid;
        this.cid = cid;
        this.msg = msg;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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
