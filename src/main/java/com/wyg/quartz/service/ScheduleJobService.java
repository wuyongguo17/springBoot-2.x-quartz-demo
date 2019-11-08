/*
 * 项目名称:gdjs-plus
 * 类名称:ScheduleJobService.java
 * 包名称:com.gdjs.modules.job.service
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.wyg.quartz.service;


import com.wyg.entity.ScheduleJobEntity;

/**
 * 定时任务
 *
 * @author GDJS
 */
public interface ScheduleJobService {

    /**
     * 获取分页数据
     *
     * @param params 查询参数
     * @return Page
     */
//    Page queryPage(Map<String, Object> params);

    /**
     * 新增定时任务
     *
     * @param scheduleJob scheduleJob
     */
    void add(ScheduleJobEntity scheduleJob);

    /**
     * 更新定时任务
     *
     * @param scheduleJob scheduleJob
     */
    void update(ScheduleJobEntity scheduleJob);

    /**
     * 批量删除定时任务
     *
     * @param jobIds jobIds
     */
    void deleteBatch(String[] jobIds);

    /**
     * 批量更新定时任务状态
     *
     * @param jobIds jobIds
     * @param status status
     */
    void updateBatch(String[] jobIds, int status);

    /**
     * 立即执行
     *
     * @param jobIds jobIds
     */
    void run(String[] jobIds);

    /**
     * 暂停运行
     *
     * @param jobIds jobIds
     */
    void pause(String[] jobIds);

    /**
     * 恢复运行
     *
     * @param jobIds jobIds
     */
    void resume(String[] jobIds);
}
