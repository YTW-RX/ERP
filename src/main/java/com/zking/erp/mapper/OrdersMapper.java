package com.zking.erp.mapper;

import com.zking.erp.model.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {

    // 录入采购订单（新增订单）
    int insertOrders(Orders orders);

    // 根据订单oid查询单个订单
    Orders selectOrders(Integer oid);

    // 查询所有采购订单
    List<Orders> queryOrdersAll();

    /*int deleteByPrimaryKey(Integer oid);

    int insertSelective(Orders record);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);*/
}