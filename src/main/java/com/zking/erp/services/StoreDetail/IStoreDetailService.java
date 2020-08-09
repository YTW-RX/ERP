package com.zking.erp.services.StoreDetail;

import com.zking.erp.model.StoreDetail;
import com.zking.erp.util.JsonResponseBody;
import com.zking.erp.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStoreDetailService {

    // 增加库存（入库后的操作）
    int updateStoredetailNum(StoreDetail storeDetail);

    //Goods Store多表查询
    JsonResponseBody<List<StoreDetail>> getStoredetailByStoreIdAndGid(Integer storeId, Integer gId, PageBean pageBean);

}
