package com.zking.erp.mapper;

import com.zking.erp.model.GoodsType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer gtid);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer gtid);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);

    /**
     * 获取所有的商品类型
     * @return
     */
    List<GoodsType> getGoodsTypes();
}