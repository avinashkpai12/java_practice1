package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopNumberTest {
    @Test
    public void testLoopNumer1() throws Exception{
        String expectedValue="122333";
        LoopNumber ln = new LoopNumber();
        //Act
        String actualValue= ln.loop(3);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testLoopNumer2() throws Exception{
        String expectedValue="1223334444";
        LoopNumber ln = new LoopNumber();
        //Act
        String actualValue= ln.loop(4);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testLoopNumer3() throws Exception{
        String expectedValue="1";
        LoopNumber ln = new LoopNumber();
        //Act
        String actualValue= ln.loop(1);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

}