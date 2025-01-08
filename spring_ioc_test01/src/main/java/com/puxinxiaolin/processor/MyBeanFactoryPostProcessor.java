package com.puxinxiaolin.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
//        System.out.println("beanDefinitionMap填充完毕后回调该方法");

//        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("userService");
//        beanDefinition.setBeanClassName("com.puxinxiaolin.dao.impl.UserDaoImpl");

        // 通过 BeanFactoryPostProcessor 动态注册 beanDefinition
//        BeanDefinition beanDefinition = new RootBeanDefinition();
//        beanDefinition.setBeanClassName("com.puxinxiaolin.dao.impl.PersonDaoImpl");
//        // 强转为 DefaultListableBeanFactory
//        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableListableBeanFactory;
//        defaultListableBeanFactory.registerBeanDefinition("personDao", beanDefinition);
    }
}
