package com.yizhu.lj.dao.mapper;


import com.example.lj.dao.entity.Module;
import com.yizhu.lj.dao.entity.Module;

import java.util.List;

public interface ModuleMapper {
    int deleteByPrimaryKey(String moduleID);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(String moduleID);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);

    List<Module> findAll();
}