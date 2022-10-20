package com.kskr.spring.basics;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BinarySearchImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int key) {
        //Implement Sorting Logic
        //If I want to use bubble sort or quick sort, then above implementation has to change which means tight coupling
        //So, create another class for bubble sort

        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        //search the array
        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("post-construct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("pre-destroy");
    }
}
