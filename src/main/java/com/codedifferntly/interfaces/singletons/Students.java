package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Student;

public final class Students extends People {
    public static final Students INSTANCE = new Students();
    private Students(){
        Student aakriti = new Student(111,"Aakriti");
        Student danielle = new Student(222,"danielle");
        Student michael = new Student(333,"michael");
        Student sam = new Student(444,"sam");
        Student abi = new Student(555,"abi");
        Student lachelle = new Student(666,"lachelle");
        Student victor = new Student(777,"victor");

        add(aakriti);
        add(danielle);
        add(michael);
        add(sam);
        add(abi);
        add(lachelle);
        add(victor);
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
