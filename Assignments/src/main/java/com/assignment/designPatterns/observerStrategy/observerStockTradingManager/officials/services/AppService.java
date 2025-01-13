package src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.officials.services;

import src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.officials.Observer;
import src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.officials.utils.NotificationUtils;

public class AppService implements Observer {
    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }
}