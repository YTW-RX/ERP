package com.zking.erp.services.orders.impl;

import com.zking.erp.mapper.OrdersMapper;
import com.zking.erp.model.Orders;
import com.zking.erp.services.orders.IOrdersService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int insertOrders(Orders orders) {
        return ordersMapper.insertOrders(orders);
    }

    @Override
    public List<Orders> queryOrdersAllPager(Integer purchaseSale, PageBean pageBean) {
        return ordersMapper.queryOrdersAllPager(purchaseSale);
    }

    @Override
    public int updateOrdersState(Orders orders) {
        return ordersMapper.updateOrdersState(orders);
    }
}
