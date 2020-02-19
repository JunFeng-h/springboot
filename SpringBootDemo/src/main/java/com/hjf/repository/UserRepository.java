package com.hjf.repository;

import com.hjf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/17 17:34
 *@Package_Name: com.hjf.repository
 *@Description: 接口
 ****/
// JpaRepository 封装了基本CURD操作 JpaSpecificationExecutor封装了复杂查询 条件 模糊 分页条件 动态查询 多条件查询等等
public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {
//

    @Override
    public List<User> findAll();
}
