package com.zking.erp.mapper;

import com.zking.erp.model.StoreDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /**
     * Goods Store 多变联查
     *
     * @param storeId
     * @param gId
     * @return
     */
    List<StoreDetail> getStoredetailByStoreIdAndGid(@Param("storeId") Integer storeId, @Param("gId") Integer gId);
}