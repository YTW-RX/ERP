package com.zking.erp.services.StoreDetail.impl;

import com.zking.erp.mapper.StoreDetailMapper;
import com.zking.erp.model.StoreDetail;
import com.zking.erp.services.StoreDetail.IStoreDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreDetailServiceImpl implements IStoreDetailService {

    @Autowired
    private StoreDetailMapper storeDetailMapper;

    @Override
    public int updateStoredetailNum(StoreDetail storeDetail) {
        return storeDetailMapper.updateStoredetailNum(storeDetail);
    }

}
