package com.test.demo.service.impl;

import com.test.demo.model.po.ChildrenPo;
import com.test.demo.model.dto.ChildrenDto;
import com.test.demo.model.mapper.ChildrenModelMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.test.demo.dao.ChildrenMapper;
import com.test.demo.service.ChildrenService;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Children)表服务实现类
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Service("childrenService")
public class ChildrenServiceImpl implements ChildrenService {
    @Resource
    private ChildrenMapper childrenMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ChildrenDto queryById(Long id) {
        return ChildrenModelMapper.INSTANCE.changePO2DTO(this.childrenMapper.selectById(id));
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ChildrenDto> queryAllByLimit(int offset, int limit) {
        IPage<ChildrenPo> selectPage = new Page<>(offset,limit);
        IPage<ChildrenPo> page = this.childrenMapper.selectPage(selectPage, null);
        return ChildrenModelMapper.INSTANCE.childrenPOs2ChildrenDTOs(page.getRecords());
    }

    /**
     * 新增数据
     *
     * @param childrenDto 实例对象
     * @return 实例对象
     */
    @Override
    public ChildrenDto insert(ChildrenDto childrenDto) {
        this.childrenMapper.insert(ChildrenModelMapper.INSTANCE.changeDTO2PO(childrenDto));
        return childrenDto;
    }

    /**
     * 修改数据
     *
     * @param childrenDto 实例对象
     * @return 实例对象
     */
    @Override
    public ChildrenDto update(ChildrenDto childrenDto) {
        this.childrenMapper.updateById(ChildrenModelMapper.INSTANCE.changeDTO2PO(childrenDto));
        return this.queryById(childrenDto.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.childrenMapper.deleteById(id) > 0;
    }
}
