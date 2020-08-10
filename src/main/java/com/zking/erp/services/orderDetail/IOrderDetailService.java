package com.zking.erp.services.orderDetail;

import com.zking.erp.model.OrderDetail;

import java.util.List;

public interface IOrderDetailService {

    /**
     * 根据订单号查询订单内的商品
     *
     * @param oid
     * @return
     */
    List<OrderDetail> queryOrderDetail(Integer oid);

    /**
     * 新增订单明细（新增订单商品）
     *
     * @param orderDetail
     * @return
     */
    int insertOrderDetail(OrderDetail orderDetail);

    /**
     * 删除订单明细商品
     *
     * @param orderdetailid
     * @return
     */
    int deleteOrderDetail(Integer orderdetailid);

    /**
     * 修改商品状态
     *
     * @param orderDetail
     * @return
     */
    int updateOrderDetailOstate(OrderDetail orderDetail);

}
