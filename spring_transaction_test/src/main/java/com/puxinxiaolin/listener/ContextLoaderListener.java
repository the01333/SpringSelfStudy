package com.puxinxiaolin.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    private static final String CONTEXT_CONFIG_LOCATION = "contextConfigLocation";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextLoaderListener init....");
        ServletContext servletContext = sce.getServletContext();
        // 0. 获取全局参数
        String contextConfigLocation = servletContext.getInitParameter(CONTEXT_CONFIG_LOCATION);
        contextConfigLocation = contextConfigLocation.substring("classpath:".length());
        // 1. 创建容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfigLocation);
        // 2. 将容器存入到 ServletContext 中
        sce.getServletContext().setAttribute("applicationContext", applicationContext);
    }

}
