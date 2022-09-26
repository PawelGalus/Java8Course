package com.pawelgalus.javacourse;

public class Manufacturer {

    private String name;

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

        Manufacturer other = (Manufacturer) obj;

        if(name == null) {
            if(other.name != null) {
                return false;
            }
        }
        else if(!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        return 31 * result + ((name == null) ? 0 : name.hashCode());
    }
}
