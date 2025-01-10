package com.puxinxiaolin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.puxinxiaolin.anno.MyMapperScan;
import com.puxinxiaolin.beans.OtherBean;
import com.puxinxiaolin.imports.MyImportBeanDefinitionRegistrar;
import com.puxinxiaolin.imports.MyImportSelector;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.puxinxiaolin"})
@PropertySource({"classpath:jdbc.properties"})
//@Import({MyImportSelector.class, OtherBean.class})
//@Import(MyImportBeanDefinitionRegistrar.class)
@MyMapperScan    // 等同于上面那句 @Import(MyImportBeanDefinitionRegistrar.class)，因为这个注解已经封装了
@MapperScan(basePackages = {"com.puxinxiaolin.mapper"})
public class SpringConfig {

    @Bean
    public DataSource dataSource(
            @Value("${jdbc.driver}") String driverClassName,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.username}") String username,
            @Value("${jdbc.password}") String password
    ) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

}
