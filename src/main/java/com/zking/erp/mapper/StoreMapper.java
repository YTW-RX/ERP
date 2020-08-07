package com.zking.erp.mapper;

import com.zking.erp.model.Store;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreMapper {
    int deleteByPrimaryKey(Integer storeid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer storeid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);

    /**
     * 查询所有的仓库
     * @return
     */
    List<Store> getAllStores();
}