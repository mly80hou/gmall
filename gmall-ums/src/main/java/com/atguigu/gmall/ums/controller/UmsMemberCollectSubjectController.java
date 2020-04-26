package com.atguigu.gmall.ums.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.ums.entity.UmsMemberCollectSubjectEntity;
import com.atguigu.gmall.ums.service.UmsMemberCollectSubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;





/**
 * 会员收藏的专题活动
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
@Api(tags = "会员收藏的专题活动 管理")
@RestController
@RequestMapping("sms/umsmembercollectsubject")
public class UmsMemberCollectSubjectController {
    @Autowired
    private UmsMemberCollectSubjectService umsMemberCollectSubjectService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:umsmembercollectsubject:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = umsMemberCollectSubjectService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:umsmembercollectsubject:info')")
    public Resp<UmsMemberCollectSubjectEntity> info(@PathVariable("id") Long id){
		UmsMemberCollectSubjectEntity umsMemberCollectSubject = umsMemberCollectSubjectService.getById(id);

        return Resp.ok(umsMemberCollectSubject);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:umsmembercollectsubject:save')")
    public Resp<Object> save(@RequestBody UmsMemberCollectSubjectEntity umsMemberCollectSubject){
		umsMemberCollectSubjectService.save(umsMemberCollectSubject);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:umsmembercollectsubject:update')")
    public Resp<Object> update(@RequestBody UmsMemberCollectSubjectEntity umsMemberCollectSubject){
		umsMemberCollectSubjectService.updateById(umsMemberCollectSubject);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:umsmembercollectsubject:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		umsMemberCollectSubjectService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
