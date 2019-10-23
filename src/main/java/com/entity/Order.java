package com.entity;

import java.io.Serializable;
import java.util.*;

public class Order implements Serializable{
    private Integer oid;

    private Integer uid;

    private Integer rid;

    private Integer number;

    private Double total;

    private Date submissiontime;

    private Integer paymentstatus;

    private Integer receivingstatus;

    private Integer showstatus;

    private  List<Orderdetails> ordetList;
    private Receiving receiving;

    public Receiving getReceiving() {
        return receiving;
    }

    public void setReceiving(Receiving receiving) {
        this.receiving = receiving;
    }

    public List<Orderdetails> getOrdetList() {
        return ordetList;
    }

    public void setOrdetList(List<Orderdetails> ordetList) {
        this.ordetList = ordetList;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getSubmissiontime() {
        return submissiontime;
    }

    public void setSubmissiontime(Date submissiontime) {
        this.submissiontime = submissiontime;
    }

    public Integer getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(Integer paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public Integer getReceivingstatus() {
        return receivingstatus;
    }

    public void setReceivingstatus(Integer receivingstatus) {
        this.receivingstatus = receivingstatus;
    }

    public Integer getShowstatus() {
        return showstatus;
    }

    public void setShowstatus(Integer showstatus) {
        this.showstatus = showstatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", rid=" + rid +
                ", number=" + number +
                ", total=" + total +
                ", submissiontime=" + submissiontime +
                ", paymentstatus=" + paymentstatus +
                ", receivingstatus=" + receivingstatus +
                ", showstatus=" + showstatus +
                '}';
    }
}