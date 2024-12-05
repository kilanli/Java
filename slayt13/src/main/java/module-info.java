module com.example.slayt13 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.slayt13 to javafx.fxml;
    exports com.example.slayt13;
}