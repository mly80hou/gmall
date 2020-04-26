package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WmsWareSkuEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品库存
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:58:29
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageVo queryPage(QueryCondition params);
}

