package com.example.displayclock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ClockPane clock=new ClockPane();
        BorderPane root=new BorderPane();
        root.setCenter(clock);
        Scene scene=new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("Analog Clock");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
