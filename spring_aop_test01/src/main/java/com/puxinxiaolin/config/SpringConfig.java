package com.puxinxiaolin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.puxinxiaolin")
@EnableAspectJAutoProxy
public class SpringConfig {



}
