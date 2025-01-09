package com.puinxiaolin;

import com.alibaba.druid.pool.DruidDataSource;
import com.puxinxiaolin.beans.OtherBean;
import com.puxinxiaolin.beans.XxxBean;
import com.puxinxiaolin.dao.PersonDao;
import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.dao.impl.PersonDaoImpl;
import com.puxinxiaolin.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplicationContextTest {
    public static void main(String[] args) throws IOException {
        // profile 指定环境
        System.setProperty("spring.profiles.active", "dev");

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
//        Object userDao3 = context.getBean("userDao3");
//        System.out.println(userDao3);


        // 测试 list
//        UserService userService = (UserService) context.getBean("userService");
//        userService.show();
//        System.out.println(userService);

        // 测试 beans -> profile
//        UserService userService = (UserService) context.getBean("userService1");
//        userService.show();
//        System.out.println(userService);

//        UserService userService = (UserService) context.getBean("userService");
//        UserService userService = (UserService) context.getBean("usce");
//        userService.show();
//        System.out.println(userService);

//        UserService userService = context.getBean("userService1", UserService.class);
//        System.out.println(userService);


        // 1. 手动配置数据源
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName();
//        dataSource.setUrl();
//        dataSource.setUsername();
//        dataSource.setPassword();
        // 通过配置文件配置
//        Object dataSource = context.getBean("dataSource");
//        System.out.println(dataSource);

        // 2. 手动配置mysql
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//        Object connection = context.getBean("connection");
//        System.out.println(connection);

        // 3. 日期
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = simpleDateFormat.parse("2023-08-07 12:00:00");

        // 4. mybatis
        // 先读取配置文件，再获取builder，最后获取factory
//        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = builder.build(in);

//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("SqlSessionFactory");
//        System.out.println(sqlSessionFactory);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        System.out.println(sqlSession);

//        Object userService = context.getBean("userService");
//        System.out.println(userService);

//        PersonDao personDao = context.getBean(PersonDao.class);
//        System.out.println(personDao);

//        OtherBean otherBean = context.getBean(OtherBean.class);
//        XxxBean xxxBean = context.getBean(XxxBean.class);
//        System.out.println(otherBean);
//        System.out.println(xxxBean);

//        UserDao userDao = (UserDao) context.getBean("userDao");
//        userDao.show();

        UserService userService = context.getBean(UserService.class);
//        System.out.println(userService);
        userService.show();
    }
}
