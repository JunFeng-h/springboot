package com.hjf.domain;

import lombok.Data;

import javax.persistence.*;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/17 11:41
 *@Package_Name: com.hjf.domain
 *@Description: pojo类
 ****/

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //主键生成策略自增
    private Long id;
    private String username;
    private String password;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
