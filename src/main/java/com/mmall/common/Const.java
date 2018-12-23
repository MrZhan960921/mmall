package com.mmall.common;

/**
 * @author 占超群
 * @data 2018/12/23 10:25
 * 通用常量类
 */
public class Const {
    /**
     * 当前用户
     */
    public static final String CURRENT_USER="currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";


    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
