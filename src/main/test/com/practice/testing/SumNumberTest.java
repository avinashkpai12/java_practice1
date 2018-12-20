package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumNumberTest {

    @Test
    public void addNumberTest() throws Exception{
        int expectedValue = 41;

        SumNumber snum = new SumNumber();

        int actualValue = snum.addNum("12 23 2 4");

        assertEquals(expectedValue, actualValue);
    }

}