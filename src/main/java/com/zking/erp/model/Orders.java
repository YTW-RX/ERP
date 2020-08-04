package com.zking.erp.model;

import java.util.Date;

public class Orders {
    private Integer oid;

    private Date ocreatetime;

    private Date ochecktime;

    private Date ostartime;

    private Date oendtime;

    private String otype;

    private Integer ocreater;

    private Integer ochecker;

    private Integer ostarter;

    private Integer oender;

    private Integer supplierid;

    private Float ototalmoney;

    private Boolean ostate;

    public Orders(Integer oid, Date ocreatetime, Date ochecktime, Date ostartime, Date oendtime, String otype, Integer ocreater, Integer ochecker, Integer ostarter, Integer oender, Integer supplierid, Float ototalmoney, Boolean ostate) {
        this.oid = oid;
        this.ocreatetime = ocreatetime;
        this.ochecktime = ochecktime;
        this.ostartime = ostartime;
        this.oendtime = oendtime;
        this.otype = otype;
        this.ocreater = ocreater;
        this.ochecker = ochecker;
        this.ostarter = ostarter;
        this.oender = oender;
        this.supplierid = supplierid;
        this.ototalmoney = ototalmoney;
        this.ostate = ostate;
    }

    public Orders() {
        super();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Date getOcreatetime() {
        return ocreatetime;
    }

    public void setOcreatetime(Date ocreatetime) {
        this.ocreatetime = ocreatetime;
    }

    public Date getOchecktime() {
        return ochecktime;
    }

    public void setOchecktime(Date ochecktime) {
        this.ochecktime = ochecktime;
    }

    public Date getOstartime() {
        return ostartime;
    }

    public void setOstartime(Date ostartime) {
        this.ostartime = ostartime;
    }

    public Date getOendtime() {
        return oendtime;
    }

    public void setOendtime(Date oendtime) {
        this.oendtime = oendtime;
    }

    public String getOtype() {
        return otype;
    }

    public void setOtype(String otype) {
        this.otype = otype;
    }

    public Integer getOcreater() {
        return ocreater;
    }

    public void setOcreater(Integer ocreater) {
        this.ocreater = ocreater;
    }

    public Integer getOchecker() {
        return ochecker;
    }

    public void setOchecker(Integer ochecker) {
        this.ochecker = ochecker;
    }

    public Integer getOstarter() {
        return ostarter;
    }

    public void setOstarter(Integer ostarter) {
        this.ostarter = ostarter;
    }

    public Integer getOender() {
        return oender;
    }

    public void setOender(Integer oender) {
        this.oender = oender;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Float getOtotalmoney() {
        return ototalmoney;
    }

    public void setOtotalmoney(Float ototalmoney) {
        this.ototalmoney = ototalmoney;
    }

    public Boolean getOstate() {
        return ostate;
    }

    public void setOstate(Boolean ostate) {
        this.ostate = ostate;
    }
}