package com.zking.erp.mapper;

import com.zking.erp.model.ErpFunction;

public interface ErpFunctionMapper {
    int deleteByPrimaryKey(Long fid);

    int insert(ErpFunction record);

    int insertSelective(ErpFunction record);

    ErpFunction selectByPrimaryKey(Long fid);

    int updateByPrimaryKeySelective(ErpFunction record);

    int updateByPrimaryKey(ErpFunction record);
}