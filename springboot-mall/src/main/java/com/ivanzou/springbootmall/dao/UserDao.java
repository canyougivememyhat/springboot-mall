package com.ivanzou.springbootmall.dao;

import com.ivanzou.springbootmall.dto.UserLoginRequest;
import com.ivanzou.springbootmall.dto.UserRegisterRequest;
import com.ivanzou.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
