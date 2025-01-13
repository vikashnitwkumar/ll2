package src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.MySolution;

import java.util.ArrayList;
import java.util.List;

public class StockTradingManager extends Publisher{

    private String stockName;
    private double currentPrice;
    private double notificationThreshold;
    List<Observer> observers = new ArrayList();
    // DO NOT MODIFY THIS CONSTRUCTOR
    public StockTradingManager(String stockName, double initialPrice, double notificationThreshold) {
        this.stockName = stockName;
        this.currentPrice = initialPrice;
        this.notificationThreshold = notificationThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

    public void updateStockPrice(double newPrice) {
        currentPrice = newPrice;
        if (currentPrice > notificationThreshold) {
           for(Observer observer: observers){
               observer.update(stockName, newPrice);
               observer.sendNotification();
           }
        }
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

}