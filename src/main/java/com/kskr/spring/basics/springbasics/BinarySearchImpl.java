package com.kskr.spring.basics.springbasics;

public class BinarySearchImpl {
    public int binarySearch(int[] numbers, int key) {
        //Implement Sorting Logic
        //If I want to use bubble sort or quick sort, then above implementation has to change which means tight coupling
        //So, create another class for bubble sort

        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        //search the array
        return 3;
    }
}
