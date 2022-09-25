package com.pawelgalus.javacourse.lesson2;

import com.pawelgalus.javacourse.lesson3.Name;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person () {
        personCounter++;
    }

    public Person(Name personName) {
        this.personName = personName;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPerson() {
        return personCounter;
    }

}