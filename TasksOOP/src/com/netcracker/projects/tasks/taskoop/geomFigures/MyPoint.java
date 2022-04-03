package com.netcracker.projects.tasks.taskoop.geomFigures;

import java.util.Objects;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        double[] coordinateArray = new double[]{x, y};

        return coordinateArray;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(double x, double y) {
        double dist = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

        return dist;
    }

    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    public double distance() {
        return distance(0, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return Double.compare(myPoint.x, x) == 0 && Double.compare(myPoint.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) x;
        result = 31 * result + (int) y;
        return result;
    }
}
