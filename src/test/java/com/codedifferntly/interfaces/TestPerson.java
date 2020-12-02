package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;


//Create a testConstructor method which ensures that a Person object's id field is being set upon construction.
//Create a testSetName method which ensures that a Person object's name variable is being set by invoking the .setName method.

public class TestPerson {
    @Test
    public void constructorIdTest(){
        //Given
        Person person = new Person(234l,"Mike");

        //When
long expected = 234l;
long actual = person.getId();
        //Then
        Assert.assertEquals(expected,actual);
    }



    @Test
    public void constructorNameTest(){
        //Given
        Person person = new Person(234l,"Mike");

        //When
        String expected = "Mike";
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setNameTest(){
        //Given
        Person person = new Person(234l,"Mike");
        person.setName("Sam");
        //When
        String expected = "Sam";
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected,actual);
    }

}
