package com.zking.erp.services.StoreDetail;

import com.zking.erp.model.StoreDetail;

public interface IStoreDetailService {

    /**
     * 增加库存（入库后的操作）
     *
     * @param storeDetail
     * @return
     */
    int addStoredetailNum(StoreDetail storeDetail);

    /**
     * 减少库存（出库后的操作）
     *
     * @param storeDetail
     * @return
     */
    int cutStoredetailNum(StoreDetail storeDetail);

}
