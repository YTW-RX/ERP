package com.zking.erp.mapper;

import com.zking.erp.model.StoreOper;

public interface StoreOperMapper {
    int deleteByPrimaryKey(Integer storeoperid);

    int insert(StoreOper record);

    int insertSelective(StoreOper record);

    StoreOper selectByPrimaryKey(Integer storeoperid);

    int updateByPrimaryKeySelective(StoreOper record);

    int updateByPrimaryKey(StoreOper record);
}