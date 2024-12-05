package com.example.slayt12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BallAnimation extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BallPane ball=new BallPane();
        Scene scene=new Scene(ball,640,480);
        stage.setScene(scene);
        stage.show();
    }
}
