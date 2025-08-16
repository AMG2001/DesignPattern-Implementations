package tech.amg.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject {
    private int currentValues = 0;

    private List<WeatherObserver> observers = new ArrayList<>();

    public int getCurrentValues() {
        return currentValues;
    }

    public void setCurrentValues(int currentValues) {
        this.currentValues = currentValues;
    }

    @Override
    public void attach(WeatherObserver newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void detach(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        observers.stream().forEach(observer -> observer.update(getCurrentValues()));
    }

    public void updateDegreeValue(int newValue){
        currentValues = newValue;
        notifyObservers();
    }
}
