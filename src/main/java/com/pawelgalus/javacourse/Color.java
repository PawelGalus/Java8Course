package com.pawelgalus.javacourse;

public class Color {

    private String color;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }

        Color other = (Color) obj;

        if(color == null) {
            if(other.color != null) {
                return false;
            }
        }
        else if(!color.equals(other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        return 31 * result + ((color == null) ? 0 : color.hashCode());
    }
}
