package com.pawelgalus.javacourse.car;

public class CarSelector {

    public static void main(String[] args) {
    }

    private static boolean isValid(String argument) {
        try {
            CarState carState = CarState.valueOf(argument);
            System.out.println("valid argument: " + argument);
        }
        catch (RuntimeException e) {
            System.out.println("Hello again ;-) " + e.getMessage());
        }
        finally {
            System.out.println("in finally block");
        }
        return true;
    }

}
