package com.hjf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/15 18:13
 *@Package_Name: com.hjf.controller
 *@Description: 测试控制层
 ****/

@RestController
public class QuickController {

    @RequestMapping("/quick")
    public String quick() {
        return "更改了 第二次  Hello World";
    }
}
