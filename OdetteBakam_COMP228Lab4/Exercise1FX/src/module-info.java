module com.exercise1.exercise1fx {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.exercise1.exercise1fx;
    opens com.exercise1.exercise1fx to javafx.fxml;
}