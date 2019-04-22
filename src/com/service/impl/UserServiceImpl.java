package com.service.impl;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Acthor:孙琪; date:2019/4/22;
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    //事务
    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
        //System.out.println(1/0);
    }
    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional
    @Override
    public User findById(Integer id) {
        User byId = (User) userDao.findById(id);
        return byId;

    }
    @Transactional
    @Override
    public void delete(User user) {

        userDao.delete(user);
    }


}

