package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class letterTest {

    @Test
    public void letterrecontest() throws Exception {
        String expectedValue = "Vowel";
        letter l = new letter();
        //Act
        String actualValue = l.lettercheck("a");
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}