package com.netcracker.projects.tasks.taskoop;

import com.netcracker.projects.tasks.taskoop.geomFigures.MyTriangle;

//Example work with methods class MyTriangle
public class MainTriangle {
    public static void main(String[] args) {
        MyTriangle scaleneTriangle = new MyTriangle(0, 1, 2, 2, 3, 5);
        MyTriangle isoscelesTriangle = new MyTriangle(0, 0, 4, 0, 2, 3);
        MyTriangle equilateralTriangle = new MyTriangle(0, 0, 4, 0, 2, 2 * Math.sqrt(3));

        MyTriangle[] triangles = new MyTriangle[]{scaleneTriangle, isoscelesTriangle, equilateralTriangle};
        //Triangles that can't be created
        //MyTriangle triangle2 = new MyTriangle(1,1,2,2,3,3);
        //MyTriangle triangle3 = new MyTriangle(1,2,1,3,1,5);

        //Output triangles with different coordinates
        for (MyTriangle triangle : triangles) {
            outputInfoAboutTriangle(triangle);
        }
    }

    static void outputInfoAboutTriangle(MyTriangle triangle) {
        System.out.println(triangle.toString());
        System.out.println("The type of triangle is: " + triangle.getType());
        System.out.println("The Perimeter=" + triangle.getPerimeter() + "\n");
    }
}
