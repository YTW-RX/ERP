package com.zking.erp.services.authManage;

import com.zking.erp.util.JsonResponseBody;

public interface IErpRightService {

    /**
     * 获取树形菜单
     * @return
     */
    JsonResponseBody getMenu();
}
