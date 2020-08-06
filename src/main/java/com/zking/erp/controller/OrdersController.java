package com.zking.erp.controller;

import com.zking.erp.model.Orders;
import com.zking.erp.service.orders.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired
    private IOrdersService iOrdersService;

    @RequestMapping(value = "/toInsertOrders")
    @ResponseBody
    public String toInsertOrders(Orders orders) {
        iOrdersService.insertOrders(orders);
        return "redirect:index";
    }

}
