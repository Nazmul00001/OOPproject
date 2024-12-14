package com.example.oopproject.Nazmul_Hossain_2230887.user4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CropObservationPageController {

    @FXML
    private ComboBox<String> cropSelection;

    @FXML
    private TextArea cropObservations;

    @FXML
    private TableView<ObservationLog> observationLogsTable;

    @FXML
    private TableColumn<ObservationLog, String> Observation;

    @FXML
    private TableColumn<ObservationLog, String> Date;

    private final ObservableList<ObservationLog> observationLogs = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize ComboBox with crop options
        cropSelection.getItems().addAll("Lengra", "Alfonso", "Fazli", "Amrupali");

        // Configure TableView columns
        Date.setCellValueFactory(new PropertyValueFactory<>("date"));
        Observation.setCellValueFactory(new PropertyValueFactory<>("observation"));

        // Bind data to TableView
        observationLogsTable.setItems(observationLogs);
    }

    @FXML
    public void submitObservations(ActionEvent actionEvent) {
        String selectedCrop = cropSelection.getValue();
        String observationText = cropObservations.getText();

        // Validate inputs
        if (selectedCrop == null || selectedCrop.isEmpty()) {
            showAlert("Error", "Please select a crop or plot.");
            return;
        }

        if (observationText == null || observationText.isEmpty()) {
            showAlert("Error", "Please enter crop observations.");
            return;
        }

        // Get the current date
        String currentDate = java.time.LocalDate.now().toString();

        // Add a new log entry
        ObservationLog log = new ObservationLog(currentDate, observationText);
        observationLogs.add(log);

        // Clear the input field
        cropObservations.clear();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    // Inner class to represent observation logs
    public static class ObservationLog {
        private final String date;
        private final String observation;

        public ObservationLog(String date, String observation) {
            this.date = date;
            this.observation = observation;
        }

        public String getDate() {
            return date;
        }

        public String getObservation() {
            return observation;
        }
    }
}
