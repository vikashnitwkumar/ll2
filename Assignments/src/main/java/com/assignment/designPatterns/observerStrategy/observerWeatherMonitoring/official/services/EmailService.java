package src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.official.services;

import src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.official.Observer;
import src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.official.utils.NotificationUtils;


public class EmailService implements Observer {
    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendEmail(subject, message);
    }
}