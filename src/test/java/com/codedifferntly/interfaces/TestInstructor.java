package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

//Create a TestInstructor class.
//Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
//Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
//Create a testTeach method that ensures when an Instructor invokes the teach method, a respective student's
// totalStudyTime instance variable is incremented by the specified numberOfHours.
//Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective array
// of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
public class TestInstructor {
    @Test
    public void TestImplementation(){
        //Given
        Instructor instructor = new Instructor(960,"Danielle");
        //when
        boolean actual = instructor instanceof Teacher;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void TestInheritance(){
        //Given
        Instructor instructor = new Instructor(960,"Danielle");
        //when
        boolean actual = instructor instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    //Create a testTeach method that ensures when an Instructor invokes the teach method, a respective student's
// totalStudyTime instance variable is incremented by the specified numberOfHours.
    @Test
    public void TestTeach(){
        //Given
        Instructor instructor = new Instructor(960,"Danielle");
        Student student = new Student(8,"Riya");
        instructor.teach(student,10);

        //when
        double actual = 11;
        double expected = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,0.01);
    }

    //Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective array
// of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
    @Test
    public void TestLecture(){
        //Given
        Instructor instructor = new Instructor(960,"Tariq");

        Student aakriti = new Student(11,"Aakriti");
        Student holly = new Student(12,"Holly");
        Student linda= new Student(13,"Linda");
        Student celita = new Student(14,"Celita");
        Student[] students= {aakriti,holly,linda,celita};

        instructor.lecture(students,40);
        //when
        double actual = 11;
        double expected = aakriti.getTotalStudyTime() ;


        //Then
        Assert.assertEquals(actual,expected,0.01);
    }
}
