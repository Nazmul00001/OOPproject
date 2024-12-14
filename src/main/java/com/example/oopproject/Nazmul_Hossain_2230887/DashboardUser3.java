package com.example.oopproject.Nazmul_Hossain_2230887;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class DashboardUser3 {

    @FXML
    private ComboBox<String> comboboxforgoals;

    @FXML
    private Button viewButton;

    @FXML
    private Button backButton;

    // Map to hold ComboBox items and their corresponding FXML paths
    private final Map<String, String> sceneMap = new HashMap<>();

    private Stage stage;
    private Scene previousScene;

    @FXML
    public void initialize() {
        // Populate ComboBox with updated goals
        comboboxforgoals.getItems().addAll(
                "Goal 1: Ensure Optimal Farm Productivity",
                "Goal 2: Manage Workforce Effectively",
                "Goal 3: Monitor Financial Health",
                "Goal 4: Plan for Future Expansion",
                "Goal 5: Ensure Compliance with Regulatory Standards",
                "Goal 6: Manage Inventory",
                "Goal 7: Coordinate with Buyers",
                "Goal 8: Handle Emergency Situations"
        );

        // Map ComboBox selections to corresponding FXML file paths
        sceneMap.put("Goal 1: Ensure Optimal Farm Productivity", "/com/example/oopproject/Nazmul_Hossain_2230887/user3/OptimalFarmProductivity.fxml");
        sceneMap.put("Goal 2: Manage Workforce Effectively", "/com/example/oopproject/Nazmul_Hossain_2230887/user3/ManageWorkforce.fxml");
        sceneMap.put("Goal 3: Monitor Financial Health", "/com/example/oopproject/Nazmul_Hossain_2230887/user3/MonitorFinancialHealth.fxml");
        sceneMap.put("Goal 4: Plan for Future Expansion", "/com/example/oopproject/Nazmul_Hossain_2230887/user3/PlanForFutureExpansion.fxml");
        sceneMap.put("Goal 5: Ensure Compliance with Regulatory Standards", "/com/example/oopproject/Nazmul_Hossain_2230887/user3/ComplianceDashboard.fxml");
        sceneMap.put("Goal 6: Manage Inventory", "/com/example/oopproject/Nazmul_Hossain_2230887/user3/InventoryManagement.fxml");
        sceneMap.put("Goal 7: Coordinate with Buyers", "/com/example/oopproject/Nazmul_Hossain_2230887/user3/OrderManagement.fxml");
        sceneMap.put("Goal 8: Handle Emergency Situations", "/com/example/oopproject/Nazmul_Hossain_2230887/user3/EmergencyManagement.fxml");
    }

    @FXML
    public void view(Event event) {
        String selectedGoal = comboboxforgoals.getSelectionModel().getSelectedItem();

        if (selectedGoal == null) {
            System.out.println("Please select a goal to view.");
            return;
        }

        String scenePath = sceneMap.get(selectedGoal);

        if (scenePath != null) {
            switchScene(scenePath);
        } else {
            System.out.println("Scene path not found for: " + selectedGoal);
        }
    }

    // Method to handle scene switching
    private void switchScene(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Scene newScene = new Scene(loader.load());

            // Store the current scene to go back to
            if (stage == null) {
                stage = (Stage) viewButton.getScene().getWindow();
            }
            previousScene = stage.getScene();

            // Set the new scene
            stage.setScene(newScene);
            stage.show();

        } catch (IOException e) {
            System.err.println("Error loading scene: " + fxmlPath);
            e.printStackTrace();
        }
    }

    @FXML
    public void goBack(Event event) {
        if (previousScene != null) {
            stage.setScene(previousScene);
        } else {
            System.out.println("No previous scene to go back to.");
        }
    }
}
