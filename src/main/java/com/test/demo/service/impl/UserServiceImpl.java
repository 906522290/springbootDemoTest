package com.test.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.test.demo.model.po.UserPo;
import com.test.demo.model.dto.UserDto;
import com.test.demo.model.mapper.UserModelMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.test.demo.dao.UserMapper;
import com.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserDto queryById(Long id) {
        return UserModelMapper.INSTANCE.changePO2DTO(this.userMapper.selectById(id));
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserDto> queryAllByLimit(int offset, int limit) {
        IPage<UserPo> selectPage = new Page<>(offset,limit);
        IPage<UserPo> page = this.userMapper.selectPage(selectPage, null);
        return UserModelMapper.INSTANCE.userPOs2UserDTOs(page.getRecords());
    }

    /**
     * 新增数据
     *
     * @param userDto 实例对象
     * @return 实例对象
     */
    @Override
    public UserDto insert(UserDto userDto) {
        this.userMapper.insert(UserModelMapper.INSTANCE.changeDTO2PO(userDto));
        return userDto;
    }

    /**
     * 修改数据
     *
     * @param userDto 实例对象
     * @return 实例对象
     */
    @Override
    public UserDto update(UserDto userDto) {
        this.userMapper.updateById(UserModelMapper.INSTANCE.changeDTO2PO(userDto));
        return this.queryById(userDto.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userMapper.deleteById(id) > 0;
    }

    @Override
   public List<UserPo> selectUserByCondition(UserPo po){
       return this.userMapper.selectUserByCondition(po);
    }

    @Override
   public List<UserPo> selectUserByCondition1(String age){
        return this.userMapper.selectUserByCondition(age);
    }

    @Override
    public  IPage<UserPo> queryPage(){
        IPage<UserPo> page = new Page<>(1,2) ;

        Wrapper<UserPo> queryWrapper = new QueryWrapper<>();

        return this.userMapper.selectPage(page,queryWrapper);


//        IPage<UserPo> selectPage = new Page<>(offset,limit);
//        IPage<UserPo> page = this.userMapper.selectPage(selectPage, null);
    }

    @Override
    public   List<UserPo> queryPageByPageHelper(){
//        PageHelper.startPage(1,2);
//        List<UserPo> list =  this.userMapper.selectList(null);
//        PageInfo<UserPo> userInfoPage = new PageInfo(list);
//        return userInfoPage.getList();
        return null;
    }
}
