package com.puxinxiaolin.service.impl;

import com.puxinxiaolin.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void show1() {
//        int i = 1 / 0;
        System.out.println("show1....");
    }

    @Override
    public void show2() {
        System.out.println("show2....");
    }
}
