module com.example.slayt11_saatyapma {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.slayt11_saatyapma to javafx.fxml;
    exports com.example.slayt11_saatyapma;
}