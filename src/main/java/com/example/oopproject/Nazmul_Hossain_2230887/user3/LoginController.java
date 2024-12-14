package com.example.oopproject.Nazmul_Hossain_2230887.user3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;

    @FXML
    public void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (validateCredentials(username, password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
    }

    private boolean validateCredentials(String username, String password) {
        return username.equals("admin") && password.equals("password");
    }
}
