package com.puxinxiaolin.imports;

import com.puxinxiaolin.beans.OtherBean2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {  // annotationMetadata 叫做注解媒体数据，该对象内部封装的是当前使用了 @Import 注解的类上的其他注解的信息

        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(ComponentScan.class.getName());
        annotationAttributes.forEach((key, value) -> {
            System.out.println(key + "==" + value);
        });

        // 返回的是需要被注册到 Spring 容器中的 Bean 的全限类名
        return new String[]{OtherBean2.class.getName()};
    }
}
