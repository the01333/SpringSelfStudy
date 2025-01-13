package com.puxinxiaolin.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @description: 在 xml 文件使用标签实现 Aop
 * @author: YCcLin
 * @date: 2025/1/10
 **/
@Component
@Aspect
public class MyAdvice {

    // 切入点表达式抽取
    @Pointcut("execution(* com.puxinxiaolin.service.impl.*.*(..))")
    public void myPointcut() {

    }

    @Before("myPointcut()")
    public void beforeAdvice(JoinPoint joinpoint) {
        System.out.println("当前目标对象是: " + joinpoint.getTarget());
        System.out.println("表达式: " + joinpoint.getStaticPart());
        System.out.println("前置增强....");
    }

    @AfterReturning("execution(* com.puxinxiaolin.service.impl.*.*(..))")
    public void afterReturningAdvice() {
        System.out.println("后置增强....");
    }

    public void afterAdvice() {
        System.out.println("最终增强....");
    }

    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前增强....");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("环绕后增强....");
        return result;
    }

    @AfterThrowing(value = "execution(* com.puxinxiaolin.service.impl.*.*(..))", throwing = "ex")
    public void afterThrowingAdvice(Throwable ex) {
        System.out.println("当前异常信息是: " + ex);
        System.out.println("抛异常执行....");
    }

}
