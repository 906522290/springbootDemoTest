package com.test.demo.dao;

import com.test.demo.model.po.ChildrenPo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Children)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Mapper
public interface ChildrenMapper extends BaseMapper<ChildrenPo>{
}
