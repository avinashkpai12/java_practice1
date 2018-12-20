package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void palindromechecktest1() throws Exception {
        String expectedValue = "is a palindrome and the sum of even numbers is less than 25";
        Palindrome pl = new Palindrome();
        //Act
        String actualValue = pl.palindromeCheck(121);
        //Assert
        assertEquals(expectedValue, actualValue);

    }


    @Test
    public void palindromechecktest2() throws Exception {
        String expectedValue = "Not a Palindrome";
        Palindrome pl = new Palindrome();
        //Act
        String actualValue = pl.palindromeCheck(123);
        //Assert
        assertEquals(expectedValue, actualValue);

    }


    @Test
    public void palindromechecktest3() throws Exception {
        String expectedValue = "is a palindrome and the sum of even numbers is greater than 25";
        Palindrome pl = new Palindrome();
        //Act
        String actualValue = pl.palindromeCheck(41822814);
        //Assert
        assertEquals(expectedValue, actualValue);

    }


}