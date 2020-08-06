package com.zking.erp.services.authManage.impl;

import com.zking.erp.mapper.ErpRightMapper;
import com.zking.erp.model.ErpRight;
import com.zking.erp.services.authManage.IErpRightService;
import com.zking.erp.util.JsonResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpRightServiceImpl implements IErpRightService {

    @Autowired
    private ErpRightMapper erpRightMapper;

    @Override
    public JsonResponseBody getMenu() {
        List<ErpRight> allNodes = erpRightMapper.getAllParentNodes();
        allNodes.forEach(parentNode->{
            List<ErpRight> childrenNodes = erpRightMapper.getChildrenNodes(parentNode);
            parentNode.setChildrenNodes(childrenNodes);
        });
        return new JsonResponseBody(allNodes);
    }
}
