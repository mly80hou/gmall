package com.atguigu.gmall.ums.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.ums.entity.UmsMemberEntity;
import com.atguigu.gmall.ums.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;





/**
 * 会员
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
@Api(tags = "会员 管理")
@RestController
@RequestMapping("sms/umsmember")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:umsmember:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = umsMemberService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:umsmember:info')")
    public Resp<UmsMemberEntity> info(@PathVariable("id") Long id){
		UmsMemberEntity umsMember = umsMemberService.getById(id);

        return Resp.ok(umsMember);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:umsmember:save')")
    public Resp<Object> save(@RequestBody UmsMemberEntity umsMember){
		umsMemberService.save(umsMember);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:umsmember:update')")
    public Resp<Object> update(@RequestBody UmsMemberEntity umsMember){
		umsMemberService.updateById(umsMember);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:umsmember:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		umsMemberService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
