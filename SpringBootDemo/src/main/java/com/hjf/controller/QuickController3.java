package com.hjf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/16 20:26
 *@Package_Name: com.hjf.controller
 *@Description: 测试
 ****/

@RestController
@ConfigurationProperties(prefix = "person")
public class QuickController3 {

    private String name;
    private int age;
    private String addr;
    private String birthday;
    private List<String> cities;
    private Map<String,String> map;

    public Map<String, String> getMap() {
        return map;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @RequestMapping("quick3")
    public String quick3()
    {
        //获取配置文件信息
        System.out.println(name);
        System.out.println(age);
        System.out.println(addr);
        cities.forEach(city ->{
            System.out.println(city);
        });
        System.out.println("-----------");
        map.entrySet().forEach(map1 ->{
            System.out.println(map1.getKey());
            System.out.println(map1.getValue());
            System.out.println("---------------");
        });
        return "获取的name是"+name+" age="+age+" addr="+addr+" birthday="+birthday;
    }
}
