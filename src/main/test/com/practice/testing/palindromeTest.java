package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {

    @Test
    public void palindromechecktest() throws Exception {
        String expectedValue = "is a palindrome and the sum of even numbers is less than 25";
        palindrome pl = new palindrome();
        //Act
        String actualValue = pl.palindromeCheck(121);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

}