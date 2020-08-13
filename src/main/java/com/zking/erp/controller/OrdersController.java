package com.zking.erp.controller;

import com.zking.erp.model.Orders;
import com.zking.erp.services.orders.IOrdersService;
import com.zking.erp.util.JsonResponseBody;
import com.zking.erp.util.PageBean;
import com.zking.erp.util.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired
    private IOrdersService iOrdersService;

    @RequestMapping(value = "/toInsertOrders")
    public JsonResponseBody toInsertOrders(Orders orders) {
        int i = iOrdersService.insertOrders(orders);
        if (i > 0) {
            return new JsonResponseBody(ResponseStatus.STATUS_200);
        } else {
            return new JsonResponseBody(ResponseStatus.STATUS_201);
        }
    }

    @RequestMapping("/queryOrdersPurchasePager")
    public Map<String, Object> queryOrdersPurchasePager(HttpServletRequest req) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<Orders> rows = iOrdersService.queryOrdersAllPager(0, pageBean);
        Map<String, Object> map = new HashMap<>();
        map.put("pageBean", pageBean);
        map.put("row", rows);
        return map;
    }

    @RequestMapping("/queryOrdersSalePager")
    public Map<String, Object> queryOrdersSalePager(HttpServletRequest req) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<Orders> rows = iOrdersService.queryOrdersAllPager(1, pageBean);
        Map<String, Object> map = new HashMap<>();
        map.put("pageBean", pageBean);
        map.put("row", rows);
        return map;
    }

    @RequestMapping("/queryOrdersPager")
    public Map<String, Object> queryOrdersPager(HttpServletRequest req, String oState) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<Orders> rows = iOrdersService.queryOrdersPager(oState, pageBean);
        Map<String, Object> map = new HashMap<>();
        map.put("pageBean", pageBean);
        map.put("row", rows);
        return map;
    }

    @RequestMapping("/updateOrderState")
    public JsonResponseBody updateOrderState(Orders orders) {
        int i = iOrdersService.updateOrdersState(orders);
        if (i > 0) {
            return new JsonResponseBody(ResponseStatus.STATUS_200);
        } else {
            return new JsonResponseBody(ResponseStatus.STATUS_201);
        }
    }

}
