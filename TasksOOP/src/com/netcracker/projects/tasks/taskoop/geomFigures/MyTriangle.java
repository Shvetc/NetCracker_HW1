package com.netcracker.projects.tasks.taskoop.geomFigures;

import com.netcracker.projects.operation.Operation;
import com.netcracker.projects.validation.Validation;

public class MyTriangle {
    private MyPoint v1, v2, v3;
    private double[] sides;

    private enum type {
        Equilateral,
        Isosceles,
        Scalene
    }

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Validation.validate(x1, y1, x2, y2, x3, y3);
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
        setSides();
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        Validation.validate(v1, v2, v3);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        setSides();
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                ']';
    }

    private void setSides() {
        double sideLengthAB = v1.distance(v2);
        double sideLengthBC = v2.distance(v3);
        double sideLengthAC = v3.distance(v1);
        sides = new double[]{sideLengthAB, sideLengthBC, sideLengthAC};
    }

    public double getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }

    public String getType() {
        if (Operation.IsComparable(sides[0], sides[1]) && Operation.IsComparable(sides[1], sides[2])) {
            return type.Equilateral.name();
        } else if (Operation.IsComparable(sides[0], sides[1]) || Operation.IsComparable(sides[1], sides[2]) ||
                Operation.IsComparable(sides[0], sides[2])) {
            return type.Isosceles.name();
        }

        return type.Scalene.name();
    }
}
