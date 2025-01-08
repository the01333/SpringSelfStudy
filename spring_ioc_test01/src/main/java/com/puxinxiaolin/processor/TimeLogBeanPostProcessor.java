package com.puxinxiaolin.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;
import java.util.Date;

public class TimeLogBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 使用动态代理对目标bean进行增强，返回proxy对象，进而存储到单例池singletonObjects中
        Object beanProxy = Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("方法：" + method.getName() + "-开始时间：" + new Date());
                    Object invoke = method.invoke(bean, args);
                    System.out.println("方法：" + method.getName() + "-结束时间：" + new Date());
                    return invoke;
                }
        );
        return beanProxy;
    }
}
