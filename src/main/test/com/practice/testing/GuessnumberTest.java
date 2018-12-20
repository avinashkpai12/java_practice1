package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessnumberTest {
    @Test
    public void guessnumbertest() throws Exception {
        String expectedValue = "Number guessed matches the original number";
        Guessnumber gn = new Guessnumber();
        //Act
        String actualValue = gn.guess(76);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}