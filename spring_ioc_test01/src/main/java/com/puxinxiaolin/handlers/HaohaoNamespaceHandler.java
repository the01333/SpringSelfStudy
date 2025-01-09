package com.puxinxiaolin.handlers;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @description: 这里直接继承 NamespaceHandlerSupport，由于它已经实现了 NamespaceHandler，
 * 会自动调用parse方法: 根据当前标签获取当前标签对应的 Parser 解析器，最后再去调用 Parser 的 parse 方法
 * @author: YCcLin
 * @date: 2025/1/9
 **/
public class HaohaoNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        // 初始化，一般情况下，一个命名空间下有多个标签，会在init方法中为每一个标签注册一个标签解析器
        this.registerBeanDefinitionParser("annotation-driven", new HaohaoBeanDefinitionParser());
    }
}
