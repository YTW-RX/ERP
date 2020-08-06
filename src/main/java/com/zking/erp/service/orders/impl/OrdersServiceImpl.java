package com.zking.erp.service.orders.impl;

import com.zking.erp.mapper.OrdersMapper;
import com.zking.erp.model.Orders;
import com.zking.erp.service.orders.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int insertOrders(Orders orders) {
        return ordersMapper.insertOrders(orders);
    }
}
