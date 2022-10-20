package com.kskr.spring.basics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringBasicsApplication.class)
public class BinarySearchTest {
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int actualResult = binarySearch.binarySearch(new int[]{1, 2, 3}, 3);
        int expectedResult = 3;
        assertEquals(actualResult, expectedResult);
    }
}
