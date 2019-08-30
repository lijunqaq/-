package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.PwcPwScdupDAO;
import com.ybs.phl.model.entity.PwcPwScdup;
import com.yizhu.service.PwcPwScdupService;
import org.springframework.stereotype.Service;

/**
 * 孕期特殊情况表（对于一份孕妇档案可以有多次） Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class PwcPwScdupServiceImpl extends ServiceImpl<PwcPwScdupDAO,PwcPwScdup> implements PwcPwScdupService {

}