package com.entity;

/**
 * @Acthor:孙琪; date:2019/4/15;
 */
public class UserFactory {
    //非静态
    public User createUser(){
        User user  =  new User();
        user.setId(5);
        user.setUsername("u5");
        user.setPassword("p5");
        return user;
    }
    //static静态
    public static User createStaticUser(){
        User user  =  new User();
        user.setId(6);
        user.setUsername("u6");
        user.setPassword("p6");
        return user;
    }
}
