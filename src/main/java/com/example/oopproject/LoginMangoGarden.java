package com.example.oopproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class LoginMangoGarden {

    @FXML
    private TextField password;

    @FXML
    private ComboBox<String> combobox;

    @FXML
    private Label label;


    @FXML
    public void initialize() {

        combobox.getItems().addAll("irrigation_manager", "Pest_Control_Manager", "Gardener"," ");
        combobox.setPromptText("Select User");
    }

    @FXML
    private void Login(ActionEvent event) {

        String enteredPassword = password.getText();


        String selectedRole = combobox.getValue();


        if (enteredPassword.isEmpty() || selectedRole == null) {
            label.setText("Please enter password and select a role.");
            return;
        }


        try {

            if (enteredPassword.equals("12345") && selectedRole.equals("irrigation_manager")) {
                label.setText("Login successful as Admin.");
                switchScene("Sadman_Sakib_2231152/Dashbord for User_1.fxml", event);
            }

            else if (enteredPassword.equals("12345") && selectedRole.equals("Pest_Control_Manager")) {
                label.setText("Login successful as Irrigation Specialist.");
                switchScene("Sadman_Sakib_2231152/Dashbord for user_2.fxml", event);
            }

            else if (enteredPassword.equals("gardener") && selectedRole.equals("Gardener")) {
                label.setText("Login successful as Gardener.");
                switchScene("GardenerDashboard.fxml", event);
            }


            else {
                label.setText("Invalid credentials. Try again.");
            }
        } catch (Exception e) {
            label.setText("Error: Unable to load the scene.");
        }
    }

    private void switchScene(String fxmlFile, ActionEvent event) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        AnchorPane root = loader.load();


        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(root);
        currentStage.setScene(newScene);


        currentStage.show();
    }
}
