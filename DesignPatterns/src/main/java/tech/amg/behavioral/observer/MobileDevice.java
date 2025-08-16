package tech.amg.behavioral.observer;

public class MobileDevice implements WeatherObserver{
    @Override
    public void update(int newVal) {
        System.out.println("Mobile device updated with new value : "+newVal);
    }
}
