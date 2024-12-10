package com.puinxiaolin;

import com.puxinxiaolin.dao.UserDao;
import com.puxinxiaolin.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
        // 1. 创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 创建一个读取器（xml文件）
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        // 3. 读取配置文件给工厂
        reader.loadBeanDefinitions("beans.xml");

        // 4. 根据 id 获取 Bean 实例对象
        UserService userService = (UserService) beanFactory.getBean("userService");
//        System.out.println(userService);

//        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
//        System.out.println(userDao);
        
    }
}
