package com.test;

import com.entity.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Acthor:孙琪; date:2019/4/16;
 */
public class SpringTest {

    @Test
    public void add(){
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = new User();
        user.setUsername("11111");
        user.setPassword("11111");
        userService.add(user);
    }
    @Test
    public void update(){
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = new User();
        user.setuId(3);
        user.setUsername("33333");
        user.setPassword("33333");
        userService.update(user);
    }
    @Test
    public void delete(){
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = new User();
        user.setuId(4);
        userService.delete(4);
    }

    @Test
    public void query(){
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.query();
    }

    @Test
    public void query2(){
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.query2();
    }
    @Test
    public void queryOne(){
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.queryOne();
    }

}
