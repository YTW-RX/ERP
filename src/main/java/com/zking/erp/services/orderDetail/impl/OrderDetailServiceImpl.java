package com.zking.erp.services.orderDetail.impl;

import com.zking.erp.mapper.OrderDetailMapper;
import com.zking.erp.model.OrderDetail;
import com.zking.erp.services.orderDetail.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements IOrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public int insertOrderDetail(OrderDetail orderDetail) {
        return orderDetailMapper.insertOrderDetail(orderDetail);
    }

    @Override
    public int deleteOrderDetail(Integer orderdetailid) {
        return orderDetailMapper.deleteOrderDetail(orderdetailid);
    }
}
