package com.pawelgalus.javacourse.lesson2;

import com.pawelgalus.javacourse.lesson10.LoggingLevel;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    private static final int PENDING = 40;
    private static final int PROCESSING = 41;
    private static final int PROCESSED = 42;

    public String[] states() {
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

    @Test
    public void shouldReturnHelloWorld() {
        Person person = new Person();

        assertEquals( "Hello World", person.helloWorld() );
    }

    @Test
    public void shouldReturnHelloPaul() {
        Person person = new Person();

        assertEquals( "Hello Paul", person.hello("Paul") );
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();

        assertEquals( 2, Person.numberOfPerson() );
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop() {
        Person person;
        int j = 0;
        int k = 0;

        for( int i = 0; i < 4; i++ ) {
            person = new Person();
        }

        assertEquals( 4, Person.numberOfPerson() );

        while( j < 4 ) {
            person = new Person();
            j++;
        }

        assertEquals( 8, Person.numberOfPerson() );

        do {
            person = new Person();
            k++;
        } while (k < 4);

        assertEquals( 12, Person.numberOfPerson() );
    }

    @Test
    public void demonstrateArrays() {
        Person[] people = new Person[4];

        people[0] = new Person();
        people[1] = new Person();
        people[2] = new Person();
        people[3] = new Person();

        for( int i = 0; i < people.length; i++ ) {
            people[i] = new Person();
        }

        for( Person person : people ) {
            person.helloWorld();
        }

        Person myPerson1 = new Person();
        Person myPerson2 = null;

        Person[] persons = {people[0], people[3], myPerson1, myPerson2, people[2], people[1]};

        LoggingLevel states = LoggingLevel.PROCESSING;

        int myState = PENDING;

        switch ( myState ) {
            case PENDING:
                //call a method
                break;
            case PROCESSING:
                //call a method
                break;
            case PROCESSED:
                //call a method
                break;
            default:
                //throw Error
        }

        for ( LoggingLevel state : LoggingLevel.values() ) {
            if( state == LoggingLevel.PENDING ) {
                // call a method
            }
            if( state == LoggingLevel.PROCESSING ) {
                // call a method
            }
            if( state == LoggingLevel.PROCESSED ) {
                // call a method
            }

        }
    }

}