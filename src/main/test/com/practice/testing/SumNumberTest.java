package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumNumberTest {

    @Test
    public void addNumberTest1() throws Exception{
        int expectedValue = 41;

        SumNumber snum = new SumNumber();

        int actualValue = snum.addNum("12 23 2 4");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addNumberTest2() throws Exception{
        int expectedValue = 0;

        SumNumber snum = new SumNumber();

        int actualValue = snum.addNum("-1 1 -1 1");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addNumberTest3() throws Exception{
        int expectedValue = -9;

        SumNumber snum = new SumNumber();

        int actualValue = snum.addNum("12 -23 -2 4");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addNumberTest4() throws Exception{
        int expectedValue = 10;

        SumNumber snum = new SumNumber();

        int actualValue = snum.addNum("0 1 2 3 4");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addNumberTest5() throws Exception{
        int expectedValue = 10;

        SumNumber snum = new SumNumber();

        int actualValue = snum.addNum("-3 -2 -1 0 1 2 3 10");

        assertEquals(expectedValue, actualValue);
    }

}