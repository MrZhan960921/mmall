package com.mmall.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author 占超群
 * @data 2018/12/23 9:45
 * lombok尽量在pojo类使用，因为很单纯
 */

@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String question;

    private String answer;

    private Integer role;

    private Date createTime;

    private Date updateTime;


    public User() {
        super();
    }
    public User(Integer id, String username, String password, String email, String phone, String question, String answer, Integer role, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.question = question;
        this.answer = answer;
        this.role = role;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
