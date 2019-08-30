package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.EnumDAO;
import com.ybs.phl.model.biz.dto.EnumvalueDTO;
import com.ybs.phl.model.entity.Enum;
import com.yizhu.service.EnumService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 枚举信息表-枚举键 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class EnumServiceImpl extends ServiceImpl<EnumDAO,Enum> implements EnumService {

    @Override
    public List<Enum> queryEnumByTableName(String tableName) {

        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("tablename", tableName);

        return list(criteria);
    }


}