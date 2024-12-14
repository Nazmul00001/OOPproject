package com.example.oopproject.Sadman_Sakib_2231152;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DashbordForUserController {

    @FXML
    private ComboBox<String> comboboxforgoal;

    @FXML
    private Button viewButton;

    @FXML
    public void initialize() {

        comboboxforgoal.getItems().addAll("1.Dashboard Controller", "2.soil Health Dashboard", "3.crop Growth Dashboard", "4.fertilizer Management", "5.workforce Management", "6.environmental Impact Dashboard", "7.financial Dashboard", "8.operational Efficiency Dashboard");
    }

    @FXML
    public void view(Event event) {

        String selectedGoal = comboboxforgoal.getSelectionModel().getSelectedItem();

        if (selectedGoal != null) {


            Map<String, String> sceneMap = new HashMap<>();
            sceneMap.put("1.Dashboard Controller", "/com/example/oopproject/Sadman_Sakib_2231152/User_1_irrigation_manager/DashboardController_1_1.fxml");
            sceneMap.put("2.soil Health Dashboard", "/com/example/oopproject/Sadman_Sakib_2231152/User_1_irrigation_manager/soilHealthDashboard_2_1.fxml");
            sceneMap.put("3.crop Growth Dashboard", "/com/example/oopproject/Sadman_Sakib_2231152/User_1_irrigation_manager/cropGrowthDashboard_3_1.fxml");
            sceneMap.put("4.fertilizer Management", "/com/example/oopproject/Sadman_Sakib_2231152/User_1_irrigation_manager/fertilizerManagement_4_1.fxml");
            sceneMap.put("5.workforce Management", "/com/example/oopproject/Sadman_Sakib_2231152/User_1_irrigation_manager/workforceManagement_5_1.fxml");
            sceneMap.put("6.environmental Impact Dashboard", "/com/example/oopproject/Sadman_Sakib_2231152/User_1_irrigation_manager/environmentalImpactDashboard_6.fxml");
            sceneMap.put("7.financial Dashboard", "/com/example/oopproject/Sadman_Sakib_2231152/User_1_irrigation_manager/financialDashboard_7.fxml");
            sceneMap.put("8.operational Efficiency Dashboard", "/com/example/oopproject/Sadman_Sakib_2231152/User_1_irrigation_manager/operationalEfficiencyDashboard_8.fxml");


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
