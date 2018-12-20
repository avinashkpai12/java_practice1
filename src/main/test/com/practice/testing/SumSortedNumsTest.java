package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumSortedNumsTest {

    @Test
    public void evenSumSortedTest1() throws Exception{
        String expectedValue = "false";

        SumSortedNums sumt = new SumSortedNums();

        String actualValue = sumt.evenSortedSum("1234");

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void evenSumSortedTest2() throws Exception{
        String expectedValue = "true";

        SumSortedNums sumt = new SumSortedNums();

        String actualValue = sumt.evenSortedSum("23658");

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void evenSumSortedTest3() throws Exception{
        String expectedValue = "false";

        SumSortedNums sumt = new SumSortedNums();

        String actualValue = sumt.evenSortedSum("1357");

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void evenSumSortedTest4() throws Exception{
        String expectedValue = "true";

        SumSortedNums sumt = new SumSortedNums();

        String actualValue = sumt.evenSortedSum("8976428");

        assertEquals(expectedValue, actualValue);

    }

}