package com.zking.erp.controller;

import com.zking.erp.model.OrderDetail;
import com.zking.erp.services.orderDetail.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/OrderDetail")
public class OrderDetailController {

    @Autowired
    private IOrderDetailService iOrderDetailService;

    @RequestMapping("/insertOrderDetail")
    @ResponseBody
    public void insertOrderDetail(OrderDetail orderDetail) {
        iOrderDetailService.insertOrderDetail(orderDetail);
    }

    @RequestMapping("/deleteOrderDetail")
    @ResponseBody
    public void deleteOrderDetail(Integer orderdetailid) {
        iOrderDetailService.deleteOrderDetail(orderdetailid);
    }

}
