package com.puxinxiaolin.test;

import com.puxinxiaolin.advice.MyAdvice4;
import com.puxinxiaolin.advice.Target;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @description: Cglib 演示
 * @author: YCcLin
 * @date: 2025/1/11
 **/
public class CglibTest {
    public static void main(String[] args) {
        Target target = new Target();
        MyAdvice4 myAdvice4 = new MyAdvice4();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);    // 设置父类
        // 设置回调
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            myAdvice4.before();
            Object result = method.invoke(target, objects);
            myAdvice4.afterReturnning();
            return result;
        });

        Target proxy = (Target) enhancer.create();

        proxy.show();
    }
}
