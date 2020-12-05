package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.Instructor;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test

    public void TestInstructors(){
        //Given
        Instructors instructors = Instructors.getInstance();

        //When
        int expected = 8;
        int actual = instructors.getCount();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
