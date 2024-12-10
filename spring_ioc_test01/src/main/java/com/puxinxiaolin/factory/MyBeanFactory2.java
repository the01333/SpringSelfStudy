package com.puxinxiaolin.factory;

import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.dao.impl.UserDaoImpl;

public class MyBeanFactory2 {

    public UserDao userDao(String userName) {
        return new UserDaoImpl();
    }
}
