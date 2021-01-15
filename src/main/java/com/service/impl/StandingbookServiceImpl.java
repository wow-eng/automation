package com.service.impl;

import com.entity.Standingbook;
import com.dao.StandingbookDao;
import com.github.pagehelper.PageHelper;
import com.service.StandingbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Standingbook)表服务实现类
 *
 * @author makejava
 * @since 2020-12-01 16:41:33
 */
@Service("standingbookService")
public class StandingbookServiceImpl implements StandingbookService {
    @Resource
    private StandingbookDao standingbookDao;

    /**
     * 通过ID查询单条数据
     *
     * @param terminalId 主键
     * @return 实例对象
     */
    @Override
    public Standingbook queryById(String terminalId) {
        return this.standingbookDao.queryById(terminalId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Standingbook> queryAllByLimit(int offset, int limit) {
        return this.standingbookDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param standingbook 实例对象
     * @return 实例对象
     */
    @Override
    public Standingbook insert(Standingbook standingbook) {
        this.standingbookDao.insert(standingbook);
        return standingbook;
    }

    /**
     * 修改数据
     *
     * @param standingbook 实例对象
     * @return 实例对象
     */
    @Override
    public Standingbook update(Standingbook standingbook) {
        this.standingbookDao.update(standingbook);
        return this.queryById(standingbook.getTerminalId());
    }

    /**
     * 通过主键删除数据
     *
     * @param terminalId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String terminalId) {
        return this.standingbookDao.deleteById(terminalId) > 0;
    }

    @Override
    public int queryAllNum(Standingbook standingbook) {
        return this.standingbookDao.queryAllNum(standingbook);
    }



    @Override
    public List<Standingbook> queryAll(Standingbook standingbook,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return this.standingbookDao.queryAll(standingbook);
    }
}