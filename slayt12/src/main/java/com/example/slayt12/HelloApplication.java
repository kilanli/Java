package com.example.slayt12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Label lbl;
    @Override
    public void start(Stage stage) throws IOException {

        /*
        VBox vb=new VBox();
        Button btn=new Button("Random Color");
         lbl=new Label("BZ 214 Visual Programming");
        vb.setPadding(new Insets(10) );
        vb.setSpacing(10);
        vb.setAlignment(Pos.TOP_CENTER);
         lbl.setFont(Font.font(24));

         ClickHandler handler=new ClickHandler();
         btn.setOnAction(handler);

        Scene scene=new Scene(vb,640,480);
        vb.getChildren().addAll(btn,lbl);
        stage.setTitle("Color Changer");
        stage.setScene(scene);
        stage.show();



*/

    }
    /*
    class ClickHandler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent actionEvent) {
            int red= (int) (Math.random()*256);
            int green= (int) (Math.random()*256);
            int blue= (int) (Math.random()*256);
            Color customColor= Color.rgb(red, green, blue);
            lbl.setTextFill(customColor);
        }

    }*/

    public static void main(String[] args) {
        launch();
    }
}

