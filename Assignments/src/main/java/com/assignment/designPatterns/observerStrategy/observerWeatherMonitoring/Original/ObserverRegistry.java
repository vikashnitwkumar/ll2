package src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.Original;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(double value);
}