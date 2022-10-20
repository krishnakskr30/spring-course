package com.kskr.spring.xml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.kskr.spring.basics")
public class XmlApplication {
    public static void main(String[] args) {
        try (
                ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")
        ) {
            XmlDAO xmlDAO = applicationContext.getBean(XmlDAO.class);
            System.out.println(xmlDAO);
        }
    }
}
