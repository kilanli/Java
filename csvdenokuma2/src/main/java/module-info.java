module com.example.csvdenokuma2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.csvdenokuma2 to javafx.fxml;
    exports com.example.csvdenokuma2;
}