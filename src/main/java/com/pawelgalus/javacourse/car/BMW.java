package com.pawelgalus.javacourse.car;

public class BMW implements Car, Cloneable {

    private Name ownersName;
    private Color color;

    public static BMW newInstance(BMW bmw) {
        return new BMW(Name.newInstance(bmw.ownersName), Color.newInstance(bmw.color));
    }

    public BMW(BMW bmw) {
        this.ownersName = new Name(bmw.ownersName);
        this.color = new Color(bmw.color);
    }

    public BMW(Name ownersName, Color color) {
        this.ownersName = ownersName;
        this.color = color;
    }

    public void paint(Color newColor) {
        // this.color = newColor
        this.color.alterColor(newColor.name());
    }

    public void sellTo(Name newOwner) {
        // this.ownersName = newOwner;
        this.ownersName.alterTo(newOwner.firstName(), newOwner.lastName());
    }

    public void drive() {
        System.out.println("BMW driving...");
    }

    public String asString() {
        return "BMW of " + ownersName.name() + " has color: " + color.name();
    }

    public BMW clone() {
        try {
            BMW bmw = (BMW) super.clone();
            bmw.ownersName = ownersName.clone();
            bmw.color = color.clone();
            return bmw;
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError(); // can never happen
        }
    }

    public int value() {
        return 80000;
    }

    public String owner() {
        return "Paul";
    }
    public String message() {
        return "I am the car of Paul";
    }
}