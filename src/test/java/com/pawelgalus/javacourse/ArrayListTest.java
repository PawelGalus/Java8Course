package com.pawelgalus.javacourse;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    private final int INITIAL_CAPACITY = 100;

    @Test
    public void shouldDemonstrateArrayList() {
        List<String> elements = new ArrayList<>(INITIAL_CAPACITY);

        elements.add("A");
        elements.add("B");
        elements.add("A");
        elements.add("C");
        elements.add("E");
        elements.add("E");
        elements.add(0, "T");
        elements.add(2, "S");

        elements.remove("A");
        elements.remove(1);
        System.out.println(elements.size());
        System.out.println(elements.isEmpty());
        System.out.println(elements.indexOf("E"));
        System.out.println(elements.lastIndexOf("E"));

        elements.clear();

        for (String str : elements) {
            System.out.println(str);
        }

        System.out.println(elements);
    }
}