package src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.official;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(double value) {
        observers.forEach(observer -> observer.notifyObserver(value));
    }
}