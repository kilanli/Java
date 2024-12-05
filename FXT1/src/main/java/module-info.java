module com.example.fxt1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.fxt1 to javafx.fxml;
    exports com.example.fxt1;
}