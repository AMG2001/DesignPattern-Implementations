package tech.amg.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private int currentValues = 0;

    private List<WeatherObserver> observers = new ArrayList<>();

    public int getCurrentValues() {
        return currentValues;
    }

    public void setCurrentValues(int currentValues) {
        this.currentValues = currentValues;
    }

    public void addObserver(WeatherObserver newObserver){
        observers.add(newObserver);
    }

    public void removeObserver(WeatherObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        observers.stream().forEach(observer -> observer.update(getCurrentValues()));
    }

    public void updateDegreeValue(int newValue){
        currentValues = newValue;
        notifyObservers();
    }
}
