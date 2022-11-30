package com.test.demo.controller;

import com.test.demo.model.vo.ChildrenVo;
import com.test.demo.model.dto.ChildrenDto;
import com.test.demo.model.mapper.ChildrenModelMapper;
import com.test.demo.service.ChildrenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Children)表控制层
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Api(tags = "(Children)")
@Tag(name="children",description = "children")
@Validated
@RestController
@RequestMapping("children")
public class ChildrenController {
    /**
     * 服务对象
     */
    @Resource
    private ChildrenService childrenService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ApiOperation(value="选择查询")
    public ChildrenVo selectOne(Long id) {
        ChildrenDto childrenDto = childrenService.queryById(id);
        return ChildrenModelMapper.INSTANCE.changeDTO2VO(childrenDto);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne1")
    public ChildrenVo selectOne1(Long id) {
        ChildrenDto childrenDto = childrenService.queryById(id);
        return ChildrenModelMapper.INSTANCE.changeDTO2VO(childrenDto);
    }

}
