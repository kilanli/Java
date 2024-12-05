package com.example.slayt11_saatyapma;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button btnOk=new Button("OK");
        Button btnCancel=new Button("Cancel");
        Button btnExit=new Button("Exit");

        HBox root=new HBox();
       // HBox root=new HBox(btnOk,btnCancel,btnExit); Bu da kullanılabiliyor
        root.getChildren().add(btnOk);
        root.getChildren().addAll(btnCancel,btnExit);
        Scene scene=new Scene(root,300,200);
        stage.setScene(scene);
        stage.setTitle("Hello World");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}