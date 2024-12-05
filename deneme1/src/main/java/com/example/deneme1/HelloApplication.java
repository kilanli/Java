package com.example.deneme1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application  {
    @Override
    public void start(Stage stage)  throws Exception {
        /*
        Pane pane=new Pane();
        Circle circle=new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
        Scene scene=new Scene(pane,200,200);
        stage.setTitle("Show Circle Centered");
        stage.setScene(scene);
        stage.show();
*/ /*
        Label label1=new Label("Hello");
        Scene scene=new Scene(label1,640,480);
        stage.setScene(scene);
        stage.show();*/
        /*
        VBox vb=new VBox();
        Scene scene=new Scene(vb,100,100);
        stage.setScene(scene);
        stage.show();
        */
        /*
        Pane pane=new Pane();
        Text text1=new Text(20,20,"BZ 214 Visual Programming");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC,15));
        pane.getChildren().add(text1);
        Text text2=new Text(60,60,"BZ 214 Visual Programming \n Display text ");
        pane.getChildren().add(text2);
        Text text3=new Text(10 , 100 , "BZ 214 Visual Programming \nDisplay text ");
        text3.setFill(Color.RED);
        text3.setUnderline(true); text3.setStrikethrough(true);
        pane.getChildren().add(text3);
        stage.setScene(new Scene(pane));
        stage.show();
        */
        /*
        Rectangle r1=new Rectangle(25,10,60,30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        Rectangle r2 = new Rectangle (25 , 50 , 60 , 30);
        Rectangle r3 = new Rectangle (25 , 90 , 60 , 30);
        r3 . setArcWidth (15);
        r3 . setArcHeight (25);
        Group grup=new Group();
        grup.getChildren().addAll(new Text(10,27,"r1"),r1,new Text(10,67,"r2"),r2,new Text(10,107,"r3"),r3);
        Scene scene=new Scene(grup,640,480);
        stage.setScene(scene);
        stage.show();
*/
        Arc arc1=new Arc(150,100,80,80,30,55);
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);
        Arc arc2=new Arc(150,100,80,80,120,80);
        arc2.setFill(Color.WHITE);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLACK);
        Group grup=new Group(arc1,arc2);
        Scene scene=new Scene(grup,640,480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}