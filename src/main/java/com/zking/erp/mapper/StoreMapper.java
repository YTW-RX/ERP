package com.zking.erp.mapper;

import com.zking.erp.model.Store;

public interface StoreMapper {
    int deleteByPrimaryKey(Integer storeid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer storeid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}