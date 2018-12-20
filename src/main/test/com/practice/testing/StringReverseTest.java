package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void stringReverseTest() throws Exception{
        String expectedValue = "nodnol";

        StringReverse strrev = new StringReverse();

        String actualValue = strrev.reverse("london");

        assertEquals(expectedValue, actualValue);
    }

}