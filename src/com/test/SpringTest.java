package com.test;

import com.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Acthor:孙琪; date:2019/4/15;
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        // 通过setter注入
        User user1 = ac.getBean("user1",User.class);
        System.out.println(user1);
        //构造方法类型注入
        User user2 = ac.getBean("user2",User.class);
        System.out.println(user2);
        //构造方法索引注入
        User user3 = ac.getBean("user3",User.class);
        System.out.println(user3);
        //构造方法联合注入
        User user4 = ac.getBean("user4",User.class);
        System.out.println(user4);
        //非静态工厂
        User user5 = ac.getBean("user5",User.class);
        System.out.println(user5);
        //静态工厂
        User user6 = ac.getBean("user6",User.class);
        System.out.println(user6);
    }
}
