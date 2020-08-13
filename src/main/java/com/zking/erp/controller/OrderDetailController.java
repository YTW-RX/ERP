package com.zking.erp.controller;

import com.zking.erp.model.OrderDetail;
import com.zking.erp.model.Orders;
import com.zking.erp.services.orderDetail.IOrderDetailService;
import com.zking.erp.services.orders.IOrdersService;
import com.zking.erp.util.JsonResponseBody;
import com.zking.erp.util.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/OrderDetail")
public class OrderDetailController {

    @Autowired
    private IOrderDetailService iOrderDetailService;

    @Autowired
    private IOrdersService iOrdersService;

    /**
     * 根据订单编号查询所有的商品
     *
     * @param oid
     * @return
     */
    @RequestMapping("/queryOrderDetail")
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
    public JsonResponseBody updateOrderState(OrderDetail orderDetail) {
        int i = iOrderDetailService.updateOrderDetailOstate(orderDetail);
        orderDetail.setOstate("未入库");
        int count = iOrderDetailService.queryOrderDetailCount(orderDetail);
        if (count == 0) {
            Orders orders = new Orders();
            orders.setOid(orderDetail.getOid());
            orders.setOender(orderDetail.getOender());
            orders.setOendtime(orderDetail.getOendtime());
            orders.setOstate("已入库");
            iOrdersService.updateOrdersState(orders);
        }
        if (i > 0) {
            return new JsonResponseBody(ResponseStatus.STATUS_200);
        } else {
            return new JsonResponseBody(ResponseStatus.STATUS_201);
        }
    }

    /**
     * 新增商品
     *
     * @param orderDetail
     */
    @RequestMapping("/insertOrderDetail")
    public JsonResponseBody insertOrderDetail(OrderDetail orderDetail) {
        int i = iOrderDetailService.insertOrderDetail(orderDetail);
        if (i > 0) {
            return new JsonResponseBody(ResponseStatus.STATUS_200);
        } else {
            return new JsonResponseBody(ResponseStatus.STATUS_201);
        }
    }

    /**
     * 删除商品
     *
     * @param orderdetailid
     */
    @RequestMapping("/deleteOrderDetail")
    public JsonResponseBody deleteOrderDetail(Integer orderdetailid) {
        int i = iOrderDetailService.deleteOrderDetail(orderdetailid);
        if (i > 0) {
            return new JsonResponseBody(ResponseStatus.STATUS_200);
        } else {
            return new JsonResponseBody(ResponseStatus.STATUS_201);
        }
    }

}
