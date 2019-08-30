package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.PwcPwFmDAO;
import com.ybs.phl.model.entity.PwcPwFm;
import com.yizhu.service.PwcPwFmService;
import org.springframework.stereotype.Service;

/**
 * 胎动记录表 (一天只能测试一次) Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class PwcPwFmServiceImpl extends ServiceImpl<PwcPwFmDAO,PwcPwFm> implements PwcPwFmService {

}