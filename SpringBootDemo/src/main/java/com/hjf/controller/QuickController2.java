package com.hjf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/16 20:14
 *@Package_Name: com.hjf.controller
 *@Description: 测试类
 ****/
@RestController
public class QuickController2 {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    @Value("${person.addr}")
    private String addr;

    @RequestMapping("quick2")
    public String quick2()
    {
        //获取配置文件信息
        System.out.println(name);
        System.out.println(age);
        System.out.println(addr);
        return "获取的name是"+name+" age="+age+" addr="+addr;
    }

}
