package com.zking.erp.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Orders {
    private Integer oid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ocreatetime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ochecktime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ostartime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date oendtime;

    private String otype;

    private Integer ocreater;

    private Integer ochecker;

    private Integer ostarter;

    private Integer oender;

    private Integer supplierid;

    private Float ototalmoney;

    private String ostate;

    private Integer purchaseSale;

    public Orders(Integer oid, Date ocreatetime, Date ochecktime, Date ostartime, Date oendtime, String otype, Integer ocreater, Integer ochecker, Integer ostarter, Integer oender, Integer supplierid, Float ototalmoney, String ostate, Integer purchaseSale) {
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
        this.purchaseSale = purchaseSale;
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

    public String getOstate() {
        return ostate;
    }

    public void setOstate(String ostate) {
        this.ostate = ostate;
    }

    public int getpurchaseSale() {
        return purchaseSale;
    }

    public void setpurchaseSale(int purchaseSale) {
        this.purchaseSale = purchaseSale;
    }
}