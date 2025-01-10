package com.puxinxiaolin.service.impl;

import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.mapper.UserMapper;
import com.puxinxiaolin.pojo.User;
import com.puxinxiaolin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void show() {
        List<User> userList = userMapper.findAll();
        userList.forEach(System.out::println);
//        System.out.println(userDao);
    }

//    @Autowired
//    @Qualifier(value = "userDao2")
//    @Resource(name = "userDao2")   // 如果指定名称 = Autowired + Qualifier
//    private UserDao userDao;

//    @Autowired
//    public void xxx(UserDao userDao) {
////        System.out.println("xxx: " + userDao);
//    }

//    @Autowired
//    public void yyy(List<UserDao> userDaoList) {
////        System.out.println("yyy: " + userDaoList);
//    }
}
