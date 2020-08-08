package com.zking.erp.services.baseManage;

import com.zking.erp.model.Goods;
import com.zking.erp.util.JsonResponseBody;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IGoodsServices {
    JsonResponseBody<List<Goods>> getAllGoods();
}
