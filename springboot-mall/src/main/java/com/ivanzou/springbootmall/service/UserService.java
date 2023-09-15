package com.ivanzou.springbootmall.service;

import com.ivanzou.springbootmall.dto.UserLoginRequest;
import com.ivanzou.springbootmall.dto.UserRegisterRequest;
import com.ivanzou.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
