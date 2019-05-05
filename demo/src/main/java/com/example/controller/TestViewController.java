package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhouhuangfan
 * @data 2019-5-5 0005
 * 测试spingmvc视图
 */
@Controller
public class TestViewController {

    /**测试springboot访问html页面 */
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    /**测试springboot访问jsp页面 */
    @RequestMapping("/index")
    public String testJsp(){
        return "index";
    }

}
