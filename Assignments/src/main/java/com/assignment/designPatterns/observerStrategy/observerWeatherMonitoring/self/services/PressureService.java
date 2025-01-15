package src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.self.services;

import src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.self.*;
import src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.self.utils.NotificationUtils;

public class PressureService implements Observer {
    public void trigger(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}