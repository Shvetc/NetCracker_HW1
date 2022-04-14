package com.netcracker.projects.tasks.horstmann;

import com.netcracker.projects.tasks.horstmann.chapter2.Point;

public class MainPoint {
    public static void main(String[] args) {
        Point point = new Point();
        Point point2 = point.translate(1, 3);
        Point point3 = point2.scale(0.5);

        printInfoAboutPoint(point, point3);
    }

    static void printInfoAboutPoint(Point p1, Point p2) {
        System.out.println("My current point with current coordinates: " + p1.toString());
        System.out.println("My new point after translate(1, 3) and scale(0.5) methods: " + p2.toString());
    }
}
