package com.zking.erp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StoreDetail {
    private Integer storedetailid;

    private Integer storeid;

    private Integer gid;

    private Integer snum;

    private String stname;

    private String gname;
}