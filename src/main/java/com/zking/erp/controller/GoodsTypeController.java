package com.zking.erp.controller;

import com.zking.erp.model.GoodsType;
import com.zking.erp.services.baseManage.IGoodsTypeService;
import com.zking.erp.util.JsonResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goodstype")
public class GoodsTypeController {

    @Autowired
    private IGoodsTypeService goodsTypeService;

    /**
     * 获取所有商品类型
     * @return
     */
    @RequestMapping("/getAllGoodsType")
    @ResponseBody
    public JsonResponseBody<List<GoodsType>> getAllGoodsType(){
       return  goodsTypeService.getAllGoodsType();
    }
}
