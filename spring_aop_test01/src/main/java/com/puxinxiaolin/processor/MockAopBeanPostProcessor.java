package com.puxinxiaolin.processor;

import com.puxinxiaolin.advice.MyAdvice;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Proxy;

public class MockAopBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {

    private ApplicationContext applicationContext;

//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        // 对 UserServiceImpl 中的 show1 和 show2 方法进行增强
//        if (bean.getClass().getPackage().getName().equals("com.puxinxiaolin.service.impl")) {
//            Object beanProxy = Proxy.newProxyInstance(
//                    bean.getClass().getClassLoader(),
//                    bean.getClass().getInterfaces(),
//                    (proxy, method, args) -> {
//                        MyAdvice myAdvice = applicationContext.getBean(MyAdvice.class);
//                        myAdvice.beforeAdvice();
//                        Object result = method.invoke(bean, args);
//                        myAdvice.afterAdvice();
//                        return result;
//                    }
//            );
//            return beanProxy;
//        }
//        return bean;
//    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
