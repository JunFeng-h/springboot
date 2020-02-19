package com.hjf;

import com.hjf.domain.User;
import com.hjf.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/****
 *@Author: 何俊峰
 *@Create: 2020/2/17 17:51
 *@Package_Name: com.hjf
 *@Description: JPA测试
 ****/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class SpringDataJpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void  test()
    {
        List<User> userList = userRepository.findAll();
        userList.forEach( user ->{
            System.out.println(user);
            System.out.println("-------------");
        });
    }
}
