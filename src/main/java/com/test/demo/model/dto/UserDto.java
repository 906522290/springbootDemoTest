package com.test.demo.model.dto;


import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends Model<UserDto> implements Serializable {
    private static final long serialVersionUID = -23368040682562550L;
    /**
    * 主键ID
    */    
    private Long id;
    /**
    * 姓名
    */    
    private String name;
    /**
    * 年龄
    */    
    private Integer age;
    /**
    * 邮箱
    */    
    private String email;
        
    private Date createTime;
        
    private Date date;



}
