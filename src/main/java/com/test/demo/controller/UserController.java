package com.test.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mysql.cj.xdevapi.JsonArray;
import com.test.demo.model.po.UserPo;
import com.test.demo.model.vo.UserVo;
import com.test.demo.model.dto.UserDto;
import com.test.demo.model.mapper.UserModelMapper;
import com.test.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Api(tags = "(User)") 
@Validated
@RestController
@RequestMapping("user")
public class UserController {

//    @Value("${person2}")
//    private String person2;

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private String age;
    @Value("${person.home}")
    private String home;
    @Value("${person.car}")
    private String car;
    @Value("${person3}")
    private String person3;
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据 mybatis自带的分页
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserVo selectOne(Long id,Integer age) {
        //sql判断输入字符串和正数
     List<UserPo> l = userService.selectUserByCondition1("4");
        UserDto dto = new UserDto();
        dto.setName("MS");
        userService.insert(dto);
     //分页查询
        IPage<UserPo> page =  userService.queryPage();
        UserPo po= new UserPo();
        po.setAge(4);
        List<UserPo> list = userService.selectUserByCondition(po);
        System.out.println(person3);
        JSONArray  array = JSONArray.parseArray(person3);
        System.out.println(array);
        UserDto userDto = userService.queryById(id);

        return UserModelMapper.INSTANCE.changeDTO2VO(userDto);
    }

    /**
     * pageHeler分页
     * @param id
     * @param age
     * @return
     */

    @GetMapping("selectTwo")
    public UserVo selectTwo(Long id,Integer age) {
        //sql判断输入字符串和正数
//        List<UserPo> l = userService.selectUserByCondition1("4");

        //分页查询
        List<UserPo> page =  userService.queryPageByPageHelper();
        UserPo po= new UserPo();
        po.setAge(4);
        List<UserPo> list = userService.selectUserByCondition(po);
        System.out.println(person3);
        JSONArray  array = JSONArray.parseArray(person3);
        System.out.println(array);
        UserDto userDto = userService.queryById(id);

        return UserModelMapper.INSTANCE.changeDTO2VO(userDto);
    }
}
