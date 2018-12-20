package com.practice.testing;



import org.junit.Test;

import static org.junit.Assert.*;

public class examineTest {

    @Test
    public void examinestrtest() throws Exception{
        String expectedValue="Capital Letter";
        examine ex = new examine();
        //Act
        String actualValue= ex.examinestr("A");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

}