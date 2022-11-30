package com.test.demo.dao;

import com.test.demo.model.po.UserPo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPo>{

    List<UserPo> selectUserByCondition(UserPo po);

    List<UserPo> selectUserByCondition(String age);
}
