package com.zking.erp.controller;

import com.zking.erp.model.StoreDetail;
import com.zking.erp.services.StoreDetail.IStoreDetailService;
import com.zking.erp.services.baseManage.IStoreService;
import com.zking.erp.util.JsonResponseBody;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/storeDetail")
public class StoreDetailController {
    @Autowired
    private IStoreDetailService storeDetailService;

    @RequestMapping("/getStoredetailByStoreIdAndGid")
    @ResponseBody
    public JsonResponseBody getStoredetailByStoreIdAndGid(Integer storeId, Integer gId, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        JsonResponseBody<List<StoreDetail>> json = storeDetailService.getStoredetailByStoreIdAndGid(storeId, gId,pageBean);
        json.setTotal(json.getData().size());
        return json;
    }
}
