package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Acthor:孙琪; date:2019/4/16;
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public void add(User user){
        System.out.println("UserService.add......");
        userDao.add(user);
    }
    public void update(User user){
        System.out.println("UserService.update......");
        userDao.update(user);
    }
    public void delete(int id){
        System.out.println("UserService.delete......");
        userDao.delete(id);
    }
    public void query(){
        System.out.println("UserService.query......");
        userDao.query();
    }
    public void query2(){
        System.out.println("UserService.query2......");
        userDao.query2();
    }
    public void queryOne(){
        System.out.println("UserService.queryOne......");
        userDao.queryOne();
    }
}
