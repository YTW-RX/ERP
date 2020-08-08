package com.zking.erp.mapper;

import com.zking.erp.model.OrderDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orderdetailid);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orderdetailid);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);

    // 新增订单明细（新增订单商品）
    int insertOrderDetail(OrderDetail orderDetail);

    // 删除订单明细商品
    int deleteOrderDetail(Integer orderdetailid);

}