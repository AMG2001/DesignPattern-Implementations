package tech.amg.behavioral.observer;

public class AndroidScreen implements WeatherObserver{
    @Override
    public void update(int newVal) {
        System.out.println("AndroidScreen display new value : "+newVal);
    }
}
