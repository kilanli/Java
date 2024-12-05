package com.example.slayt12;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rectangle = new Rectangle (0 , 0 , 25 , 50);
        Circle circle = new Circle (125 , 100 , 50);
        PathTransition pt = new PathTransition ();
        pt . setDuration ( Duration . millis (4000));
        pt . setPath ( circle ); pt . setNode ( rectangle );
        pt . setOrientation ( PathTransition . OrientationType . ORTHOGONAL_TO_TANGENT );
        pt . setCycleCount ( Timeline . INDEFINITE ); pt . setAutoReverse ( true );
        pt . play ();
        Pane root=new Pane();
        Scene scene=new Scene(root,400,400);
        stage.setScene(scene);
        root.getChildren().addAll( rectangle,circle);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
