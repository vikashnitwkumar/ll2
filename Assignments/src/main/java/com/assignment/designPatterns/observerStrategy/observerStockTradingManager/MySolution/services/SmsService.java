package src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.MySolution.services;


import src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.MySolution.Observer;
import src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.MySolution.utils.NotificationUtils;

public class SmsService implements Observer {
    private String stockName;
    private double price;
    @Override
    public void update(String stockName, double price) {
       this.stockName = stockName;
       this.price = price;
    }
    public void sendNotification() {
        String subject = "Price update for " + stockName;
        String message = "New price is " + price;
        NotificationUtils.sendSms(subject, message);
    }
}