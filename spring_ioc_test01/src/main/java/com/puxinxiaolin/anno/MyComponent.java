package com.puxinxiaolin.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)    // 注解的使用范围，这里指定用于类上
@Retention(RetentionPolicy.RUNTIME)    // 注解的生命周期，这里指定在运行时保留
public @interface MyComponent {

    String value();

}
