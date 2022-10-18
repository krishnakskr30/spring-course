package com.kskr.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

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
}
