module com.example.gogym {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gogym to javafx.fxml;
    exports com.example.gogym;
}