package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.SysRolePermissionDAO;
import com.ybs.phl.model.entity.SysRolePermission;
import com.yizhu.service.SysRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * 角色-权限关系表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionDAO,SysRolePermission> implements SysRolePermissionService {

}