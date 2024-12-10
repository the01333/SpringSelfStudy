package com.puxinxiaolin.service.impl;

import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.service.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean {

    public UserServiceImpl() {
        System.out.println("UserServiceImpl-无参实例化");
    }

    public UserServiceImpl(String name) {
        System.out.println("UserServiceImpl-有参实例化 name = " + name);
    }

    public void init() {
        System.out.println("初始化方法...");
    }

    public void destroy() {
        System.out.println("销毁方法...");
    }

    // 通过 xml 文件注入
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
//        System.out.println("BeanFactory调用该方法获得userDao设置到此处:" + userDao);
        this.userDao = userDao;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet 执行...");
    }
}
