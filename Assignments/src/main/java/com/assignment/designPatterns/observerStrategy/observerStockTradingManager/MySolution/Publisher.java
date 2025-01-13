package src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.MySolution;

public abstract class Publisher {
  public abstract void addObserver(Observer observer);
  public abstract void removeObserver(Observer observer);
}