package com.test.demo.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-11-08 14:57:17
 */
public class User implements Serializable {
    private static final long serialVersionUID = -72627337733949619L;
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
        
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
        
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return "User {" +
            "id : " + id + ", " +
            "name : " + name + ", " +
            "age : " + age + ", " +
            "email : " + email + ", " +
            "createTime : " + createTime + ", " +
            "date : " + date + ", " +
        '}';
    }
}

