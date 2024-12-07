package com.puxinxiaolin.service.impl;

import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.service.UserService;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("UserServiceImpl实例化");
    }

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        System.out.println("BeanFactory调用该方法获得userDao设置到此处:" + userDao);
        this.userDao = userDao;
    }
}
