package src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.original;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String stockName, double currentPrice);
}