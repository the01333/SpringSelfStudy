package com.puxinxiaolin.utils;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class WebApplicationContextUtil {

    public static ApplicationContext getWebApplicationContext(ServletContext servletContext) {
        ApplicationContext applicationContext = (ApplicationContext) servletContext.getAttribute("applicationContext");
        return applicationContext;
    }

}
