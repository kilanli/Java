module com.example.slayt12 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.slayt12 to javafx.fxml;
    exports com.example.slayt12;
}