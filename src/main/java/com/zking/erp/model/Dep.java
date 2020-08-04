package com.zking.erp.model;

public class Dep {
    private Integer depid;

    private String depname;

    private String deptel;

    public Dep(Integer depid, String depname, String deptel) {
        this.depid = depid;
        this.depname = depname;
        this.deptel = deptel;
    }

    public Dep() {
        super();
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getDeptel() {
        return deptel;
    }

    public void setDeptel(String deptel) {
        this.deptel = deptel;
    }
}