package com.serivce;

import com.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// 业务层
@Service
public class UserService {
    // Resource 通过byName赋值； Autowired 通过byType赋值   代替databases.xml
    @Resource
    private UserDao userDao;//不需要new对象

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }//自动注入不需要它

    public void add(){
        System.out.println("UserService.add......");
        userDao.add();
    }
}
