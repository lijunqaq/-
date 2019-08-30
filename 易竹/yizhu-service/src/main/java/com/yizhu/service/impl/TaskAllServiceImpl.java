package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.TaskAllDAO;
import com.ybs.phl.model.entity.TaskAll;
import com.yizhu.service.TaskAllService;
import org.springframework.stereotype.Service;

/**
 * 任务表---所有用户类型 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class TaskAllServiceImpl extends ServiceImpl<TaskAllDAO,TaskAll> implements TaskAllService {

}