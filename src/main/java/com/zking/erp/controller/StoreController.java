package com.zking.erp.controller;

import com.zking.erp.services.baseManage.IStoreService;
import com.zking.erp.util.JsonResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private IStoreService storeService;

    @ResponseBody
    @RequestMapping("/getAllStore")
    public JsonResponseBody getAllStore(){
        return storeService.getAllStore();
    }
}
