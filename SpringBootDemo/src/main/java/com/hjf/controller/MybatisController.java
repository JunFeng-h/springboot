package com.hjf.controller;

import com.hjf.domain.User;
import com.hjf.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/17 11:55
 *@Package_Name: com.hjf.controller
 *@Description: mybatis集成测试类
 ****/

@RestController
public class MybatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/mybatisDemo")
    public List<User> queryUserList()
    {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
