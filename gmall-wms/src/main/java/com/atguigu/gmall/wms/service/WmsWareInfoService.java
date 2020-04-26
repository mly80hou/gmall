package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WmsWareInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 仓库信息
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:58:30
 */
public interface WmsWareInfoService extends IService<WmsWareInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

