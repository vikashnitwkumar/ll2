package src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.original.services;

import src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.original.utils.NotificationUtils;

public class AppService {
    public void sendPush(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }
}