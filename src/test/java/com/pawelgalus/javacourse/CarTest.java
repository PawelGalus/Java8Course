package com.pawelgalus.javacourse;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void primitivesShouldBeEqual() {
        int i = 4;
        int j = 4;

        assertTrue(i == j);
    }

    @Test
    public void stringShouldBeEqual() {
        String hello1 = "Hello";
        String hello2 = "Hello";
        String hello3 = "H";

        hello3 = hello3 + "ello";

        assertTrue(hello1 == hello2);
        assertTrue(hello1.equals(hello3));
    }
}