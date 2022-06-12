module com.app.tt2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.app.tt2 to javafx.fxml;
    exports com.app.tt2;
}
