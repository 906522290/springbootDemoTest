package com.test.demo.model.po;
 

import java.io.Serializable;
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
@TableName("children")
public class ChildrenPo extends Model<ChildrenPo> implements Serializable {
    private static final long serialVersionUID = 268437001907479356L;
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
