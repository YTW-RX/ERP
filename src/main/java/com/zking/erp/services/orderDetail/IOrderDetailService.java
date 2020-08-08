package com.zking.erp.services.orderDetail;

import com.zking.erp.model.OrderDetail;

public interface IOrderDetailService {

    // 新增订单明细（新增订单商品）
    int insertOrderDetail(OrderDetail orderDetail);

    // 删除订单明细商品
    int deleteOrderDetail(Integer orderdetailid);

}
