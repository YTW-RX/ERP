package com.zking.erp.mapper;

import com.zking.erp.model.StoreDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDetailMapper {
    int deleteByPrimaryKey(Integer storedetailid);

    int insert(StoreDetail record);

    int insertSelective(StoreDetail record);

    StoreDetail selectByPrimaryKey(Integer storedetailid);

    int updateByPrimaryKeySelective(StoreDetail record);

    int updateByPrimaryKey(StoreDetail record);

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