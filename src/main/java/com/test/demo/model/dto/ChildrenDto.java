package com.test.demo.model.dto;


import java.io.Serializable;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class ChildrenDto extends Model<ChildrenDto> implements Serializable {
    private static final long serialVersionUID = 794561939887614442L;
    /**
    * 主键ID
    */    
    private Long id;
    /**
    * 姓名
    */    
    private String name;
    /**
    * 上级ID
    */    
    private Long userId;



}
