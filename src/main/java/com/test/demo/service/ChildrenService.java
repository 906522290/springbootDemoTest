package com.test.demo.service;

import com.test.demo.model.dto.ChildrenDto;
import java.util.List;

/**
 * (Children)表服务接口
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
public interface ChildrenService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ChildrenDto queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ChildrenDto> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param childrenDto 实例对象
     * @return 实例对象
     */
    ChildrenDto insert(ChildrenDto childrenDto);

    /**
     * 修改数据
     *
     * @param childrenDto 实例对象
     * @return 实例对象
     */
    ChildrenDto update(ChildrenDto childrenDto);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
