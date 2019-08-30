package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.SysDataSyncErrorRecordDAO;
import com.ybs.phl.model.entity.SysDataSyncErrorRecord;
import com.yizhu.service.SysDataSyncErrorRecordService;
import org.springframework.stereotype.Service;

/**
 * 公卫同步错误数据记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class SysDataSyncErrorRecordServiceImpl extends ServiceImpl<SysDataSyncErrorRecordDAO,SysDataSyncErrorRecord> implements SysDataSyncErrorRecordService {

}