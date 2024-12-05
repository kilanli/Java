package com.example.dosyadanokuma;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class HelloApplication extends Application {
    private static final String CSV_FILE_PATH = "D:\\Javaa\\dosyadanokuma\\src\\dosya.csv";
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("CSV Reader");
        HBox root=new HBox();
        root.setSpacing(10);
        try{BufferedReader br=new BufferedReader(new FileReader(CSV_FILE_PATH));
        String line;
        while ((line= br.readLine())!=null)
        {
            String[] data=line.split(";");

            if (data.length==3)
            {
                String category=data[0].trim();
                int width = Integer.parseInt(data[1].trim());
                int height = Integer.parseInt(data[2].trim());

                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setFill(getColorForCategory(category));

                root.getChildren().add(rectangle);
            }
        }
        }catch (IOException e)
        {
        e.printStackTrace();
        }

        Scene scene=new Scene(root,640,480);
        stage.setScene(scene);
        stage.show();
    }
    private Color getColorForCategory(String category) {
        // Define the colors for each category
        Map<String, Color> categoryColors = new HashMap<>();
        categoryColors.put("Category1", Color.RED);
        categoryColors.put("Category2", Color.GREEN);
        categoryColors.put("Category3", Color.BLUE);
        categoryColors.put("Category4", Color.YELLOW);
        categoryColors.put("Category5", Color.ORANGE);
        categoryColors.put("Category6", Color.PURPLE);

        // Return the color for the given category, or a default color if it's not found
        return categoryColors.getOrDefault(category, Color.GRAY);
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}