package com.zking.erp.controller;

import com.zking.erp.model.OrderDetail;
import com.zking.erp.services.orderDetail.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/OrderDetail")
public class OrderDetailController {

    @Autowired
    private IOrderDetailService iOrderDetailService;

    @RequestMapping("/queryOrderDetail")
    @ResponseBody
    public List<OrderDetail> queryOrderDetail(Integer oid) {
        List<OrderDetail> rows = iOrderDetailService.queryOrderDetail(oid);
        return rows;
    }

    /**
     * 修改商品状态
     *
     * @param orderDetail
     * @return
     */
    @RequestMapping("/updateOrderState")
    public String updateOrderState(OrderDetail orderDetail) {
        iOrderDetailService.updateOrderDetailOstate(orderDetail);
        return "redirect:queryOrderDetail";
    }

    /**
     * 新增商品
     *
     * @param orderDetail
     */
    @RequestMapping("/insertOrderDetail")
    public String insertOrderDetail(OrderDetail orderDetail) {
        iOrderDetailService.insertOrderDetail(orderDetail);
        return "redirect:queryOrderDetail";
    }

    /**
     * 删除商品
     *
     * @param orderdetailid
     */
    @RequestMapping("/deleteOrderDetail")
    public String deleteOrderDetail(Integer orderdetailid) {
        iOrderDetailService.deleteOrderDetail(orderdetailid);
        return "redirect:queryOrderDetail";
    }

}
