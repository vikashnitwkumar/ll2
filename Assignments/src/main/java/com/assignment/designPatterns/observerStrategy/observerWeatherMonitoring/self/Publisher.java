package src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.self;

import java.util.ArrayList;
import java.util.List;

import com.assignment.question.services.HumidityService;
import com.assignment.question.services.PressureService;
import com.assignment.question.services.TemperatureService;

public abstract class Publisher implements ObserverRegistry{
    List<Observer> humidityObserver = new ArrayList<>();
    List<Observer> tempratureObserver = new ArrayList<>();
    List<Observer> pressureObserver = new ArrayList<>();
    public void addObserver(Observer observer){
        if(observer.getClass() == HumidityService.class){
            humidityObserver.add(observer);
        }
        else if(observer.getClass() == TemperatureService.class){
            tempratureObserver.add(observer);
        }
        else if(observer.getClass() == PressureService.class){
            tempratureObserver.add(observer);
        }
    }

    public void removeObserver(Observer observer){
        if(humidityObserver.contains(observer)) humidityObserver.remove(observer);
        if(tempratureObserver.contains(observer)) tempratureObserver.remove(observer);
        if(pressureObserver.contains(observer)) pressureObserver.remove(observer);
    }

    
    public void updateTempratureObservers(double newTemperature){
        for (Observer observer : tempratureObserver) {
            observer.trigger(newTemperature);
        }
    }
    public void updateHumidityeObservers(double newHumidity){
        for (Observer observer : humidityObserver) {
            observer.trigger(newHumidity);
        }
    }
    public void updatePressureObservers( double newPressure){
        for (Observer observer : pressureObserver) {
            observer.trigger(newPressure);
        }
    }
  
}