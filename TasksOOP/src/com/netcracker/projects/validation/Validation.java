package com.netcracker.projects.validation;

import com.netcracker.projects.tasks.taskoop.geomFigures.MyPoint;

import java.util.InputMismatchException;

public class Validation {
    static public void validate(double value) {
        if (value <= 0) {
            throw new InputMismatchException("The argument is not valid");
        }
    }

    static public void validate(int value) {
        if (value <= 0) {
            throw new InputMismatchException("The argument is not valid");
        }
    }

    static public void validate(String string) {
        if (string.isEmpty()) {
            throw new InputMismatchException("The string argument is empty");
        }
    }

    //Checking for the existence of a triangle
    static public void validate(MyPoint point1, MyPoint point2, MyPoint point3) {
        if (point1 == null || point2 == null || point3 == null) {
            throw new InputMismatchException("The point is empty");
        }

        validate(point1.getX(), point1.getY(), point2.getX(), point2.getY(), point3.getX(), point3.getY());
    }

    static public void validate(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (((x1 == x2) && (x2 == x3)) || ((y1 == y2) && (y2 == y3)) || ((x1 == y1) && (x2 == y2) && (x3 == y3))) {
            throw new InputMismatchException("Triangle with these arguments cannot be created");
        }
    }
}
