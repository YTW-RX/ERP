package com.zking.erp.services.StoreDetail.impl;

import com.zking.erp.model.StoreDetail;
import com.zking.erp.services.StoreDetail.IStoreDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class StoreDetailServiceImplTest {

    @Autowired
    private IStoreDetailService iStoreDetailService;

    @Test
    public void updateStoredetailNum() {
        StoreDetail storeDetail = new StoreDetail();
        storeDetail.setGid(1);
        storeDetail.setSnum(10);
        iStoreDetailService.addStoredetailNum(storeDetail);
    }
}