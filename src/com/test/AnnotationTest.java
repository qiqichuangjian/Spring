package com.test;


import com.zhuJie.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
