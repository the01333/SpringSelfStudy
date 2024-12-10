package com.puinxiaolin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 1.1 根据 id 获取（id 会变成 bean 的名称）
//        UserService exampleFactory = (UserService) context.getBean("exampleFactory");
        // 1.2 如果没有配置 id，使用全限类名获取
//        UserService exampleFactory = (UserService) context.getBean("com.puxinxiaolin.service.impl.UserServiceImpl");
        // 1.3 使用别名获取
//        UserService exampleFactory = (UserService) context.getBean("us");

        // 2 测试 scope
        // 2.1 prototype（两个 bean 不一样）
//        UserService prototype1 = (UserService) context.getBean("exampleFactory");
//        UserService prototype2 = (UserService) context.getBean("exampleFactory");
//        System.out.println(prototype1);
//        System.out.println(prototype2);
        // 2.1 singleton（两个 bean 不一样）
//        UserService singleton1 = (UserService) context.getBean("exampleFactory");
//        UserService singleton2 = (UserService) context.getBean("exampleFactory");
//        System.out.println(singleton1);
//        System.out.println(singleton2);

        // 3. 测试 lazy-init
//        UserService lazyInit = (UserService) context.getBean("exampleFactory");
//        System.out.println(lazyInit);

        // 需要显式关闭（用子类 ClassPathXmlApplicationContext）
//        context.close();


        // 测试静态/实例工厂方法/FactoryBean
//        Object staticFactory = context.getBean("userDao1");
//        System.out.println(staticFactory);
//        Object exampleFactory = context.getBean("userDao2");
//        System.out.println(exampleFactory);
        Object userDao3 = context.getBean("userDao3");
        System.out.println(userDao3);
    }
}
