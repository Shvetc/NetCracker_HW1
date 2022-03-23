package com.netcracker.projects.tasks.taskoop.geomFigures;

import com.netcracker.projects.validation.Validation;

public class Rectangle implements BaseFigure {
    private float length;
    private float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width) {
        Validation.validate(length);
        Validation.validate(width);

        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        Validation.validate(length);
        this.length = length;
    }

    public void setWidth(float width) {
        Validation.validate(width);
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width + '\'' +
                '}';
    }
}
