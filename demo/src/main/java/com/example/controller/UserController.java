package com.example.controller;

/**
 * @author zhouhuangfan
 * @data 2019-5-5 0005
 * @RestController注解的作用
 * 只返回json格式的字符串，
 * 而不会返回视图
 */

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    /**查询数据库操作*/
    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id){

        return userService.sel(id).toString();
    }
}

