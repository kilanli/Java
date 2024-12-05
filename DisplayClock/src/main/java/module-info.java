module com.example.displayclock {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.displayclock to javafx.fxml;
    exports com.example.displayclock;
}