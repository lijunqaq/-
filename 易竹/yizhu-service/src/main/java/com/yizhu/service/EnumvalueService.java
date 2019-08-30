package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.biz.dto.EnumvalueDTO;
import com.ybs.phl.model.entity.Enumvalue;

import java.util.List;

/**
 * 枚举信息表-枚举值 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface EnumvalueService extends IService<Enumvalue> {

    /**
     * 根据枚举主键id查询枚举值列表
     * @param enumId        枚举主键id
     * @return
     */
    List<Enumvalue> queryEnumVauleByEnumId(Long enumId);
    /**
     * 获取健康处方相关枚举
     * @return
     */
    List<EnumvalueDTO> getEnumValueById(Integer enumId);
}