package com.netcracker.projects.tasks.taskoop.geomFigures;

import com.netcracker.projects.validation.Validation;

public class Circle implements BaseFigure {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        Validation.validate(radius);
        Validation.validate(color);

        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {

        return this.radius;
    }

    public String getColor() {

        return this.color;
    }

    public void setRadius(double radius) {
        Validation.validate(radius);
        this.radius = radius;
    }

    public void setColor(String color) {
        Validation.validate(color);
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color + '\'' +
                '}';
    }
}
