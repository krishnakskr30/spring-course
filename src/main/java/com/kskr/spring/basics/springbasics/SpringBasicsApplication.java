package com.kskr.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class SpringBasicsApplication {
    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl();
        int result = binarySearch.binarySearch(new int[]{1, 2, 3}, 3);
        System.out.println(result);
        SpringApplication.run(SpringBasicsApplication.class, args);

    }
}
