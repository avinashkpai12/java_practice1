package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class guessnumberTest {
    @Test
    public void guessnumbertest() throws Exception {
        String expectedValue = "Number guessed matches the original number";
        guessnumber gn = new guessnumber();
        //Act
        String actualValue = gn.guess(76);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}