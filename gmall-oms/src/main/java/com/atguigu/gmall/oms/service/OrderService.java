package com.atguigu.gmall.oms.service;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 12:21:12
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

