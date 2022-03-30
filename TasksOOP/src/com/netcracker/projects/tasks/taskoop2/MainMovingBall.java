package com.netcracker.projects.tasks.taskoop2;

import com.netcracker.projects.tasks.taskoop2.movingBall.Ball;
import com.netcracker.projects.tasks.taskoop2.movingBall.Container;

//Example work with methods class Container, Ball
public class MainMovingBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 10, 15, -45);
        Container box = new Container(0, 0, 200, 200);

        while (box.collides(ball)) {
            System.out.println(ball);
            ball.move();
        }
        System.out.println("Last coordinates: " + ball);
    }
}
