package com.example.service;

/**
 * @author zhouhuangfan
 * @data 2019-5-5 0005
 */

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User sel(int id){
        return userMapper.sel(id);
    }
}

