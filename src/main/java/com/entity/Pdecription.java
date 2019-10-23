package com.entity;

import java.io.Serializable;

public class Pdecription  implements Serializable{
    private Integer id;

    private String dname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    @Override
    public String toString() {
        return "Pdecription{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                '}';
    }
}