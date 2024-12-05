package com.example.slayt13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXControls extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane=new BorderPane();
        Text text=new Text(50,50,"BZ214 Visual Programming");
        Pane paneText=new Pane();
        paneText.getChildren().add(text);
        pane.setCenter(paneText);






        Button btn1=new Button("Left",new ImageView("file:resource/indir.png"));
        Button btn2=new Button("Right",new ImageView("file:resource/right-arrow_27a1-fe0f.png"));
        HBox paneButton=new HBox();
        paneButton.getChildren().addAll(btn1,btn2);
        paneButton.setAlignment(Pos.CENTER);
        paneButton.setSpacing(10);
        paneButton.setStyle("-fx-border-color: green");
        pane.setBottom(paneButton);
        btn1.setOnAction(event-> text.setX(text.getX()-10));
        btn2.setOnAction(event-> text.setX(text.getX()+10));


        VBox panecheck=new VBox();
        pane.setRight(panecheck);
        CheckBox checkBold=new CheckBox("Bold");
        CheckBox checkItalic=new CheckBox("Italic");
        panecheck.setSpacing(10);
        panecheck.setPadding(new Insets(5,5,5,5));
        panecheck.setStyle("-fx-border-color: green");
        panecheck.getChildren().addAll(checkBold,checkItalic);


        EventHandler<ActionEvent> checkHandler=event->{
            if (checkBold.isSelected()&& checkItalic.isSelected())
            text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC,12));
            else if (checkBold.isSelected())
                text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR,12));
            else if (checkItalic.isSelected())
                text.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.ITALIC,12));
            else
                text.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR,12));
        };
        checkBold.setOnAction(checkHandler);
        checkItalic.setOnAction(checkHandler);

        VBox paneRadio=new VBox();
        paneRadio.setSpacing(10);
        paneRadio.setPadding(new Insets(5,5,5,5));
        paneRadio.setStyle("-fx-border-color: green");
        RadioButton rbBlue=new RadioButton("Blue");
        RadioButton rbRed=new RadioButton("Red");
        RadioButton rbGreen=new RadioButton("Green");
        paneRadio.getChildren().addAll(rbBlue,rbGreen,rbRed);
        pane.setLeft(paneRadio);

        ToggleGroup group=new ToggleGroup();
        rbBlue.setToggleGroup(group);
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setOnAction(event->{
            if (rbBlue.isSelected())
                text.setFill(Color.BLUE);
        });
        rbRed.setOnAction(event->{
            if (rbRed.isSelected())
                text.setFill(Color.RED);
        });
        rbGreen.setOnAction(event->{
            if (rbGreen.isSelected())
                text.setFill(Color.GREEN);
        });


        Scene scene=new Scene(pane,640,480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
