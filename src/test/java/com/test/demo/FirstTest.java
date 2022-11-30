package com.test.demo;

import com.test.demo.model.dto.ChildrenDto;
import com.test.demo.model.dto.UserDto;
import com.test.demo.model.mapper.ChildrenModelMapper;
import com.test.demo.model.mapper.UserModelMapper;
import com.test.demo.model.vo.ChildrenVo;
import com.test.demo.model.vo.UserVo;
import com.test.demo.service.ChildrenService;
import com.test.demo.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class FirstTest {
    @Resource
    private UserService userService;

    @Value("String")
    private String value;
    @Test
    public void test() {
        int a=1;
        Assertions.assertEquals(1,a);
    }
    @Test
    public void selectOne() {
        System.out.println(value);
        long id= 1584749447070511105L;
        UserDto userDto = userService.queryById(id);
        UserVo vo= UserModelMapper.INSTANCE.changeDTO2VO(userDto);
        System.out.println(vo);
    }
}

