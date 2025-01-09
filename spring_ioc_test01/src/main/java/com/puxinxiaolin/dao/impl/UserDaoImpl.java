package com.puxinxiaolin.dao.impl;

import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.service.UserService;
import com.puxinxiaolin.service.impl.UserServiceImpl;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class UserDaoImpl implements UserDao {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserDaoImpl() {
//        System.out.println("UserDao创建");
    }

    @Override
    public void show() {
        System.out.println("UserDao.show...");
    }

//    private String userName;
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public UserDaoImpl() {
//        System.out.println("UserDao实例化");
//    }
//
//    public void init() {
//        System.out.println("UserDao.init初始化方法执行...");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("UserDao.afterPropertiesSet初始化方法执行...");
//    }
}
