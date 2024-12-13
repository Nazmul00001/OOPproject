package com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class DashboardController_1_1 {

    @FXML
    private TableView<IrrigationAlert> alertsTable;
    @FXML
    private TextField soilMoisture;
    @FXML
    private TextField temperature;
    @FXML
    private TextField humidity;
    @FXML
    private TextField windSpeed;
    @FXML
    private TableColumn<IrrigationAlert, String> date;
    @FXML
    private TableColumn<IrrigationAlert, String> humidity2;
    @FXML
    private TableColumn<IrrigationAlert, String> windSpeed2;
    @FXML
    private TableColumn<IrrigationAlert, String> soilmoisture2;
    @FXML
    private TableColumn<IrrigationAlert, String> temperature2;
    @FXML
    private DatePicker datePicker;

    private final ObservableList<IrrigationAlert> alertDataList = FXCollections.observableArrayList();


    @FXML
    public void initialize() {

        soilmoisture2.setCellValueFactory(new PropertyValueFactory<>("soilMoisture"));
        temperature2.setCellValueFactory(new PropertyValueFactory<>("temperature"));
        humidity2.setCellValueFactory(new PropertyValueFactory<>("humidity"));
        windSpeed2.setCellValueFactory(new PropertyValueFactory<>("windSpeed"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));

        alertsTable.setItems(alertDataList);
    }



    @FXML
    public void savadata(ActionEvent actionEvent) {
        // Validate inputs
        if (soilMoisture.getText().isEmpty() || temperature.getText().isEmpty() ||
                humidity.getText().isEmpty() || windSpeed.getText().isEmpty() || datePicker.getValue() == null) {
            showAlert(AlertType.WARNING, "Input Error", "All fields must be filled.");
            return;
        }


        IrrigationAlert newData = new IrrigationAlert(
                soilMoisture.getText(),
                temperature.getText(),
                humidity.getText(),
                windSpeed.getText(),
                datePicker.getValue()
        );


        alertDataList.add(newData);


        soilMoisture.clear();
        temperature.clear();
        humidity.clear();
        windSpeed.clear();
        datePicker.setValue(null);
    }


    private void showAlert(AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    @FXML
    public void irrigationScheduling(ActionEvent actionEvent) {
        switchScene(actionEvent, "irrigationScheduling_1_2.fxml");
    }


    @FXML
    public void waterUsageAnalysis(ActionEvent actionEvent) {
        switchScene(actionEvent, "waterUsageAnalysis_1_3.fxml");
    }


    @FXML
    public void equipmentMaintenance(ActionEvent actionEvent) {
        switchScene(actionEvent, "equipmentMaintenance_1_4.fxml");
    }


    private void switchScene(ActionEvent actionEvent, String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane newScene = loader.load();
            Scene scene = new Scene(newScene);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            showAlert(AlertType.ERROR, "Scene Switch Error", "Failed to load the scene.");
        }
    }
}
