module com.example.oopproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.oopproject to javafx.fxml;
    exports com.example.oopproject;
    opens com.example.oopproject.Nazmul_Hossain_2230887_controler.user3 to javafx.fxml;
    exports com.example.oopproject.Nazmul_Hossain_2230887_controler.user3;
    opens com.example.oopproject.Nazmul_Hossain_2230887_controler.user4 to javafx.fxml;
    exports com.example.oopproject.Nazmul_Hossain_2230887_controler.user4;
}