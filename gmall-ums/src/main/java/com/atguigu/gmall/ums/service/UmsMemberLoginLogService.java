package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.UmsMemberLoginLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员登录记录
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
public interface UmsMemberLoginLogService extends IService<UmsMemberLoginLogEntity> {

    PageVo queryPage(QueryCondition params);
}

