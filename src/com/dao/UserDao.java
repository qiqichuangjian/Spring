package com.dao;

import com.framework.Dao;

//继承封装的Dao,把泛型改成<User>即可
public interface UserDao<User> extends Dao<User> {


}
