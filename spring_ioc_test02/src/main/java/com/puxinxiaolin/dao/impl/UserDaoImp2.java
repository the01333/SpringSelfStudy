package com.puxinxiaolin.dao.impl;

import com.puxinxiaolin.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao2")
//@Primary
public class UserDaoImp2 implements UserDao {

    @Override
    public void show() {

    }

}
