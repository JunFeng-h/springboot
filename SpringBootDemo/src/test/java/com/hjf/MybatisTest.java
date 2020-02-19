package com.hjf;

import com.hjf.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/17 12:11
 *@Package_Name: com.hjf
 *@Description: test集成测试
 ****/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        System.out.println("测试成功"+ userMapper.queryUserList());
    }
}
