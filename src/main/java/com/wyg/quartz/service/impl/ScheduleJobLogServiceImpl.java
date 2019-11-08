/*
 * 项目名称:gdjs-plus
 * 类名称:ScheduleJobLogServiceImpl.java
 * 包名称:com.gdjs.modules.job.service.impl
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.wyg.quartz.service.impl;

import com.wyg.quartz.service.ScheduleJobLogService;
import org.springframework.stereotype.Service;

/**
 * @author GDJS
 */
@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl implements ScheduleJobLogService {

    /*@Override
    public Page queryPage(Map<String, Object> params) {
        //排序
        params.put("sidx", "T.CREATE_TIME");
        params.put("asc", false);
        Page<ScheduleJobLogEntity> page = new Query<ScheduleJobLogEntity>(params).getPage();
        return page.setRecords(baseMapper.selectScheduleJobLogPage(page, params));
    }*/

}
