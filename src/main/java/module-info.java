module com.example.oopproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.oopproject to javafx.fxml;
    exports com.example.oopproject;
}