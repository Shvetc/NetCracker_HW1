package com.netcracker.movingballjavafx.movingball;

import javafx.scene.shape.Circle;

public class MoveBall implements Runnable {
    private final Circle circle;
    private final Ball ball;
    private final Container box;

    public MoveBall(Circle circle, Ball ball, Container box) {
        this.circle = circle;
        this.ball = ball;
        this.box = box;
    }

    @Override
    public void run() {
        while (box.collides(ball)) {
            System.out.println(ball.toString());

            ball.move();
            circle.setTranslateX(ball.getY());
            circle.setTranslateY(ball.getX());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
