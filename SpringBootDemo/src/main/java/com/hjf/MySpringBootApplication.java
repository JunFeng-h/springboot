package com.hjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/14 12:22
 *@Package_Name: com.hjf
 *@Description: 测试启动类
 ****/

/***
 * 自定义的引导类
 * 此注解标志这个类是引导类
 */
@SpringBootApplication
public class MySpringBootApplication
{
    //main方法是程序入口 run参数是引导类的字节码文件
    public static void main(String[] args) {
    SpringApplication.run(MySpringBootApplication.class);
}
}
