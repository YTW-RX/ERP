package com.zking.erp.services.baseManage.impl;

import com.zking.erp.mapper.GoodsMapper;
import com.zking.erp.model.Goods;
import com.zking.erp.services.baseManage.IGoodsServices;
import com.zking.erp.util.JsonResponseBody;
import com.zking.erp.util.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServicesImpl implements IGoodsServices {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public JsonResponseBody<List<Goods>> getAllGoods() {
        List<Goods> allGoods = goodsMapper.getAllGoods();
        if(null==goodsMapper)
            return new JsonResponseBody<List<Goods>>(ResponseStatus.STATUS_201);
        return new JsonResponseBody<List<Goods>>(ResponseStatus.STATUS_200,allGoods);
    }
}
