package src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.Original.services;


import src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.self.utils.NotificationUtils;


public class HumidityService {
    public void trigger(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}