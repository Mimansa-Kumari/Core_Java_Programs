package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseDigitTest {
ReverseDigit obj;
    @Before
    public void setUp() {
    obj=new ReverseDigit();
    }
    @After
    public void tearDown() {
    obj=null;
    }
    @Test
    public void givenInputPositiveNumberReverseTheDigit(){
        int expected=54321;
        int actual=obj.getReverse(12345);
        assertEquals(expected,actual);
    }
    @Test
    public void givenInputNegativeNumberReverseTheDigit(){
        int expected=-54321;
        int actual=obj.getReverse(-12345);
        assertEquals(expected,actual);
    }
}