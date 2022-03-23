package com.netcracker.projects.tasks.taskoop2.movingBall;

import java.util.InputMismatchException;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed * Math.cos(Math.PI*direction/180));;
        this.yDelta = (float) (-speed * Math.sin(Math.PI*direction/180));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void setRadius(int radius) {
        if (radius <= 0 ) throw new InputMismatchException("The radius is not valid");
        this.radius = radius;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[" + "(" + x + "," + y + "), speed=(" + xDelta + "," + yDelta + ")]";
    }
}
