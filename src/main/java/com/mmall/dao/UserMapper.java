package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    int insert(User record);

    int checkUsername(String username);

    User selectLogin(@Param("username") String username, @Param("password")String password);

    int checkEmail(String email);

    String selectQuestionByUsername(String username);

    int checkAnswer(@Param("username")String username,@Param("question")String question,@Param("answer")String answer);

    int checkPassword(@Param(value="password")String password,@Param("userId")Integer userId);

    int updateByPrimaryKeySelective(User record);

    int checkEmailByUserId(@Param(value="email")String email,@Param(value="userId")Integer userId);

    User selectByPrimaryKey(Integer id);

    int updatePasswordByUsername(@Param("username")String username,@Param("passwordNew")String passwordNew);

}