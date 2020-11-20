package com.controller;

import com.dao.DasCMpDao;
import com.entity.DasCMp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("dasCMp")
public class DasCMpController {

    @Resource
    private DasCMpDao dasCMpDao;

    @RequestMapping("selectAll")
    @ResponseBody
    public List<DasCMp> selectAll(String mpId){
        return dasCMpDao.queryAll(mpId);
    }
}
