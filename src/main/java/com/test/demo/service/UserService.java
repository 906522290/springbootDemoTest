package com.test.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.test.demo.model.dto.UserDto;
import com.test.demo.model.po.UserPo;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserDto queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserDto> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userDto 实例对象
     * @return 实例对象
     */
    UserDto insert(UserDto userDto);

    /**
     * 修改数据
     *
     * @param userDto 实例对象
     * @return 实例对象
     */
    UserDto update(UserDto userDto);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);


    List<UserPo> selectUserByCondition(UserPo po);
    List<UserPo> selectUserByCondition1(String age);

    IPage<UserPo> queryPage();

    List<UserPo>  queryPageByPageHelper();
}
