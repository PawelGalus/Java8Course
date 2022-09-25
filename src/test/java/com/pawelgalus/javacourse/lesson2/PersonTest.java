package com.pawelgalus.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person person = new Person();

        assertEquals( "Hello World", person.helloWorld() );
    }


}