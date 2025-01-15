package src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.officials;

public interface Observer {
    void notifyObserver(String stockName, double currentPrice);
}