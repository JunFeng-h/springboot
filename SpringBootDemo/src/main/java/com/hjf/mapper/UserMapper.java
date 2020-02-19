package com.hjf.mapper;

import com.hjf.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/17 11:46
 *@Package_Name: com.hjf.mapper
 *@Description: mapper接口
 ****/

@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
