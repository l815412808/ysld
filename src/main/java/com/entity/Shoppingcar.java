package com.entity;

import java.io.Serializable;

public class Shoppingcar implements Serializable{
    private Integer cid;

    private Integer uid;

    private Integer pid;

    private Integer number;

    private Integer showstatus;
    private Product  pro;

    public Product getPro() {
        return pro;
    }

    public void setPro(Product pro) {
        this.pro = pro;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getShowstatus() {
        return showstatus;
    }

    public void setShowstatus(Integer showstatus) {
        this.showstatus = showstatus;
    }

    @Override
    public String toString() {
        return "Shoppingcar{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", number=" + number +
                ", showstatus=" + showstatus +
                '}';
    }
}