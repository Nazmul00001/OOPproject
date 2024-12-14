package com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class WaterUsageAnalysisController_1_3
{
    @javafx.fxml.FXML
    private PieChart waterUsageByZoneChart;
    @javafx.fxml.FXML
    private PieChart waterUsageByTimePeriodChart;
    @javafx.fxml.FXML
    private PieChart waterUsageByCropChart;
    @javafx.fxml.FXML
    private TableView detailedWaterUsageTable;
    @javafx.fxml.FXML
    private TextField endDateTextField;
    @javafx.fxml.FXML
    private TextField startDateTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleExportData(ActionEvent actionEvent) {
    }
}