package com.atguigu.gmall.oms.service;

import com.atguigu.gmall.oms.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 退货原因
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 12:21:11
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageVo queryPage(QueryCondition params);
}

