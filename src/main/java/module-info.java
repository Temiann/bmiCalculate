module com.example.num0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.num0 to javafx.fxml;
    exports com.example.num0;
    exports com.example.num0.model;
    opens com.example.num0.model to javafx.fxml;
}