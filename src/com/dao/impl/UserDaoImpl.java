package com.dao.impl;

import com.dao.UserDao;
import com.entity.User;
import com.framework.impl.DaoImpl;
import org.springframework.stereotype.Repository;
//继承封装的DaoImpl,把泛型改成<User>即可
@Repository
public class UserDaoImpl extends DaoImpl<User> implements UserDao<User> {

}