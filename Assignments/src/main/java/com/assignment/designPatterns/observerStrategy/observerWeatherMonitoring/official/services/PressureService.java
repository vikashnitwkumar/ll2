package src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.official.services;


import src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.official.Observer;
import src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.official.utils.NotificationUtils;

public class PressureService implements Observer {
    @Override
    public void notifyObserver(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}