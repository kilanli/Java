module com.example.csvdenokuma {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.csvdenokuma to javafx.fxml;
    exports com.example.csvdenokuma;
}