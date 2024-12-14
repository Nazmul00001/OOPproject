package com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class CropGrowthMonitoringController_3_1
{
    @javafx.fxml.FXML
    private LineChart diseaseOutbreaksChart;
    @javafx.fxml.FXML
    private TableView cropMonitoringTable;
    @javafx.fxml.FXML
    private LineChart cropGrowthStagesChart;
    @javafx.fxml.FXML
    private LineChart yieldPredictionsChart;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewReportsButton(ActionEvent actionEvent) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("cropHealthAssessment_3_2.fxml"));
            Parent root = loader.load();

            // Get the current stage from the event source
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Set the new scene
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the error (e.g., show an error dialog)
        }
    }
}