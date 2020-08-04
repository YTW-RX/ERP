package com.zking.erp.mapper;

import com.zking.erp.model.ErpRight;

public interface ErpRightMapper {
    int deleteByPrimaryKey(String rcode);

    int insert(ErpRight record);

    int insertSelective(ErpRight record);

    ErpRight selectByPrimaryKey(String rcode);

    int updateByPrimaryKeySelective(ErpRight record);

    int updateByPrimaryKey(ErpRight record);
}