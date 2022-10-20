package com.kskr.spring.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kskr.spring.cdi")
public class CdiApplication {
    static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CdiApplication.class);
        CdiBusiness cdiBusiness = applicationContext.getBean(CdiBusiness.class);

        LOGGER.info("{}", cdiBusiness);
        LOGGER.info("{}", cdiBusiness.getCdiDAO());
    }
}
