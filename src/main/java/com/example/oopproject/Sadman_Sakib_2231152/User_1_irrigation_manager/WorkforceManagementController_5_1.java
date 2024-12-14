package com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkforceManagementController_5_1
{
    @javafx.fxml.FXML
    private TextField laborHoursTextField;
    @javafx.fxml.FXML
    private TextField taskAssignmentsTextField;
    @javafx.fxml.FXML
    private TableView workforceScheduleTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportsButton(ActionEvent actionEvent) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("resourceAllocation_5_2.fxml"));
            Parent root = loader.load();


            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();


            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @javafx.fxml.FXML
    public void assignTasksButton(ActionEvent actionEvent) {
    }
}