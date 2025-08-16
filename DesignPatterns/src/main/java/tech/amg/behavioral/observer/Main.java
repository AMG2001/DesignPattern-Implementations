package tech.amg.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        MobileDevice mobileDevice = new MobileDevice();
        AndroidScreen androidScreen = new AndroidScreen();
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(mobileDevice);
        weatherStation.addObserver(androidScreen);
        weatherStation.updateDegreeValue(15);
    }
}
