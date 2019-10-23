package com.entity;

import java.io.Serializable;

public class Product  implements Serializable{
    private Integer pid;

    private String pname;

    private Integer did;

    private Double price;

    private Integer capacity;

    private Integer stock;

    private String l1;

    private String l2;

    private String l3;

    private String filename;

    private Integer upstatus;
    private Pdecription pdobj;

    public Pdecription getPdobj() {
        return pdobj;
    }

    public void setPdobj(Pdecription pdobj) {
        this.pdobj = pdobj;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1 == null ? null : l1.trim();
    }

    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2 == null ? null : l2.trim();
    }

    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3 == null ? null : l3.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getUpstatus() {
        return upstatus;
    }

    public void setUpstatus(Integer upstatus) {
        this.upstatus = upstatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", did=" + did +
                ", price=" + price +
                ", capacity=" + capacity +
                ", stock=" + stock +
                ", l1='" + l1 + '\'' +
                ", l2='" + l2 + '\'' +
                ", l3='" + l3 + '\'' +
                ", filename='" + filename + '\'' +
                ", upstatus=" + upstatus +
                '}';
    }
}