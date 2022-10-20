package com.kskr.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;

@Configuration
@ComponentScan("com.kskr.spring.basics")
public class SpringBasicsApplication {
    public static void main(String[] args) {
        try (
                AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);
        ) {
            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
            int result = binarySearch.binarySearch(new int[]{1, 2, 3}, 3);
            System.out.println(result);
        }
    }
}
