package com.service;

import com.entity.DasChannelInfo;
import java.util.List;

/**
 * (DasChannelInfo)表服务接口
 *
 * @author makejava
 * @since 2021-02-01 19:53:02
 */
public interface DasChannelInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param terminalId 主键
     * @return 实例对象
     */
    DasChannelInfo queryById(String terminalId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DasChannelInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dasChannelInfo 实例对象
     * @return 实例对象
     */
    DasChannelInfo insert(DasChannelInfo dasChannelInfo);

    /**
     * 修改数据
     *
     * @param dasChannelInfo 实例对象
     * @return 实例对象
     */
    DasChannelInfo update(DasChannelInfo dasChannelInfo);

    /**
     * 通过主键删除数据
     *
     * @param terminalId 主键
     * @return 是否成功
     */
    boolean deleteById(String terminalId);

}