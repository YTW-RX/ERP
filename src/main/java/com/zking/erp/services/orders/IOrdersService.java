package com.zking.erp.services.orders;

import com.zking.erp.model.Orders;
import com.zking.erp.util.PageBean;

import java.util.List;

public interface IOrdersService {

    // 录入采购订单（新增订单）
    int insertOrders(Orders orders);

    // 查询所有采购订单
    List<Orders> queryOrdersAllPager(PageBean pageBean);

    //修改采购订单状态
    int updateOrdersState(Orders orders);

}
