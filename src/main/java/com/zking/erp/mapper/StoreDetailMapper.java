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

    // 增加库存（入库后的操作）
    int updateStoredetailNum(StoreDetail storeDetail);
    //Goods Store 多变联查
    List<StoreDetail> getStoredetailByStoreIdAndGid(@Param("storeId") Integer storeId,@Param("gId") Integer gId);
}