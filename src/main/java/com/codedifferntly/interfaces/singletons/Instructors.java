package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Student;

public class Instructors extends People {
    public static final Instructors INSTANCE = new Instructors();
    private Instructors(){
        Instructor tariq = new Instructor(999, "Tariq");
        Instructor gabriella = new Instructor(995, "Gabriella");
        Instructor iyasu = new Instructor(456, "Iyasu");
        Instructor stephen = new Instructor(987, "Stephen");
        Instructor franKie = new Instructor(225, "FranKie");
        Instructor rahmir = new Instructor(161, "Rahmir");
        Instructor oN = new Instructor(01, "Faith");
        Instructor eugene = new Instructor(556, "uegine");

        add(tariq);
        add(gabriella);
        add(iyasu);
        add(stephen);
        add(franKie);
        add(rahmir);
        add(oN);
        add(eugene);
    }


    public static Instructors getInstance(){
        return INSTANCE;
    }
}