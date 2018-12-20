package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubStringTest {

    @Test
    public void addSubStrTest1() throws Exception{
        String expectedValue = "Stackrouterouterouterouterouteroute";

        SubString sb = new SubString();

        String actualValue = sb.addsubstr("Stackroute",5);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addSubStrTest2() throws Exception{
        String expectedValue = "applelele";

        SubString sb = new SubString();

        String actualValue = sb.addsubstr("apple",2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addSubStrTest3() throws Exception{
        String expectedValue = "avinashashashash";

        SubString sb = new SubString();

        String actualValue = sb.addsubstr("avinash",3);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addSubStrTest4() throws Exception{
        String expectedValue = "Manipalipalipalipalipal";

        SubString sb = new SubString();

        String actualValue = sb.addsubstr("Manipal",4);

        assertEquals(expectedValue, actualValue);
    }

}