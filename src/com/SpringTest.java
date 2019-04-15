package com;

import com.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String[] args) {
        // 获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        //获取的bean是spring.xml的id
        User user = (User)ac.getBean("user1");
        user.say();
        //第二种，不需要强转的
        User user1 = ac.getBean("user",User.class);
        user1.say();
    }
}
