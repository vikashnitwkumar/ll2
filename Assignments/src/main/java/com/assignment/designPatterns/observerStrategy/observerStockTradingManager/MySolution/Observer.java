package src.main.java.com.assignment.designPatterns.observerStrategy.observerStockTradingManager.MySolution;

public interface Observer {
   void update( String stockName , double price);
   void sendNotification();
}