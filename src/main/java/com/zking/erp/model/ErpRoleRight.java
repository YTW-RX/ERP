package com.zking.erp.model;

public class ErpRoleRight {
    private Long rfid;

    private Long rid;

    private String rcode;

    public ErpRoleRight(Long rfid, Long rid, String rcode) {
        this.rfid = rfid;
        this.rid = rid;
        this.rcode = rcode;
    }

    public ErpRoleRight() {
        super();
    }

    public Long getRfid() {
        return rfid;
    }

    public void setRfid(Long rfid) {
        this.rfid = rfid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }
}