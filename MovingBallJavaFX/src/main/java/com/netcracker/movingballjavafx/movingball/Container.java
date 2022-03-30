package com.netcracker.movingballjavafx.movingball;

public class Container {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return Math.abs(x2-x1);
    }

    public int getHeight() {
        return Math.abs(y2 -y1);
    }

    public boolean collides(Ball ball) {
        if (((ball.getX() + ball.getRadius()) > x2) || ((ball.getX() + ball.getRadius()) < getX())) {
            ball.reflectHorizontal();
        } else if (((ball.getY() + ball.getRadius()) < getY()) || ((ball.getY() + ball.getRadius()) > y2)) {
            ball.reflectVertical();
        }

        return true;
    }

    @Override
    public String toString() {
        return "Container[" + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
