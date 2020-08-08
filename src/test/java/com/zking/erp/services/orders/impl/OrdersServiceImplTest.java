package com.zking.erp.services.orders.impl;

import com.zking.erp.model.Orders;
import com.zking.erp.services.orders.IOrdersService;
import com.zking.erp.util.PageBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class OrdersServiceImplTest {

    @Autowired
    private IOrdersService iOrdersService;

    @Test
    public void insertOrders() {
        Orders orders = new Orders();
        orders.setOcreatetime(new Date());
        orders.setOchecktime(new Date());
        orders.setOstartime(new Date());
        orders.setOendtime(new Date());
        orders.setOtype("测试");
        orders.setOcreater(1);
        orders.setOchecker(1);
        orders.setOstarter(1);
        orders.setOender(1);
        orders.setOtotalmoney(489.50f);
        orders.setOstate("未审核");
        iOrdersService.insertOrders(orders);
    }

    @Test
    public void queryOrdersAllPager() {
        PageBean pageBean = new PageBean();
        iOrdersService.queryOrdersAllPager(0, pageBean);
    }

    @Test
    public void updateOrdersState() {
        Orders orders = new Orders();
        orders.setOid(1);
        orders.setOstate("已审核");
        iOrdersService.updateOrdersState(orders);
    }
}