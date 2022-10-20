package com.kskr.spring.properties;

import com.kskr.spring.basics.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {
    public static void main(String[] args) {
        try (
                AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesApplication.class);
        ) {
            ExternalService externalService = applicationContext.getBean(ExternalService.class);
            System.out.println(externalService.returnServiceUrl());
        }
    }
}
