package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class integerTest {

    @Test
    public void integercheccktest() throws Exception {
        String expectedValue = "Tom";
        integer i = new integer();
        //Act
        String actualValue = i.check(23);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

}