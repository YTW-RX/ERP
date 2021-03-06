package com.zking.erp.mapper;

import com.zking.erp.model.Emp;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}