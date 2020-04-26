package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.UmsMemberLevelEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员等级
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevelEntity> {

    PageVo queryPage(QueryCondition params);
}

