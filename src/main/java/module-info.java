module com.example.javafxweatherapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxweatherapp to javafx.fxml;
    exports com.example.javafxweatherapp;
}