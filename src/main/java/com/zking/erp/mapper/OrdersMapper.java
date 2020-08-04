package com.zking.erp.mapper;

import com.zking.erp.model.Orders;

public interface OrdersMapper {

    // 录入采购订单（新增订单）
    int insertOrders(Orders record);

    // 根据订单oid查询采购订单表
    Orders selectOrders(Integer oid);

    /*int deleteByPrimaryKey(Integer oid);

    int insertSelective(Orders record);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);*/
}