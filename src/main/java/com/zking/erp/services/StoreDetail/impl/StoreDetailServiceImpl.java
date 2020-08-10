package com.zking.erp.services.StoreDetail.impl;

import com.zking.erp.mapper.StoreDetailMapper;
import com.zking.erp.model.StoreDetail;
import com.zking.erp.services.StoreDetail.IStoreDetailService;
import com.zking.erp.util.JsonResponseBody;
import com.zking.erp.util.PageBean;
import com.zking.erp.util.ResponseStatus;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreDetailServiceImpl implements IStoreDetailService {

    @Autowired
    private StoreDetailMapper storeDetailMapper;

    @Override
    public int addStoredetailNum(StoreDetail storeDetail) {
        return storeDetailMapper.addStoredetailNum(storeDetail);
    }

    @Override
    public int cutStoredetailNum(StoreDetail storeDetail) {
        return storeDetailMapper.cutStoredetailNum(storeDetail);
    }

    @Override
    public JsonResponseBody<List<StoreDetail>> getStoredetailByStoreIdAndGid(Integer storeId, Integer gId, PageBean pageBean) {
        List<StoreDetail> storedetailByStoreIdAndGid = storeDetailMapper.getStoredetailByStoreIdAndGid(storeId, gId);
        if(null==storedetailByStoreIdAndGid)
            return new JsonResponseBody<List<StoreDetail>>(ResponseStatus.STATUS_201);
        return new JsonResponseBody<List<StoreDetail>>(ResponseStatus.STATUS_200,storedetailByStoreIdAndGid);
    }


}
