package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCheckTest {

    @Test
    public void letterrecontest1() throws Exception {
        String expectedValue = "Vowel ";
        LetterCheck l = new LetterCheck();
        //Act
        String actualValue = l.lettercheck("a");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void letterrecontest2() throws Exception {
        String expectedValue = "Vowel Consonant Consonant Consonant Vowel ";
        LetterCheck l = new LetterCheck();
        //Act
        String actualValue = l.lettercheck("abcde");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void letterrecontest3() throws Exception {
        String expectedValue = "Vowel Consonant Input not a letter";
        LetterCheck l = new LetterCheck();
        //Act
        String actualValue = l.lettercheck("ap2");
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}