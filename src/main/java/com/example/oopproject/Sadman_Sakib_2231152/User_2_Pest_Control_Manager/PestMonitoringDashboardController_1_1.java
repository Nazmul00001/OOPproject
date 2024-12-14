package com.example.oopproject.Sadman_Sakib_2231152.User_2_Pest_Control_Manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class PestMonitoringDashboardController_1_1
{
    @javafx.fxml.FXML
    private TableView pestTreatmentTable;
    @javafx.fxml.FXML
    private LineChart pestPopulationChart;
    @javafx.fxml.FXML
    private TableColumn severityColumn;
    @javafx.fxml.FXML
    private NumberAxis yAxis;
    @javafx.fxml.FXML
    private NumberAxis xAxis;
    @javafx.fxml.FXML
    private TableColumn pestColumn;
    @javafx.fxml.FXML
    private TableColumn recommendationColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void manualPestControlButton(ActionEvent actionEvent) {
        try {
            // Load the FXML file for the "Manual Pest Control" scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PestIdentification_1_2.fxml"));
            Parent root = loader.load();

            // Get the current stage from the action event source
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle any errors (e.g., FXML file not found)
        }
    }
}