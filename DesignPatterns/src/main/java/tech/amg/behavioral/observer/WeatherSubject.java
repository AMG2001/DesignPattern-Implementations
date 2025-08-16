package tech.amg.behavioral.observer;

public interface WeatherSubject {
    void attach(WeatherObserver observer);
    void detach(WeatherObserver observer);
    void notifyObservers();
}
