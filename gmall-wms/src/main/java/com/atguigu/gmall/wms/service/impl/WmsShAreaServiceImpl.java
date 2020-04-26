package com.atguigu.gmall.wms.service.impl;

import com.atguigu.gmall.wms.dao.WmsShAreaDao;
import com.atguigu.gmall.wms.entity.WmsShAreaEntity;
import com.atguigu.gmall.wms.service.WmsShAreaService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;



@Service("wmsShAreaService")
public class WmsShAreaServiceImpl extends ServiceImpl<WmsShAreaDao, WmsShAreaEntity> implements WmsShAreaService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<WmsShAreaEntity> page = this.page(
                new Query<WmsShAreaEntity>().getPage(params),
                new QueryWrapper<WmsShAreaEntity>()
        );

        return new PageVo(page);
    }

}