package com.netcracker.projects.tasks.horstmann.chapter2;

import java.util.InputMismatchException;

public class Car {
    private double x;
    private double miles;
    private double gallons;
    private double milesGallons;

    public Car(double milesGallons) {
        this.milesGallons = milesGallons;
    }

    public void refuelCar(double gallons) {
        this.gallons += gallons;
    }

    public void move(double newMiles) {
        if (newMiles < 0) {
            throw new InputMismatchException("Miles are not valid");
        }
        double increaseDistance = 2.0;
        while (gallons >= milesGallons) {
            if (newMiles == 0) break;
            x += increaseDistance;
            this.miles++;
            newMiles--;
            gallons -= milesGallons;
        }
    }

    public double getMiles() {
        if (gallons < 0) throw new InputMismatchException("Gallons are not valid");
        return miles;
    }

    public double getGallons() {
        return gallons;
    }

    public double getX() {
        return x;
    }
}
