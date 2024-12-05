package com.example.deneme;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelToRectangles {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\aferd\\OneDrive\\Masaüstü\\java proje\\imdb_top_250 (1).csv");
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0); // assuming there is only one sheet

        int numRows = sheet.getLastRowNum();
        int numCols = sheet.getRow(0).getLastCellNum();

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                Cell cell = sheet.getRow(row).getCell(col);
                double value = cell.getNumericCellValue();

                Rectangle rect = new Rectangle(50, 50, Color.WHITE);
                rect.setStroke(Color.BLACK);
                rect.setFill(Color.color(value, value, value)); // use cell value to set color
                // add rectangle to JavaFX scene
            }
        }

        workbook.close();
        inputStream.close();
    }
}