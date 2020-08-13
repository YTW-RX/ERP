package com.zking.erp.services.orders;

import com.zking.erp.model.Orders;
import com.zking.erp.util.PageBean;

import java.util.List;

public interface IOrdersService {

    // 录入订单（新增订单）
    int insertOrders(Orders orders);

    // 查询所有采购订单
    List<Orders> queryOrdersAllPager(Integer purchaseSale, PageBean pageBean);

    /**
     * 查询未审核的采购订单
     *
     * @param oState
     * @return
     */
    List<Orders> queryOrdersPager(String oState, PageBean pageBean);

    //修改采购订单状态
    int updateOrdersState(Orders orders);

}
