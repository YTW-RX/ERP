package com.zking.erp.services.PersonnelManage;

import com.zking.erp.model.Dep;

import java.util.List;


public interface lDepService {
    int deleteByPrimaryKey(Integer depid);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Integer depid);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);

    List<Dep> selectByDepList();
}