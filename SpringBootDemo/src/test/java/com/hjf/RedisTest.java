package com.hjf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/17 19:01
 *@Package_Name: com.hjf
 *@Description: redis整合测试
 ****/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test()
    {
        redisTemplate.boundValueOps("地址").set("南阳市");
        String person = redisTemplate.boundValueOps("地址").get();
        System.out.println("获取到的值是"+person);
    }

}
