package com.test;

import com.serivce.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

//注解的测试
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();

    }

}
