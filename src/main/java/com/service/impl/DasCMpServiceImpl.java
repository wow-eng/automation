package com.service.impl;

import com.dao.DasCMpDao;
import com.entity.DasCMp;
import com.service.DasCMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DasCMpServiceImpl implements DasCMpService {

    @Autowired
    DasCMpDao dasCMpDao;

    @Override
    public List<DasCMp> queryAll(String mpId) {
        return dasCMpDao.queryAll(mpId);
    }
}
