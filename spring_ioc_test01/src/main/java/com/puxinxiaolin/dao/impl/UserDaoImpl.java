package com.puxinxiaolin.dao.impl;

import com.puxinxiaolin.dao.UserDao;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class UserDaoImpl implements UserDao {
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
