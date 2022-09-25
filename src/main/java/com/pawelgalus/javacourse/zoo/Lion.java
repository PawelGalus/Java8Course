package com.pawelgalus.javacourse.zoo;

public class Lion extends Animal implements Loggable, Printable {

    public void eat() {
        System.out.println("lion is eating...");
    }

    public void print() {
        System.out.println("printable...");
    }

    public String message() {
        return "something";
    }
}