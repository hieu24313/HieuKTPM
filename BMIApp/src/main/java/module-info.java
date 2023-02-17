module com.lth.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lth.bmiapp to javafx.fxml;
    exports com.lth.bmiapp;
}
