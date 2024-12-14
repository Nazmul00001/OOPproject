package com.example.oopproject.Sadman_Sakib_2231152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DashbordForUser2Controller {

    @FXML
    private ComboBox<String> comboboxforgoal;

    @FXML
    private Button viewButton;

    @FXML
    public void initialize() {
        comboboxforgoal.getItems().addAll(
                "1.Pest Monitoring Dashboard",
                "2.Pest Control Planning",
                "3.Pest Control Data Analysis",
                "4.Pesticide Usage Tracking",
                "5.IPM Planning",
                "6.Environmental Impact Dashboard",
                "7.Workforce Management",
                "8.Financial Dashboard"
        );
    }

    @FXML
    public void view(ActionEvent event) {
        String selectedGoal = comboboxforgoal.getSelectionModel().getSelectedItem();

        if (selectedGoal != null) {
            Map<String, String> sceneMap = new HashMap<>();
            sceneMap.put("1.Pest Monitoring Dashboard", "/com/example/oopproject/Sadman_Sakib_2231152/User_2_Pest_Control_Manager/PestMonitoringDashboard_1_1.fxml");
            sceneMap.put("2.Pest Control Planning", "/com/example/oopproject/Sadman_Sakib_2231152/User_2_Pest_Control_Manager/PestControlPlanning_2_1.fxml");
            sceneMap.put("3.Pest Control Data Analysis", "/com/example/oopproject/Sadman_Sakib_2231152/User_2_Pest_Control_Manager/PestControlDataAnalysis_3.fxml");
            sceneMap.put("4.Pesticide Usage Tracking", "/com/example/oopproject/Sadman_Sakib_2231152/User_2_Pest_Control_Manager/PesticideUsageTracking_4.fxml");
            sceneMap.put("5.IPM Planning", "/com/example/oopproject/Sadman_Sakib_2231152/User_2_Pest_Control_Manager/IPMPlanning_5.fxml");
            sceneMap.put("6.Environmental Impact Dashboard", "/com/example/oopproject/Sadman_Sakib_2231152/User_2_Pest_Control_Manager/EnvironmentalImpactDashboard_6.fxml");
            sceneMap.put("7.Workforce Management", "/com/example/oopproject/Sadman_Sakib_2231152/User_2_Pest_Control_Manager/WorkforceManagement_7_1.fxml");
            sceneMap.put("8.Financial Dashboard", "/com/example/oopproject/Sadman_Sakib_2231152/User_2_Pest_Control_Manager/FinancialDashboard_8.fxml");

            String scenePath = sceneMap.get(selectedGoal);

            if (scenePath != null) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource(scenePath));
                    Scene newScene = new Scene(loader.load());
                    Stage stage = (Stage) viewButton.getScene().getWindow();
                    stage.setScene(newScene);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Scene path not found for " + selectedGoal);
            }
        } else {
            System.out.println("Please select a goal.");
        }
    }
}
