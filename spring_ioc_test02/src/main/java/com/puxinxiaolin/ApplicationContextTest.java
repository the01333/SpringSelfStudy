package com.puxinxiaolin;

import com.puxinxiaolin.beans.OtherBean2;
import com.puxinxiaolin.config.SpringConfig;
import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.dao.impl.UserDaoImpl;
import com.puxinxiaolin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        // xml方式加载
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        userDao.show();
//        UserService userService = applicationContext.getBean(UserService.class);
//        System.out.println(userDao);
//        System.out.println(userService);

//        UserService userService = (UserService) applicationContext.getBean("userService");
//        userService.show();
//        applicationContext.close();

//        Object dataSource = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);

        // 指定环境
        System.setProperty("spring.profiles.active", "test");

        // 注解方式加载
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserService userService = applicationContext.getBean(UserService.class);
//        userService.show();
//        Object dataSource = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);

        OtherBean2 otherBean2 = applicationContext.getBean(OtherBean2.class);
        System.out.println(otherBean2);
    }
}
