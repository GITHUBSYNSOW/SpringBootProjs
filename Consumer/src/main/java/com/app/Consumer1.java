package com.app;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "consumer1")
public class Consumer1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cid")
    private int cid;

    @Column(name="name")
    private String name;

    @Column(name="mail")
    private String mail;

    @Column(name="msg")
    private  String msg;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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
    public Consumer1(){}

    public Consumer1(int cid, String msg){
        this.cid = cid;
        this.msg = msg;
    }

    public Consumer1(int cid, String name, String mail, String msg) {
        this.cid = cid;
        this.name = name;
        this.mail = mail;
        this.msg = msg;
    }

    public String  msg(int cid,String msg){
        if(this.cid==cid)
        {
             this.msg=msg;
             return  "msg transfer!!";
        }
        return  "Msg Is Not Transfer..Id Not matched";
    }
}
