package src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.original.services;

import src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.original.utils.NotificationUtils;

public class EmailService {
    public void sendEmail(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendEmail(subject, message);
    }
}