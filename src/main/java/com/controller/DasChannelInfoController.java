package com.controller;

import com.entity.DasChannelInfo;
import com.service.DasChannelInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DasChannelInfo)表控制层
 *
 * @author makejava
 * @since 2021-02-01 19:53:03
 */
@RestController
@RequestMapping("dasChannelInfo")
public class DasChannelInfoController {
    /**
     * 服务对象
     */
    @Resource
    private DasChannelInfoService dasChannelInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DasChannelInfo selectOne(String id) {
        return this.dasChannelInfoService.queryById(id);
    }

}