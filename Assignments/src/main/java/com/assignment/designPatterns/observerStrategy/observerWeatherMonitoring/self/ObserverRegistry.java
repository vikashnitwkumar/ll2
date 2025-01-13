package src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.self;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(double value);
}