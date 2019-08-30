package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.SchoolDAO;
import com.ybs.phl.model.entity.School;
import com.yizhu.service.SchoolService;
import org.springframework.stereotype.Service;

/**
 * 学校信息 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolDAO,School> implements SchoolService {

}