package com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import java.io.IOException;


public class IrrigationSchedulingController_1_2
{
    @javafx.fxml.FXML
    private DatePicker endTimePicker;
    @javafx.fxml.FXML
    private DatePicker startTimePicker;
    @javafx.fxml.FXML
    private Slider waterApplicationRateSlider;
    @javafx.fxml.FXML
    private Slider durationSlider;
    @javafx.fxml.FXML
    private ComboBox irrigationMethodComboBox;
    @javafx.fxml.FXML
    private ComboBox irrigationZoneComboBox;
    @javafx.fxml.FXML
    private ComboBox cropTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void deleteButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void editButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Dashboard(ActionEvent actionEvent) {
        try {
            // Load the FXML file for the Dashboard
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/oopproject/Sadman_Sakib_2231152/User_1_irrigation_manager/DashboardController_1_1.fxml"));
            Scene dashboardScene = new Scene(fxmlLoader.load());

            // Get the current stage (window) and set the new scene
            Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(dashboardScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}