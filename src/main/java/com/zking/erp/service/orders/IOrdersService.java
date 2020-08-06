package com.zking.erp.service.orders;

import com.zking.erp.model.Orders;

import java.util.List;

public interface IOrdersService {

    // 录入采购订单（新增订单）
    int insertOrders(Orders orders);

}
