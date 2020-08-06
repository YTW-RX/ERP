package com.zking.erp.controller;

import com.zking.erp.model.Orders;
import com.zking.erp.services.orders.IOrdersService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired
    private IOrdersService iOrdersService;

    @RequestMapping(value = "/toInsertOrders")
    @ResponseBody
    public String toInsertOrders(Orders orders) {
        iOrdersService.insertOrders(orders);
        return "redirect:queryOrdersAllPager";
    }

    @RequestMapping("/queryOrdersAllPager")
    @ResponseBody
    public Map<String, Object> queryOrdersAllPager(HttpServletRequest req) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<Orders> rows = iOrdersService.queryOrdersAllPager(pageBean);
        Map<String, Object> map = new HashMap<>();
        map.put("pageBean", pageBean);
        map.put("row", rows);
        return map;
    }

    @RequestMapping("/updateOrderState")
    @ResponseBody
    public String updateOrderState(Orders orders) {
        iOrdersService.updateOrdersState(orders);
        return "redirect:queryOrdersAllPager";
    }

}
