package com.puxinxiaolin.dao.impl;

import com.puxinxiaolin.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// <bean id="userDao" class="com.puxinxiaolin.dao.impl.UserDaoImpl"></bean>
//@Component(value = "userDao")
@Repository(value = "userDao")
//@Scope(value = "singleton")
//@Lazy(value = false)
@Profile(value = "test")     // 只有在 test 环境下才能使用
public class UserDaoImpl implements UserDao {

    //    @Value("lin")
    private String username;

    @Value(value = "lin")
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void show() {
        System.out.println(username);
    }

//    public UserDaoImpl() {
//        System.out.println("userDao创建");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("userDao的初始化方法");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("userDao的销毁方法");
//    }

}
