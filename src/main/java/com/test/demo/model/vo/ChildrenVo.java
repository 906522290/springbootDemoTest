package com.test.demo.model.vo;


import java.io.Serializable;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

/**
 * (Children)实体类
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "信息类")
public class ChildrenVo extends Model<ChildrenVo> implements Serializable {
    private static final long serialVersionUID = 574242555578923102L;
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
    * 上级ID
    */    
    @ApiModelProperty("上级ID")
    private Long userId;



}
