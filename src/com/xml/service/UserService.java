package com.xml.service;

import com.xml.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Acthor:孙琪; date:2019/4/16;
 */
@Service
public class UserService {
    // Resource 通过byName赋值； Autowired 通过byType赋值
    @Resource
    private UserDao userDao;

    public void add(){
        System.out.println("xml版UserService.add......");
        userDao.add();
    }
}
