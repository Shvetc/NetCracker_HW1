package com.netcracker.projects.tasks.horstmann.chapter2;

final public class Point {
    double x;
    double y;

    public Point() {
        x = 3;
        y = 4;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double newX, double newY) {
        return new Point(getX() + newX, getY() + newY);
    }

    public Point scale(double scaleValue) {
        return new Point(getX() * scaleValue, getY() * scaleValue);
    }

    @Override
    public String toString() {
        return "Point(" + x + "," + y + ')';
    }
}
