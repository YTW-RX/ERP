package com.zking.erp.mapper;

import com.zking.erp.model.GoodsType;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer gtid);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer gtid);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}