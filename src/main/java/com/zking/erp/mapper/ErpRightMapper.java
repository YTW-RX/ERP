package com.zking.erp.mapper;

import com.zking.erp.model.ErpRight;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErpRightMapper {
    int deleteByPrimaryKey(String rcode);

    int insert(ErpRight record);

    int insertSelective(ErpRight record);

    ErpRight selectByPrimaryKey(String rcode);

    int updateByPrimaryKeySelective(ErpRight record);

    int updateByPrimaryKey(ErpRight record);

    /**
     * 获取所有的一级菜单
     * @return
     */
    List<ErpRight> getAllParentNodes();

    /**
     * 获取对应的二级菜单
     * @return
     */
    List<ErpRight> getChildrenNodes(ErpRight erpRight);
}