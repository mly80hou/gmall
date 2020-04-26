package com.atguigu.gmall.ums.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.ums.entity.UmsMemberLoginLogEntity;
import com.atguigu.gmall.ums.service.UmsMemberLoginLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;





/**
 * 会员登录记录
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
@Api(tags = "会员登录记录 管理")
@RestController
@RequestMapping("sms/umsmemberloginlog")
public class UmsMemberLoginLogController {
    @Autowired
    private UmsMemberLoginLogService umsMemberLoginLogService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:umsmemberloginlog:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = umsMemberLoginLogService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:umsmemberloginlog:info')")
    public Resp<UmsMemberLoginLogEntity> info(@PathVariable("id") Long id){
		UmsMemberLoginLogEntity umsMemberLoginLog = umsMemberLoginLogService.getById(id);

        return Resp.ok(umsMemberLoginLog);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:umsmemberloginlog:save')")
    public Resp<Object> save(@RequestBody UmsMemberLoginLogEntity umsMemberLoginLog){
		umsMemberLoginLogService.save(umsMemberLoginLog);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:umsmemberloginlog:update')")
    public Resp<Object> update(@RequestBody UmsMemberLoginLogEntity umsMemberLoginLog){
		umsMemberLoginLogService.updateById(umsMemberLoginLog);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:umsmemberloginlog:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		umsMemberLoginLogService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
