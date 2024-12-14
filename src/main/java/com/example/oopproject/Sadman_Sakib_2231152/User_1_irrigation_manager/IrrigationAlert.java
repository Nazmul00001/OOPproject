package com.example.oopproject.Sadman_Sakib_2231152.User_1_irrigation_manager;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class IrrigationAlert {

    private final StringProperty soilMoisture;
    private final StringProperty temperature;
    private final StringProperty humidity;
    private final StringProperty windSpeed;
    private final StringProperty date;

    public IrrigationAlert(String soilMoisture, String temperature, String humidity, String windSpeed, String date) {
        this.soilMoisture = new SimpleStringProperty(soilMoisture);
        this.temperature = new SimpleStringProperty(temperature);
        this.humidity = new SimpleStringProperty(humidity);
        this.windSpeed = new SimpleStringProperty(windSpeed);
        this.date = new SimpleStringProperty(date.toString());  // convert LocalDate to String
    }

    // Getters for each property
    public StringProperty soilMoistureProperty() {
        return soilMoisture;
    }

    public StringProperty temperatureProperty() {
        return temperature;
    }

    public StringProperty humidityProperty() {
        return humidity;
    }

    public StringProperty windSpeedProperty() {
        return windSpeed;
    }

    public StringProperty dateProperty() {
        return date;
    }
}
