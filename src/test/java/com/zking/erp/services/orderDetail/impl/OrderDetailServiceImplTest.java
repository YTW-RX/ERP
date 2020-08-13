package com.zking.erp.services.orderDetail.impl;

import com.zking.erp.model.OrderDetail;
import com.zking.erp.services.orderDetail.IOrderDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class OrderDetailServiceImplTest {

    @Autowired
    private IOrderDetailService iOrderDetailService;

    @Test
    public void insertOrderDetail() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setGid(1);
        orderDetail.setGname("内存条");
        orderDetail.setOprice(618.50f);
        orderDetail.setOnum(1);
        orderDetail.setOmoney(618.50f);
        orderDetail.setStoreid(1);
        orderDetail.setOstate("未入库");
        orderDetail.setOid(2);
        iOrderDetailService.insertOrderDetail(orderDetail);
    }

    @Test
    public void deleteOrderDetail() {
        iOrderDetailService.deleteOrderDetail(2);
    }

    @Test
    public void queryOrderDetail() {
        int oid = 1;
        iOrderDetailService.queryOrderDetail(oid);
    }

    @Test
    public void queryOrderDetailCount() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOid(33);
        orderDetail.setOstate("未入库");
        int i = iOrderDetailService.queryOrderDetailCount(orderDetail);
        System.out.println(i);
    }
}