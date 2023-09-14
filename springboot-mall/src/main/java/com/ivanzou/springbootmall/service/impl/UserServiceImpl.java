package com.ivanzou.springbootmall.service.impl;

import com.ivanzou.springbootmall.dao.UserDao;
import com.ivanzou.springbootmall.dto.UserRegisterRequest;
import com.ivanzou.springbootmall.model.User;
import com.ivanzou.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
