package com.service;

import com.dao.UserDao;
import com.entity.User;
import com.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Acthor:孙琪; date:2019/4/16;
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    @Autowired
    private TransactionUtil transaction;


    public void add(User user) {
        System.out.println("UserService.add......");
        // 开始事务  spring01.xml对应   编程式（手动）事务管理，从代码上进行控制
        TransactionStatus begin = null;
        try {
            begin = transaction.begin();
            userDao.add(user);
        // System.out.println(1/0);
            transaction.commit(begin);//放这里，就算显示添加成功，只要有异常，数据就提交不到数据库
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback(begin);
        }
        //transaction.commit(begin);不能放外边，不然出错了，捕获了异常，还会提交数据到数据库
    }

    public void add02(User user) {
        System.out.println("UserService.add02......");
        userDao.add(user);
        // 在service 不要去捕捉异常，抛出异常，异常交给controller解决
        //捕获异常，事务就不能捕获了
        // System.out.println(1/0);
    }

    public void add03(User user) {
        System.out.println("UserService.add03......");
        userDao.add(user);
//        System.out.println(1 / 0);
    }

    @Transactional
    public void add04(User user) {
        System.out.println("UserService.add04......");
        userDao.add(user);
        //System.out.println(1/0);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public void query() {
        userDao.query();
    }

    public void query2() {
        userDao.query2();
    }

    public void queryOne() {
        userDao.queryOne();
    }
}
