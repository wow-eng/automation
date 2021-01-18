package com.service.impl;

import com.entity.DasTerminal;
import com.dao.DasTerminalDao;
import com.github.pagehelper.PageHelper;
import com.service.DasTerminalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (DasTerminal)表服务实现类
 *
 * @author makejava
 * @since 2020-11-27 17:22:09
 */
@Service("dasTerminalService")
public class DasTerminalServiceImpl implements DasTerminalService {
    @Resource
    private DasTerminalDao dasTerminalDao;

    /**
     * 通过ID查询单条数据
     *
     * @param terminalId 主键
     * @return 实例对象
     */
    @Override
    public DasTerminal queryById(String terminalId) {
        return this.dasTerminalDao.queryById(terminalId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DasTerminal> queryAllByLimit(int offset, int limit) {
        return this.dasTerminalDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dasTerminal 实例对象
     * @return 实例对象
     */
    @Override
    public DasTerminal insert(DasTerminal dasTerminal) {
        this.dasTerminalDao.insert(dasTerminal);
        return dasTerminal;
    }

    /**
     * 修改数据
     *
     * @param dasTerminal 实例对象
     * @return 实例对象
     */
    @Override
    public DasTerminal update(DasTerminal dasTerminal) {
        this.dasTerminalDao.update(dasTerminal);
        return this.queryById(dasTerminal.getTerminalId());
    }

    /**
     * 通过主键删除数据
     *
     * @param terminalId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String terminalId) {
        return this.dasTerminalDao.deleteById(terminalId) > 0;
    }

    @Override
    public int queryAllNum(DasTerminal dasTerminal) {
        return this.dasTerminalDao.queryAllNum(dasTerminal);
    }

    @Override
    public List<DasTerminal> queryAll(DasTerminal dasTerminal,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return this.dasTerminalDao.queryAll(dasTerminal);
    }

    @Override
    public List<Map> countStatistics() {
        return dasTerminalDao.countStatistics();
    }

}