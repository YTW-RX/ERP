package com.zking.erp.mapper;

import com.zking.erp.model.Dep;
import org.springframework.stereotype.Repository;

@Repository
public interface DepMapper {
    int deleteByPrimaryKey(Integer depid);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Integer depid);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);
}