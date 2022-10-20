package com.kskr.spring.basics.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC Connection");
    }
}
