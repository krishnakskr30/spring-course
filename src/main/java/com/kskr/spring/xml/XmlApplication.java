package com.kskr.spring.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.kskr.spring.basics")
public class XmlApplication {
    static Logger LOGGER = LoggerFactory.getLogger(XmlApplication.class);

    public static void main(String[] args) {
        try (
                ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")
        ) {
            LOGGER.info("Beans Loaded->{}", (Object) applicationContext.getBeanDefinitionNames());
            XmlDAO xmlDAO = applicationContext.getBean(XmlDAO.class);
            LOGGER.info("{} {}", xmlDAO, xmlDAO.getXmlJdbcConnection());
        }
    }
}
