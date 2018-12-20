package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void stringReverseTest1() throws Exception{
        String expectedValue = "nodnol";

        StringReverse strrev = new StringReverse();

        String actualValue = strrev.reverse("london");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void stringReverseTest2() throws Exception{
        String expectedValue = "hsaniva";

        StringReverse strrev = new StringReverse();

        String actualValue = strrev.reverse("avinash");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void stringReverseTest3() throws Exception{
        String expectedValue = "654321";

        StringReverse strrev = new StringReverse();

        String actualValue = strrev.reverse("123456");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void stringReverseTest4() throws Exception{
        String expectedValue = "321dcba";

        StringReverse strrev = new StringReverse();

        String actualValue = strrev.reverse("abcd123");

        assertEquals(expectedValue, actualValue);
    }

}