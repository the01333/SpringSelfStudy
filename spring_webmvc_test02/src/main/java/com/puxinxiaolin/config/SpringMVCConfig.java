package com.puxinxiaolin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.puxinxiaolin.controller")
@EnableWebMvc
public class SpringMVCConfig {

    @Bean
    public CommonsMultipartResolver commonsMultipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("UTF-8");
        commonsMultipartResolver.setMaxUploadSizePerFile(1024*1024*10);
        commonsMultipartResolver.setMaxUploadSize(1024*1024*50);
        commonsMultipartResolver.setMaxInMemorySize(1024*1024*10);
        return commonsMultipartResolver;
    }

}
