package com.test.demo.entity;


import java.io.Serializable;

/**
 * (Children)实体类
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
public class Children implements Serializable {
    private static final long serialVersionUID = 826500245418214035L;
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

        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString(){
        return "Children {" +
            "id : " + id + ", " +
            "name : " + name + ", " +
            "userId : " + userId + ", " +
        '}';
    }
}

