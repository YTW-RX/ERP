package com.zking.erp.controller;

import com.zking.erp.model.Goods;
import com.zking.erp.services.baseManage.IGoodsServices;
import com.zking.erp.util.JsonResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IGoodsServices goodsServices;

    @RequestMapping("getAllGoods")
    @ResponseBody
    public JsonResponseBody<List<Goods>> getAllGoods(){
        return goodsServices.getAllGoods();
    }
}
