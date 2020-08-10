package com.zking.erp.mapper;

import com.zking.erp.model.OrderDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orderdetailid);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orderdetailid);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);

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