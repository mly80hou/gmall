package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品属性
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-18 11:04:04
 */
public interface AttrService extends IService<AttrEntity> {

    PageVo queryPage(QueryCondition params);
}

