package com.puxinxiaolin.processor;

import com.puxinxiaolin.dao.impl.UserDaoImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @description: 对创建好的 bean 存入到 map 之前进行操作（属性填充等）
 * @author: YCcLin
 * @date: 2025/1/8
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof UserDaoImpl) {
//            ((UserDaoImpl) bean).setUserName("puxinxiaolin");
        }
        System.out.println(beanName + ": postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + ": postProcessAfterInitialization");
        return bean;
    }
}
