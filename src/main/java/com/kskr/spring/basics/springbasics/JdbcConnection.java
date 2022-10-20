package com.kskr.spring.basics.springbasics;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC Connection");
    }
}
