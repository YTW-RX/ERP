package com.zking.erp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ErpRight {
    private String rcode;

    private String rparentcode;

    private String rtype;

    private String rtext;

    private String rurl;

    private String rtip;

    private List<ErpRight> childrenNodes;
}