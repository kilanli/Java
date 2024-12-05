package com.example.slayt12;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
    private final double radius=20.0;
    private double x=20.0,y=20.0;
    private double dx=1,dy=1;
    private Circle circle=new Circle(x,y,radius);
    private Timeline animation;

    public BallPane()
    {
        circle.setFill(Color.BLUE);
        this.getChildren().add(circle);
        EventHandler<ActionEvent> handler=event->{MoveBall();};
        animation =new Timeline(new KeyFrame(Duration.millis(6),handler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }
    private void MoveBall()
    {
        if (x<radius|| x>getWidth()-radius)
            dx*=-1;
        if (y<radius||y>getHeight()-radius)
            dy*=-1;
        x+=dx;
        y+=dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    }

}


