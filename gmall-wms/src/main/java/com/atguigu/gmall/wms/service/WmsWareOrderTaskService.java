package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WmsWareOrderTaskEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:58:30
 */
public interface WmsWareOrderTaskService extends IService<WmsWareOrderTaskEntity> {

    PageVo queryPage(QueryCondition params);
}

