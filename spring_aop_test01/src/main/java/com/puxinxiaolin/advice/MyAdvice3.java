package com.puxinxiaolin.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @description: 实现 Advice 接口子类实现 Aop 2.0
 * @author: YCcLin
 * @date: 2025/1/10
 **/
public class MyAdvice3 implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前增强....");
        Object result = methodInvocation.getMethod()
                .invoke(methodInvocation.getThis(), methodInvocation.getArguments());
        System.out.println("环绕后增强....");
        return result;
    }
}
