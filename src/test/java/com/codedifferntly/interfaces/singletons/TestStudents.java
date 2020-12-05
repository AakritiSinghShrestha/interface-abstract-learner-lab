package com.codedifferntly.interfaces.singletons;


import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents(){
        //Given
        Students student = Students.getInstance();

        //When
        int expected =7;
        int actual =student.getCount();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
