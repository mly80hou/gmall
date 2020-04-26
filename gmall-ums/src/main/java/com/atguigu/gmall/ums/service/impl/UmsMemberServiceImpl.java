package com.atguigu.gmall.ums.service.impl;

import com.atguigu.gmall.ums.dao.UmsMemberDao;
import com.atguigu.gmall.ums.entity.UmsMemberEntity;
import com.atguigu.gmall.ums.service.UmsMemberService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;



@Service("umsMemberService")
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberDao, UmsMemberEntity> implements UmsMemberService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<UmsMemberEntity> page = this.page(
                new Query<UmsMemberEntity>().getPage(params),
                new QueryWrapper<UmsMemberEntity>()
        );

        return new PageVo(page);
    }

}