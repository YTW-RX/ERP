package com.zking.erp.mapper;

import com.zking.erp.model.ErpRoleRight;

public interface ErpRoleRightMapper {
    int deleteByPrimaryKey(Long rfid);

    int insert(ErpRoleRight record);

    int insertSelective(ErpRoleRight record);

    ErpRoleRight selectByPrimaryKey(Long rfid);

    int updateByPrimaryKeySelective(ErpRoleRight record);

    int updateByPrimaryKey(ErpRoleRight record);
}