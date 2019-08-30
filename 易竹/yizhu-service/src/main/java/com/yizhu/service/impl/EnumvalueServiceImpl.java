package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.EnumvalueDAO;
import com.ybs.phl.model.biz.dto.EnumvalueDTO;
import com.ybs.phl.model.entity.Enumvalue;
import com.yizhu.service.EnumvalueService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 枚举信息表-枚举值 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class EnumvalueServiceImpl extends ServiceImpl<EnumvalueDAO,Enumvalue> implements EnumvalueService {

    @Override
    public List<Enumvalue> queryEnumVauleByEnumId(Long enumId) {

        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("enumid", enumId);

        return list(criteria);
    }

    @Override
    public List<EnumvalueDTO> getEnumValueById(Integer enumId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("enumid", enumId);
        criteria.eq("state", ValidEnum.VALID.getValue());
        criteria.orderByDesc("display_order");
        return list(criteria);
    }
}