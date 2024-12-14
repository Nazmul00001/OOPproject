package com.example.oopproject.Nazmul_Hossain_2230887.user3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DashboardController {

    @FXML
    private TableView<MetricEntry> cropMetricsTable;

    @FXML
    private TableColumn<MetricEntry, String> Metric;

    @FXML
    private TableColumn<MetricEntry, String> Value;

    @FXML
    private ComboBox<String> cropSelector;

    private final ObservableList<MetricEntry> metrics = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        cropSelector.getItems().addAll("Amrupali", "Gopalbogh", "Langda", "Fazlee");
        Metric.setCellValueFactory(new PropertyValueFactory<>("metric"));
        Value.setCellValueFactory(new PropertyValueFactory<>("value"));
        cropMetricsTable.setItems(metrics);
        refreshMetrics(null);
    }

    @FXML
    public void refreshMetrics(ActionEvent actionEvent) {
        metrics.clear();
        String selectedCrop = cropSelector.getValue();
        if (selectedCrop == null || selectedCrop.isEmpty()) {
            selectedCrop = "General";
        }
        metrics.addAll(
                new MetricEntry("Yield", "1200 kg/ha"),
                new MetricEntry("Moisture Level", "20%"),
                new MetricEntry("Health Index", "85%")
        );
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static class MetricEntry {
        private final String metric;
        private final String value;

        public MetricEntry(String metric, String value) {
            this.metric = metric;
            this.value = value;
        }

        public String getMetric() {
            return metric;
        }

        public String getValue() {
            return value;
        }
    }
}
