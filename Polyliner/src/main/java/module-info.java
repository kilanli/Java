module com.example.polyliner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.polyliner to javafx.fxml;
    exports com.example.polyliner;
}