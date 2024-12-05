package com.example.slayt12;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.*;

public class CircleController extends Application {
    public void start(Stage stage) throws Exception {
        Pane root=new Pane();
        Circle circle=new Circle(100,100,50);
        circle.setFill(BLUE);
        circle.setFocusTraversable(true);

        circle.setOnMouseClicked(event->circle.requestFocus());



        circle.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                circle.setCenterX(mouseEvent.getX());
                circle.setCenterY(mouseEvent.getY());

            }
            
        });
        circle.setOnKeyPressed((KeyEvent event)->
        {
            switch (event.getCode())
            {
                case UP :circle.setCenterY(circle.getCenterY()-10); break;
                case DOWN:circle.setCenterY(circle.getCenterY()+10); break;
                case RIGHT:circle.setCenterX(circle.getCenterX()+10); break;
                case LEFT:circle.setCenterX(circle.getCenterX()-10); break;
            }
        });
        
        root.getChildren().addAll(circle);
        Scene scene=new Scene(root,640,480);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Daire");
    }

    public static void main(String[] args) {
        launch();
    }
}
