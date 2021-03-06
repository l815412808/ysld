package com.entity;

import java.io.Serializable;

public class Classify implements Serializable {
    private String cid;

    private String cname;

    private String parentid;

    private Integer type;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", parentid='" + parentid + '\'' +
                ", type=" + type +
                '}';
    }
}