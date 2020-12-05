package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        //Given
        People people = new People();
        Person person = new Person(221l,"Aakashi");

        //When
        people.add(person);
        int expected = 1;
        int actual = people.getCount();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        //Given
        People people = new People();
        Person person = new Person(221l,"Aakashi");

        //When
        people.remove(person.getId());
        int expected = 0;
        int actual = people.getCount();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindById(){
        //Given
        People people = new People();
        Person person = new Person(221l,"Aakashi");
        people.add(person);

        //When
        Person expected = person;
        Person actual = people.findById(person.getId());

        //Then
        Assert.assertEquals(expected,actual);
    }
}
