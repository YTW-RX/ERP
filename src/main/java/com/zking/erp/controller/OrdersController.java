package com.zking.erp.controller;

import com.zking.erp.model.Orders;
import com.zking.erp.services.orders.IOrdersService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired
    private IOrdersService iOrdersService;

    @RequestMapping(value = "/toInsertOrders")
    public String toInsertOrders(Orders orders) {
        iOrdersService.insertOrders(orders);
        if (orders.getpurchaseSale() == 0) {
            return "redirect:queryOrdersPurchasePager";
        } else {
            return "redirect:queryOrdersSalePager";
        }
    }

    @RequestMapping("/queryOrdersPurchasePager")
    @ResponseBody
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
    @ResponseBody
    public Map<String, Object> queryOrdersSalePager(HttpServletRequest req) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<Orders> rows = iOrdersService.queryOrdersAllPager(1, pageBean);
        Map<String, Object> map = new HashMap<>();
        map.put("pageBean", pageBean);
        map.put("row", rows);
        return map;
    }

    @RequestMapping("/updateOrderState")
    public String updateOrderState(Orders orders) {
        iOrdersService.updateOrdersState(orders);
        if (orders.getpurchaseSale() == 0) {
            return "redirect:queryOrdersPurchasePager";
        } else {
            return "redirect:queryOrdersSalePager";
        }
    }

}
