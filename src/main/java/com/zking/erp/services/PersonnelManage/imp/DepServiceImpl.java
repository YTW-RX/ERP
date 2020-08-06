package com.zking.erp.services.PersonnelManage.imp;

import com.zking.erp.mapper.DepMapper;
import com.zking.erp.model.Dep;
import com.zking.erp.services.PersonnelManage.lDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/*业务逻辑层*/
@Service
public class DepServiceImpl implements lDepService {
    @Autowired
    private DepMapper depMapper;

    @Override
    public int deleteByPrimaryKey(Integer depid) {
        return 0;
    }

    @Override
    public int insert(Dep record) {
        return 0;
    }

    @Override
    public int insertSelective(Dep record) {
        return 0;
    }

    @Override
    public Dep selectByPrimaryKey(Integer depid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Dep record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Dep record) {
        return 0;
    }

    @Override
    public List<Dep> selectByDepList() {
        return depMapper.selectByDepList();
    }
}
