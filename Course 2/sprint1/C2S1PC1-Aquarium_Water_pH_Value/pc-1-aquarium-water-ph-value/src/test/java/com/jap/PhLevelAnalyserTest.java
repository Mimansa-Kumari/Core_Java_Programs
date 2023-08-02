package com.jap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhLevelAnalyserTest {
    PhLevelAnalyser obj;
    @Before
    public void setUp()  {
    obj=new PhLevelAnalyser();
    }

    @After
    public void tearDown()  {
        obj=null;
    }

    @Test
    public void getPhValueOfWaterForInputPhSeven(){
        String expected="pH value is fine";
        String actual=obj.getPhValueOfWater(7);
        assertEquals(expected,actual);
    }
    @Test
    public void getPhValueOfWaterForInputPhEight(){
        String expected="pH value is fine";
        String actual=obj.getPhValueOfWater(8);
        assertEquals(expected,actual);
    }
    @Test
    public void getPhValueOfWaterForInputPhTen(){
        String expected="pH value is high, partial water change required";
        String actual=obj.getPhValueOfWater(10);
        assertEquals(expected,actual);
    }
}