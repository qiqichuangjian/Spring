package com.dao;

import org.springframework.stereotype.Repository;

// 持久层  数据访问层就是DAO
//注解版了
@Repository("userDao")
public class UserDao {

    public void add(){

        System.out.println("UserDao.add......");
    }
}
