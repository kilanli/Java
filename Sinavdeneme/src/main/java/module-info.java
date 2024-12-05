module com.example.sinavdeneme {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.sinavdeneme to javafx.fxml;
    exports com.example.sinavdeneme;
}