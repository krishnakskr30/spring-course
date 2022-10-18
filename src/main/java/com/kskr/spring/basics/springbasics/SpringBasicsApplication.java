package com.kskr.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class SpringBasicsApplication {
    public static void main(String[] args) {
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//        int result = binarySearch.binarySearch(new int[]{1, 2, 3}, 3);
//        System.out.println(result);
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{1, 2, 3}, 3);
        System.out.println(result);
    }
}
