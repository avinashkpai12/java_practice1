package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumSortedNumsTest {

    @Test
    public void evenSumSortedTest() throws Exception{
        String expectedValue = "false";

        SumSortedNums sumt = new SumSortedNums();

        String actualValue = sumt.evenSortedSum("1234");

        assertEquals(expectedValue, actualValue);

    }

}