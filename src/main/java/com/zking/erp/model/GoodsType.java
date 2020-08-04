package com.zking.erp.model;

public class GoodsType {
    private Integer gtid;

    private String gtype;

    public GoodsType(Integer gtid, String gtype) {
        this.gtid = gtid;
        this.gtype = gtype;
    }

    public GoodsType() {
        super();
    }

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }
}