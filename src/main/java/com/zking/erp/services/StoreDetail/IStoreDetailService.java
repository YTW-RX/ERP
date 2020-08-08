package com.zking.erp.services.StoreDetail;

import com.zking.erp.model.StoreDetail;

public interface IStoreDetailService {

    // 增加库存（入库后的操作）
    int updateStoredetailNum(StoreDetail storeDetail);

}
