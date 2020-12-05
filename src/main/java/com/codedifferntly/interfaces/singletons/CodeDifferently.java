package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.Teacher;

public class CodeDifferently {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){

    }
    public void hostLecture(long id, double numberOfHours){

    }
}
