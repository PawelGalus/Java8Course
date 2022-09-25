package com.pawelgalus.javacourse.car;

public class Name implements  Cloneable {

    private String firstName;
    private String lastName;

    public static Name newInstance(Name name) {
        return new Name(name.firstName, name.lastName);
    }

    public Name(Name name) {
        this.firstName = name.firstName;
        this.lastName = name.lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName() {
        return this.firstName;
    }

    public String lastName() {
        return this.lastName;
    }

    public String name() {
        return firstName + " " + lastName;
    }

    public void alterTo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name clone() {
        try {
            return (Name) super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
