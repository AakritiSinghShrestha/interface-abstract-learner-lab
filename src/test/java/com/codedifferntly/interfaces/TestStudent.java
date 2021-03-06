package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

//Create a TestStudent class.
//Create a testImplementation method that asserts that a Student is an instanceof a Learner.
//Create a testInheritance method that asserts that a Student is an instanceof a Person.
//Create a testLearn method that ensures a Student's totalStudyTime instance variable is
// incremented by the specified numberOfHours by invoking the .learn method.
public class TestStudent {



    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(435, "Micheal");

        //When
        boolean actual = student instanceof Learner;
        //Then
        Assert.assertEquals(true,actual);
    }


    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(435, "Micheal");

        //When
        boolean actual = student instanceof Person;
        //Then
        Assert.assertEquals(true,actual);
    }
    @Test
    public void testLearn() {
        //Given
        Student student = new Student(435, "Micheal");
        student.learn(10.0);
        //When
        double expected =10.0;
        double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected,actual,0.01);
    }
}
