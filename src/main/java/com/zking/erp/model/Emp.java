package com.zking.erp.model;

import java.util.Date;

public class Emp {
    private Integer empid;

    private String empusername;

    private String emppwd;

    private String empname;

    private String empsex;

    private String empemail;

    private String emptel;

    private String empaddress;

    private Date empbirthday;

    private Integer did;

    private Integer rid;

    public Emp(Integer empid, String empusername, String emppwd, String empname, String empsex, String empemail, String emptel, String empaddress, Date empbirthday, Integer did, Integer rid) {
        this.empid = empid;
        this.empusername = empusername;
        this.emppwd = emppwd;
        this.empname = empname;
        this.empsex = empsex;
        this.empemail = empemail;
        this.emptel = emptel;
        this.empaddress = empaddress;
        this.empbirthday = empbirthday;
        this.did = did;
        this.rid = rid;
    }

    public Emp() {
        super();
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpusername() {
        return empusername;
    }

    public void setEmpusername(String empusername) {
        this.empusername = empusername;
    }

    public String getEmppwd() {
        return emppwd;
    }

    public void setEmppwd(String emppwd) {
        this.emppwd = emppwd;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex;
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }

    public String getEmptel() {
        return emptel;
    }

    public void setEmptel(String emptel) {
        this.emptel = emptel;
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress;
    }

    public Date getEmpbirthday() {
        return empbirthday;
    }

    public void setEmpbirthday(Date empbirthday) {
        this.empbirthday = empbirthday;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}