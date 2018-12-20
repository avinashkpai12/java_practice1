package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

class IntegerCheckRangeTest {

    @Test
    public void integercheccktest1() throws Exception {
        String expectedValue = "Tom";
        IntegerCheckRange i = new IntegerCheckRange();
        //Act
        String actualValue = i.check(23);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void integercheccktest2() throws Exception {
        String expectedValue = "Jerry";
        IntegerCheckRange i = new IntegerCheckRange();
        //Act
        String actualValue = i.check(28);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

}