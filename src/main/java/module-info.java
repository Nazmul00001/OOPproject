module com.example.oopproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;





    opens com.example.oopproject to javafx.fxml;
    exports com.example.oopproject;
    opens com.example.oopproject.Sadman_Sakib_2231152 to javafx.fxml;
    exports com.example.oopproject.Sadman_Sakib_2231152;
    opens com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager to javafx.fxml;
    exports com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager;
    opens com.example.oopproject.Sadman_Sakib_2231152.User_2_Pest_Control_Manager to javafx.fxml;
    exports com.example.oopproject.Sadman_Sakib_2231152.User_2_Pest_Control_Manager;
    opens com.example.oopproject.Nazmul_Hossain_2230887 to javafx.fxml;
    exports com.example.oopproject.Nazmul_Hossain_2230887;
    opens com.example.oopproject.Nazmul_Hossain_2230887.user3 to javafx.fxml;
    exports com.example.oopproject.Nazmul_Hossain_2230887.user3;
    opens com.example.oopproject.Nazmul_Hossain_2230887.user4 to javafx.fxml;
    exports com.example.oopproject.Nazmul_Hossain_2230887.user4;
}