package com.zking.erp.services.baseManage.impl;

import com.zking.erp.mapper.StoreMapper;
import com.zking.erp.model.Store;
import com.zking.erp.services.baseManage.IStoreService;
import com.zking.erp.util.JsonResponseBody;
import com.zking.erp.util.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements IStoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public JsonResponseBody getAllStore() {
        List<Store> allStores = storeMapper.getAllStores();
        if(null==allStores)
            return new JsonResponseBody(ResponseStatus.STATUS_201);
        return new JsonResponseBody(ResponseStatus.STATUS_200,allStores);
    }
}
