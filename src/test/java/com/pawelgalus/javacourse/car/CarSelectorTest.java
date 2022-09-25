package com.pawelgalus.javacourse.car;

import org.junit.Test;

public class CarSelectorTest {

    @Test
    public void shouldCallMain() {
        String[] arguments = {"BMW", "Porsche"};
        CarSelector.main(arguments);
    }
}