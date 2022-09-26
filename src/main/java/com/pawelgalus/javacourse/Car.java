package com.pawelgalus.javacourse;

public class Car {

    private Vin vehicleIdentificationNumber;
    private Manufacturer manucacturer;
    private Engine engine;
    private Color color;
    private int numberOfWheels;

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

        Car other = (Car) obj;

        if(!manucacturer.equals(other.manucacturer)) {
            return false;
        }
        if(!engine.equals(other.engine)) {
            return false;
        }
        if(!color.equals(other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + manucacturer.hashCode();
        result = 31 * result + engine.hashCode();
        return 31 * result + color.hashCode();
    }
}