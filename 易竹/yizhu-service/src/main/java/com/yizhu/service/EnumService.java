package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.Enum;

import java.util.List;

/**
 * 枚举信息表-枚举键 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface EnumService extends IService<Enum> {

    /**
     * 根据枚举tableName查询枚举
     * @param tableName
     * @return
     */
    List<Enum> queryEnumByTableName(String tableName);
}