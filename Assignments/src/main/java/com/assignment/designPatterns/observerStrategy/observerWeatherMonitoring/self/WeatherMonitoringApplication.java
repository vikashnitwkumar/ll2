package src.main.java.com.assignment.designPatterns.observerStrategy.observerWeatherMonitoring.self;

public class WeatherMonitoringApplication extends Publisher  {

    private double temperature;
    private double humidity;
    private double pressure;
    private double temperatureThreshold;
    private double humidityThreshold;
    private double pressureThreshold;

   
    // DO NOT MODIFY THIS CONSTRUCTOR
    public WeatherMonitoringApplication(double initialTemperature, double initialHumidity, double initialPressure,
                                        double temperatureThreshold, double humidityThreshold, double pressureThreshold) {
        this.temperature = initialTemperature;
        this.humidity = initialHumidity;
        this.pressure = initialPressure;
        this.temperatureThreshold = temperatureThreshold;
        this.humidityThreshold = humidityThreshold;
        this.pressureThreshold = pressureThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

    public void updateWeatherConditions(double newTemperature, double newHumidity, double newPressure) {
        temperature = newTemperature;
        humidity = newHumidity;
        pressure = newPressure;

        // if (temperature > temperatureThreshold) {
        //     updateTempratureObservers(temperature);
        // }

        // if (humidity > humidityThreshold) {
        //     updateHumidityeObservers(humidity);
        // }

        // if (pressure > pressureThreshold) {
        //     updatePressureObservers(pressure);
        // }
    }

    @Override
    public void notifyObservers(double value) {
        if (value > temperatureThreshold) {
            updateTempratureObservers(value);
            updateHumidityeObservers(value);
            updatePressureObservers(value);
        }

        // if (humidity > humidityThreshold) {
        //     updateHumidityeObservers(humidity);
        // }

        // if (pressure > pressureThreshold) {
        //     updatePressureObservers(pressure);
        // }
    }


 
}