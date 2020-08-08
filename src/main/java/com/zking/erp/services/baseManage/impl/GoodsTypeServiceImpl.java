package com.zking.erp.services.baseManage.impl;

import com.zking.erp.mapper.GoodsTypeMapper;
import com.zking.erp.model.GoodsType;
import com.zking.erp.services.baseManage.IGoodsTypeService;
import com.zking.erp.util.JsonResponseBody;
import com.zking.erp.util.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    /**
     * 查询所以的商品类型
     * @return
     */
    @Override
    public JsonResponseBody<List<GoodsType>> getAllGoodsType() {
        List<GoodsType> goodsTypes = goodsTypeMapper.getGoodsTypes();
        if(null==goodsTypes)
            new JsonResponseBody<>(ResponseStatus.STATUS_201);
        return new JsonResponseBody(ResponseStatus.STATUS_200,goodsTypes);
    }
}
