package com.test.demo.model.vo;


import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(description = "信息类")
public class UserVo extends Model<UserVo> implements Serializable {
    private static final long serialVersionUID = -87659253384134719L;
    /**
    * 主键ID
    */    
    @ApiModelProperty("主键ID")
    private Long id;
    /**
    * 姓名
    */    
    @ApiModelProperty("姓名")
    private String name;
    /**
    * 年龄
    */    
    @ApiModelProperty("年龄")
    private Integer age;
    /**
    * 邮箱
    */    
    @ApiModelProperty("邮箱")
    private String email;
        
    @ApiModelProperty("$column.comment")
    private Date createTime;
        
    @ApiModelProperty("$column.comment")
    private Date date;



}
