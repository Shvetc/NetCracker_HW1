package com.netcracker.projects.tasks.taskoop;

import com.netcracker.projects.tasks.taskoop.employee.Employee;
import com.netcracker.projects.tasks.taskoop.geomFigures.Circle;
import com.netcracker.projects.tasks.taskoop.geomFigures.Rectangle;

//Example work with methods class Circle, Rectangle
public class MainFigures {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2.0);
        circle.setColor("green");

        outputInfoAboutFigure (circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(3.0f);
        rectangle.setWidth(4.0f);

        outputInfoAboutFigure (rectangle);
    }

    static void outputInfoAboutFigure(Circle circle){
        System.out.println("Output radius and color of circle by default: " + circle.toString());
        System.out.println("Example calling calculateArea() with input arguments: " + circle.calculateArea() + "\n");
    }

    static void outputInfoAboutFigure(Rectangle rectangle){
        System.out.println("Output length and width of rectangle after setting arguments: " + rectangle.toString());
        System.out.println("Example calling calculateArea() with input arguments: " + rectangle.calculateArea());
        System.out.println("Example calling calculateParameter(): " + rectangle.calculatePerimeter() + "\n");
    }
}
