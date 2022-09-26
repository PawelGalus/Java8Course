package com.pawelgalus.javacourse;

public class Vin {

    private String vinField;

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

        Vin other = (Vin) obj;

        if(vinField == null) {
            if(other.vinField != null) {
                return false;
            }
        }
        else if(!vinField.equals(other.vinField)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        return 31 * result + ((vinField == null) ? 0 : vinField.hashCode());
    }
}
