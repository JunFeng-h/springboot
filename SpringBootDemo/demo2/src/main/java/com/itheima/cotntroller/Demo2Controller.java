package com.itheima.cotntroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/15 21:07
 *@Package_Name: com.itheima.cotntroller
 *@Description: 测试
 ****/

@RestController
public class Demo2Controller {

    @RequestMapping("demo2")
    public String demo2()
    {
        return "demo2哈哈！！！";
    }
}
