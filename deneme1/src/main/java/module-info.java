module com.example.deneme1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.deneme1 to javafx.fxml;
    exports com.example.deneme1;
}