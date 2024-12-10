module com.example.oopproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.oopproject to javafx.fxml;
    exports com.example.oopproject;
    opens com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager to javafx.fxml;
    exports com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager;
    opens com.example.oopproject.Sadman_Sakib_2231152.User_2_Pest_Control_Manager to javafx.fxml;
    exports com.example.oopproject.Sadman_Sakib_2231152.User_2_Pest_Control_Manager;
}