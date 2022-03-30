package com.netcracker.projects.tasks.taskoop;

import com.netcracker.projects.tasks.taskoop.geomFigures.MyPoint;

//Example work with methods class MyPoint
public class MainPoint {
    public static void main(String[] args) {
        MyPoint pointFirst = new MyPoint();
        MyPoint pointSecond = new MyPoint(4.0, 2.0);

        outputInfoAboutPoints(pointFirst, pointSecond);
    }

    static void outputInfoAboutPoints(MyPoint pointFirst, MyPoint pointSecond) {
        //Output coordinates of points
        System.out.println("P1" + pointFirst.toString());
        System.out.println("P2" + pointSecond.toString());

        //Example work of method 'distance' between points
        System.out.println("Distance between P1 and P2: " + pointFirst.distance(pointSecond));
    }
}
