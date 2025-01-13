package com.puxinxiaolin;

import com.puxinxiaolin.config.SpringConfig;
import com.puxinxiaolin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        UserService userService = applicationContext.getBean(UserService.class);
//        userService.show1();
//        userService.show2();
//        UserDao userDao = applicationContext.getBean(UserDao.class);
//        userDao.show();

//        UserService userService = applicationContext.getBean(UserService.class);
//        userService.show1();

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        UserService userService = applicationContext.getBean(UserService.class);
//        userService.show1();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.show2();
    }
}
