package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class loopnumberTest {
    @Test
    public void testLoopNumer() throws Exception{
        String expectedValue="122333";
        loopnumber ln = new loopnumber();
        //Act
        String actualValue= ln.loop(3);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

}