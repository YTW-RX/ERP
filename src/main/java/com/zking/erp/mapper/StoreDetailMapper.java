package com.zking.erp.mapper;

import com.zking.erp.model.StoreDetail;

public interface StoreDetailMapper {
    int deleteByPrimaryKey(Integer storedetailid);

    int insert(StoreDetail record);

    int insertSelective(StoreDetail record);

    StoreDetail selectByPrimaryKey(Integer storedetailid);

    int updateByPrimaryKeySelective(StoreDetail record);

    int updateByPrimaryKey(StoreDetail record);
}