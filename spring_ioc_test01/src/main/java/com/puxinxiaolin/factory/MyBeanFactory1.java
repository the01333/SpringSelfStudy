package com.puxinxiaolin.factory;

import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.dao.impl.UserDaoImpl;

public class MyBeanFactory1 {

    public static UserDao userDao(String name, int age) {
        return new UserDaoImpl();
    }
}
