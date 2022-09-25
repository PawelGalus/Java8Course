package com.pawelgalus.javacourse.car;

public class Color {
    private String colorName;

    public static Color newInstance(Color color) {
        return new Color(color.colorName);
    }

    public Color(Color color) {
        this.colorName = color.colorName;
    }

    public Color(String colorName) {
        this.colorName = colorName;
    }

    public String name() {
        return this.colorName;
    }

    public void alterColor(String colorName) {
        this.colorName = colorName;
    }

    public Color clone() {
        try {
            return (Color) super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError(); // can never happen
        }
    }
}
