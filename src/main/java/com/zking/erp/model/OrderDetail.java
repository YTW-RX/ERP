package com.zking.erp.model;

import java.util.Date;

public class OrderDetail {
    private Integer orderdetailid;

    private Integer gid;

    private String gname;

    private Float oprice;

    private Integer onum;

    private Float omoney;

    private Date oendtime;

    private Integer oender;

    private Integer storeid;

    private String ostate;

    private Integer oid;

    public OrderDetail(Integer orderdetailid, Integer gid, String gname, Float oprice, Integer onum, Float omoney, Date oendtime, Integer oender, Integer storeid, String ostate, Integer oid) {
        this.orderdetailid = orderdetailid;
        this.gid = gid;
        this.gname = gname;
        this.oprice = oprice;
        this.onum = onum;
        this.omoney = omoney;
        this.oendtime = oendtime;
        this.oender = oender;
        this.storeid = storeid;
        this.ostate = ostate;
        this.oid = oid;
    }

    public OrderDetail() {
        super();
    }

    public Integer getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Float getOprice() {
        return oprice;
    }

    public void setOprice(Float oprice) {
        this.oprice = oprice;
    }

    public Integer getOnum() {
        return onum;
    }

    public void setOnum(Integer onum) {
        this.onum = onum;
    }

    public Float getOmoney() {
        return omoney;
    }

    public void setOmoney(Float omoney) {
        this.omoney = omoney;
    }

    public Date getOendtime() {
        return oendtime;
    }

    public void setOendtime(Date oendtime) {
        this.oendtime = oendtime;
    }

    public Integer getOender() {
        return oender;
    }

    public void setOender(Integer oender) {
        this.oender = oender;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getOstate() {
        return ostate;
    }

    public void setOstate(String ostate) {
        this.ostate = ostate;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}