package com.practice.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubStringTest {

    @Test
    public void addSubStrTest() throws Exception{
        String expectedValue = "Stackrouterouterouterouterouteroute";

        SubString sb = new SubString();

        String actualValue = sb.addsubstr("Stackroute",5);

        assertEquals(expectedValue, actualValue);
    }

}