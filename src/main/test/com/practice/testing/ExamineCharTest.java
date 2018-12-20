package com.practice.testing;



import org.junit.Test;

import static org.junit.Assert.*;

public class ExamineCharTest {

    @Test
    public void examinestrtest1() throws Exception{
        String expectedValue="Capital Letter";
        ExamineChar ex = new ExamineChar();
        //Act
        String actualValue= ex.examinestr("A");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void examinestrtest2() throws Exception{
        String expectedValue="Small Letter";
        ExamineChar ex = new ExamineChar();
        //Act
        String actualValue= ex.examinestr("a");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void examinestrtest3() throws Exception{
        String expectedValue="Digit";
        ExamineChar ex = new ExamineChar();
        //Act
        String actualValue= ex.examinestr("3");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void examinestrtest4() throws Exception{
        String expectedValue="Special Character";
        ExamineChar ex = new ExamineChar();
        //Act
        String actualValue= ex.examinestr("&");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

}