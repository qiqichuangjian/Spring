package com.test;


import com.entity.User;
import com.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring01.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = new User();
        user.setUsername("11111");
        user.setPassword("11111");
        userService.add(user);
    }
}
