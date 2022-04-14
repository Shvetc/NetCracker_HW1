package com.netcracker.projects.tasks.horstmann;

import com.netcracker.projects.tasks.horstmann.chapter2.Car;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car(1.0);
        printInfoAboutCar(car);
    }

    static void printInfoAboutCar(Car car) {
        car.refuelCar(5);
        System.out.println("Initial number of gallons to the gas tank: " + car.getGallons());
        car.move(4);
        System.out.println("Current miles: " + car.getMiles());
        System.out.println("Current distance from the origin: " + car.getX() + " and fuel level: " + car.getGallons());

    }
}
