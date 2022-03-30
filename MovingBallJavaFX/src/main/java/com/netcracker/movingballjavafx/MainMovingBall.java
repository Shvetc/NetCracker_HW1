package com.netcracker.movingballjavafx;

import com.netcracker.movingballjavafx.movingball.Ball;
import com.netcracker.movingballjavafx.movingball.Container;
import com.netcracker.movingballjavafx.movingball.MoveBall;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMovingBall extends Application {
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        Ball ball = new Ball(0, 0, 10, 15, 45);
        Circle circle = create2dBall(ball);

        Container box = new Container(0, 0, 200, 200);
        Line lineA = createSide(box.getX(), box.getX(), box.getY(), box.getHeight());
        Line lineB = createSide(box.getWidth(), box.getWidth(), box.getY(), box.getHeight());
        Line lineC = createSide(box.getX(), box.getWidth(), box.getY(), box.getY());
        Line lineD = createSide(box.getX(), box.getWidth(), box.getHeight(), box.getHeight());

        Group root = new Group();
        root.getChildren().addAll(circle, lineA, lineB, lineC, lineD);
        stage.setScene(new Scene(root, 500, 500, Color.BEIGE));
        stage.show();

        MoveBall moveBall = new MoveBall(circle, ball, box);
        Thread myThready = new Thread(moveBall);
        myThready.start();
    }

    static Circle create2dBall(Ball ball) {
        //Creating Circle
        Circle circle = new Circle();

        circle.setCenterX(ball.getX());
        circle.setCenterY(ball.getY());
        circle.setRadius(ball.getRadius());

        circle.setFill(Color.DARKCYAN);
        circle.setStrokeWidth(4.0);
        circle.setStroke(Color.DARKSLATEGREY);

        return circle;
    }

    static Line createSide(int xFirst, int xEnd, int yFirst, int yEnd) {
        //Creating Line
        Line line = new Line();

        //Setting the properties of the line
        line.setStartX(xFirst);
        line.setStartY(yFirst);
        line.setEndX(xEnd);
        line.setEndY(yEnd);

        //Setting other properties
        line.setFill(Color.DARKCYAN);
        line.setStrokeWidth(4.0);
        line.setStroke(Color.DARKSLATEGREY);

        return line;
    }

    public static void main(String[] args) {
        launch();
    }
}