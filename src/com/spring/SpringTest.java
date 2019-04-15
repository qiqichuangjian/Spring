package com.spring;

import com.java.JavaWork;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : 张晋飞
 * date : 2019/4/15
 */
//将控制权转给Spring.xml
public class SpringTest {
    public static void main(String[] args) {
//引入xml配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user1", User.class);
        System.out.println(user);
        JavaWork javaWork = applicationContext.getBean("javaWork", JavaWork.class);
        javaWork.doTest();
    }
}
