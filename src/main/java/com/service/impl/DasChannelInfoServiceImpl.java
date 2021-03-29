package com.service.impl;

import com.entity.DasChannelInfo;
import com.dao.DasChannelInfoDao;
import com.github.pagehelper.PageHelper;
import com.service.DasChannelInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DasChannelInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-02-01 19:59:48
 */
@Service("dasChannelInfoService")
public class DasChannelInfoServiceImpl implements DasChannelInfoService {
    @Resource
    private DasChannelInfoDao dasChannelInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param terminalId 主键
     * @return 实例对象
     */
    @Override
    public DasChannelInfo queryById(String terminalId) {
        return this.dasChannelInfoDao.queryById(terminalId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DasChannelInfo> queryAllByLimit(int offset, int limit) {
        return this.dasChannelInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dasChannelInfo 实例对象
     * @return 实例对象
     */
    @Override
    public DasChannelInfo insert(DasChannelInfo dasChannelInfo) {
        this.dasChannelInfoDao.insert(dasChannelInfo);
        return dasChannelInfo;
    }

    /**
     * 修改数据
     *
     * @param dasChannelInfo 实例对象
     * @return 实例对象
     */
    @Override
    public DasChannelInfo update(DasChannelInfo dasChannelInfo) {
        this.dasChannelInfoDao.update(dasChannelInfo);
        return this.queryById(dasChannelInfo.getTerminalId());
    }

    /**
     * 通过主键删除数据
     *
     * @param terminalId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String terminalId) {
        return this.dasChannelInfoDao.deleteById(terminalId) > 0;
    }

    @Override
    public List<DasChannelInfo> queryAll(DasChannelInfo dasChannelInfo,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return this.dasChannelInfoDao.queryAll(dasChannelInfo);
    }

    @Override
    public int queryAllNum(DasChannelInfo dasChannelInfo) {
        return this.dasChannelInfoDao.queryAllNum(dasChannelInfo);
    }
}