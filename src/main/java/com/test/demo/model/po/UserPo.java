package com.test.demo.model.po;
 
import java.util.Date;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

 @Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class UserPo extends Model<UserPo> implements Serializable {
    private static final long serialVersionUID = -36037717073799767L;
    /**
    * 主键ID
    */

    @TableId(type = IdType.ASSIGN_ID)
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
