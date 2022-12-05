module com.monster2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.monster2 to javafx.fxml;
    exports com.monster2;
}
