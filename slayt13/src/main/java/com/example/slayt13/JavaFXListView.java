package com.example.slayt13;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXListView extends Application {
    private String[] departments={"Bilgisayar","Elektronik","Makina","Endüstri"};
    private ImageView[] logos={
            new ImageView("https://bm.erciyes.edu.tr/upload/ZTCPD1Beru_bilgisayar_muhendisligi_logo.png"),
            new ImageView("https://em.erciyes.edu.tr/upload/IUZ0E8Yeru_eletrik_elektronik_muhendisligi-42-yil.jpg"),
             new ImageView("https://me.erciyes.edu.tr/upload/2CYIM6327sidi6eru_makina_muhendisligi.png"),
             new ImageView("https://endustri.erciyes.edu.tr/upload/M0PH4BOeru_endustri_muhendisligi.png")
    };

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root=new BorderPane();

        ListView<String > lv=new ListView<>(FXCollections.observableArrayList(departments));
        lv.setPrefSize(100,400);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        FlowPane paneImage=new FlowPane();
        root.setCenter(paneImage);
        lv.getSelectionModel().selectedItemProperty().addListener(ov->{
            paneImage.getChildren().clear();
            for (Integer index:lv.getSelectionModel().getSelectedIndices())
            {
                logos[index].setPreserveRatio(true);
                logos[index].setFitHeight(75);
                paneImage.getChildren().add(logos[index]);
            }
        });

        root.setLeft(new ScrollPane(lv));
        Scene scene=new Scene(root,640,480);
        stage.setScene(scene);
        stage.setTitle("List View");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
