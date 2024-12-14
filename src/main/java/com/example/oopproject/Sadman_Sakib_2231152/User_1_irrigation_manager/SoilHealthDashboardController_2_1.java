package com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class SoilHealthDashboardController_2_1
{
    @javafx.fxml.FXML
    private TableView soilTestResultsTable;
    @javafx.fxml.FXML
    private TableColumn timeColumnNutrientLevels;
    @javafx.fxml.FXML
    private TableColumn pHLevelColumnResults;
    @javafx.fxml.FXML
    private TableColumn testDateColumn;
    @javafx.fxml.FXML
    private TableColumn moistureLevelColumn;
    @javafx.fxml.FXML
    private TableView phTable;
    @javafx.fxml.FXML
    private TableColumn pHLevelColumn;
    @javafx.fxml.FXML
    private TableColumn nutrientLevelsColumnResults;
    @javafx.fxml.FXML
    private TableColumn nutrientLevelsColumn;
    @javafx.fxml.FXML
    private TableColumn timeColumnPH;
    @javafx.fxml.FXML
    private TableColumn moistureLevelColumnResults;
    @javafx.fxml.FXML
    private TableColumn timeColumnSoilMoisture;
    @javafx.fxml.FXML
    private TableView soilMoistureTable;
    @javafx.fxml.FXML
    private TableView nutrientLevelsTable;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @FXML
    public void viewReportsButton() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SoilSampling_2_2.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}