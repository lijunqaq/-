package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.DrugsDAO;
import com.ybs.phl.model.entity.Drugs;
import com.yizhu.service.DrugsService;
import org.springframework.stereotype.Service;

/**
 * 常用药品信息表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class DrugsServiceImpl extends ServiceImpl<DrugsDAO,Drugs> implements DrugsService {

}