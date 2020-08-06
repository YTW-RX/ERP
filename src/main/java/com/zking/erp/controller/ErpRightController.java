package com.zking.erp.controller;

import com.zking.erp.services.authManage.IErpRightService;
import com.zking.erp.util.JsonResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/empRight")
public class ErpRightController {

    @Autowired
    private IErpRightService erpRightService;

    @RequestMapping("/getNodes")
    @ResponseBody
    public JsonResponseBody getNodes(){
        return erpRightService.getMenu();
    }
}
