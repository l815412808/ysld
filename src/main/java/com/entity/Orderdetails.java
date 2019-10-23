package com.entity;

import java.io.Serializable;

public class Orderdetails implements Serializable {
    private Integer orid;

    private Integer oid;

    private Integer pid;

    private Integer onumber;
    private Product pro;

    public Product getPro() {
        return pro;
    }

    public void setPro(Product pro) {
        this.pro = pro;
    }

    public Integer getOrid() {
        return orid;
    }

    public void setOrid(Integer orid) {
        this.orid = orid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOnumber() {
        return onumber;
    }

    public void setOnumber(Integer onumber) {
        this.onumber = onumber;
    }

    public Orderdetails(Integer orid, Integer oid, Integer pid, Integer onumber) {
        this.orid = orid;
        this.oid = oid;
        this.pid = pid;
        this.onumber = onumber;
    }

    public Orderdetails() {
    }

    @Override
    public String toString() {
        return "Orderdetails{" +
                "orid=" + orid +
                ", oid=" + oid +
                ", pid=" + pid +
                ", onumber=" + onumber +
                '}';
    }
}