package com.bob.springbootdemo.service.serviceimpl;

import com.bob.springbootdemo.mapper.UserMapper;
import com.bob.springbootdemo.model.User;
import com.bob.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getAllUser(){
        return userMapper.getAllUser();
    }
}
