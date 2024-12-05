module com.example.dosyadanokuma {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.dosyadanokuma to javafx.fxml;
    exports com.example.dosyadanokuma;
}