package com.pawelgalus.javacourse.car;

public class CarService {

    public void drive() {

        Car[] cars = {new BMW(new  Name("Paul", "Galus"), new Color("red")), new Porsche(""), new Mercedes(), };
        for(Car car : cars) {
            car.drive();
        }
    }
}
