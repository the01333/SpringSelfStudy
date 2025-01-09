package com.puxinxiaolin.service.impl;

import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.mapper.UserMapper;
import com.puxinxiaolin.pojo.User;
import com.puxinxiaolin.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserServiceImpl implements UserService, InitializingBean,
        ServletContextAware, ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserServiceImpl() {
//        System.out.println("userServiceImpl创建");
    }

    // 注入 List
//    private List<String> stringList;
//
//    public void setStringList(List<String> stringList) {
//        this.stringList = stringList;
//    }
//
//    private List<UserDao> userDaoList;
//
//    public void setUserDaoList(List<UserDao> userDaoList) {
//        this.userDaoList = userDaoList;
//    }
//
//    private Set<String> stringSet;
//    public void setStringSet(Set<String> stringSet) {
//        this.stringSet = stringSet;
//    }
//
//    private Set<UserDao> userDaoSet;
//    public void setUserDaoSet(Set<UserDao> userDaoSet) {
//        this.userDaoSet = userDaoSet;
//    }
//
//    private Map<String, UserDao> map;
//    public void setMap(Map<String, UserDao> map) {
//        this.map = map;
//    }
//
//    private Properties properties;
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }

    @Override
    public void show() {
//        System.out.println("stringList = " + stringList);
//        System.out.println("userDaoList = " + userDaoList);
//        System.out.println("stringSet = " + stringSet);
//        System.out.println("userDaoSet = " + userDaoSet);
//        System.out.println("map = " + map);
//        System.out.println("properties = " + properties);
//        System.out.println(userDao);
        List<User> userList = userMapper.findAll();
        userList.forEach(System.out::println);
    }

    //    public UserServiceImpl() {
//        System.out.println("UserServiceImpl-无参实例化");
//    }
//
//    public UserServiceImpl(String name) {
//        System.out.println("UserServiceImpl-有参实例化 name = " + name);
//    }

    public void init() {
        System.out.println("初始化方法...");
    }

    public void destroy() {
        System.out.println("销毁方法...");
    }

    // 通过 xml 文件注入
    private UserDao userDao;

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserDao(UserDao userDao) {
//        System.out.println("userService 执行注入 userDap 的操作: setUserDao方法执行");
//        System.out.println("BeanFactory调用该方法获得userDao设置到此处:" + userDao);
        this.userDao = userDao;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet 执行...");
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
//        System.out.println("servletContext = " + servletContext);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("applicationContext = " + applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("beanFactory = " + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
//        System.out.println("beanName = " + s);
    }
}
